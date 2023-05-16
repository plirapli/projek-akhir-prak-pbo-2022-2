/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao_interface.InterfaceInfoAntrian;
import helper.Connector;
import java.sql.Connection;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Connection connect;
    // SQL Query
    final String getAll
        = "SELECT id_nomor_antrian AS id, d.nama AS \"dokter\", nomor\n"
        + "FROM nomor_antrian na\n"
        + "INNER JOIN dokter d ON na.id_dokter = d.id_dokter;";
}