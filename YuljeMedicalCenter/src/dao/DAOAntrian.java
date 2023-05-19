/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao_interface.InterfaceAntrian;
import helper.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ModelAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public class DAOAntrian implements InterfaceAntrian {

    public DAOAntrian() {
        connect = Connector.getConnection();
    }

    @Override
    public List<ModelAntrian> getAll() {
        List<ModelAntrian> listAntrian = null;
        try {
            listAntrian = new ArrayList<>();
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(getAll);

            while (resultSet.next()) {
                ModelAntrian antrian = new ModelAntrian();
                antrian.setDokter(resultSet.getString("Dokter"));
                antrian.setPasien(resultSet.getString("Pasien"));
                antrian.setNomor_rm(resultSet.getInt("No. RM"));
                antrian.setNomor_antrian(resultSet.getInt("Antrian"));
                listAntrian.add(antrian);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return listAntrian;
    }

    @Override
    public ModelAntrian getByID(int id_dokter, int nomor_antrian) {
        ModelAntrian antrian = new ModelAntrian();
        try {
            PreparedStatement statement = connect.prepareStatement(getByID);
            statement.setInt(1, id_dokter);
            statement.setInt(2, nomor_antrian);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                antrian.setId_user(resultSet.getInt("user"));
                antrian.setDokter(resultSet.getString("nama_dokter"));
            }
        } catch (SQLException e) {
            System.out.println("Error (GET Nama Dokter): " + e.getMessage());
        }
        return antrian;
    }

    Connection connect;
    // SQL Query
    final String getAll
        = "SELECT d.nama AS Dokter, u.nama AS Pasien, u.no_rm AS \"No. RM\", nomor_antrian AS Antrian "
        + "FROM antrian a "
        + "INNER JOIN user u ON a.id_user=u.id_user "
        + "INNER JOIN dokter d ON a.id_dokter=d.id_dokter;";

    final String getByID
        = "SELECT d.nama AS nama_dokter, a.id_user AS user "
        + "FROM antrian a "
        + "INNER JOIN dokter d ON a.id_dokter=d.id_dokter "
        + "WHERE a.id_dokter=? && nomor_antrian=?;";
}
