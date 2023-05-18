/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao_interface.InterfaceInfoAntrian;
import helper.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ModelInfoAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public class DAOInfoAntrian implements InterfaceInfoAntrian {

    public DAOInfoAntrian() {
        connect = Connector.getConnection();
    }

    @Override
    public List<ModelInfoAntrian> getAll() {
        List<ModelInfoAntrian> listInfoAntrian = null;
        try {
            listInfoAntrian = new ArrayList<>();
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(getAll);

            while (resultSet.next()) {
                ModelInfoAntrian antrian = new ModelInfoAntrian();
                antrian.setId_nomor_antrian(resultSet.getInt("id"));
                antrian.setId_dokter(resultSet.getInt("id_dokter"));
                antrian.setNama_dokter(resultSet.getString("dokter"));
                antrian.setNomor(resultSet.getInt("nomor"));
                listInfoAntrian.add(antrian);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return listInfoAntrian;
    }

    @Override
    public void update(ModelInfoAntrian antrian) {
        PreparedStatement statement = null;
        try {
            statement = connect.prepareStatement(updateById);
            statement.setInt(1, antrian.getNomor());
            statement.setInt(2, antrian.getId_nomor_antrian());
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Update Failed! (" + e.getMessage() + ")");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Update Failed! (" + ex.getMessage() + ")");
            }
        }
    }
    
    @Override
    public int getMaxAntrian(int id_dokter) {
        int maxNumber = 0;
        try {
            PreparedStatement statement = connect.prepareStatement(getMax);
            statement.setInt(1, id_dokter);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                maxNumber = resultSet.getInt("nomor");
            }
        } catch (SQLException e) {
            System.out.println("Error GetMax: " + e.getMessage());
        }
        return maxNumber;
    }

    Connection connect;
    // SQL Queries
    final String getAll
        = "SELECT id_nomor_antrian AS id, d.id_dokter AS id_dokter, d.nama AS dokter, nomor "
        + "FROM nomor_antrian na "
        + "INNER JOIN dokter d ON na.id_dokter = d.id_dokter;";

    final String updateById
        = "UPDATE nomor_antrian "
        + "SET nomor=? "
        + "WHERE id_nomor_antrian=?;";
    
    final String getMax
        = "SELECT MAX(nomor_antrian) AS nomor "
        + "FROM antrian "
        + "WHERE id_dokter=?;";
}
