/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao_interface.InterfaceRiwayatAntrian;
import helper.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ModelRiwayatAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public class DAORiwayatAntrian implements InterfaceRiwayatAntrian {

    public DAORiwayatAntrian() {
        connect = Connector.getConnection();
    }

    @Override
    public List<ModelRiwayatAntrian> getAll() {
        List<ModelRiwayatAntrian> listRiwayatAntrian = null;
        try {
            listRiwayatAntrian = new ArrayList<>();
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(getAll);

            while (resultSet.next()) {
                ModelRiwayatAntrian antrian = new ModelRiwayatAntrian();
                antrian.setDokter(resultSet.getString("dokter"));
                antrian.setPasien(resultSet.getString("pasien"));
                antrian.setNo_rm(resultSet.getInt("no_rm"));
                antrian.setCreated_at(resultSet.getTimestamp("waktu"));
                listRiwayatAntrian.add(antrian);
            }
        } catch (SQLException e) {
            System.out.println("Error (GET): " + e.getMessage());
        }

        return listRiwayatAntrian;
    }

    // Insert data riwayat antrian
    @Override
    public void insert(ModelRiwayatAntrian in) {
        try {
            PreparedStatement statement = null;
            statement = connect.prepareStatement(insert);
            statement.setInt(1, in.getId_user());
            statement.setString(2, in.getDokter());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Insert Failed! (" + e.getMessage() + ")");
        }
    }

    Connection connect;
    // SQL Query
    final String getAll
        = "SELECT no_rm, nama AS pasien, nama_dokter AS dokter, created_at AS waktu "
        + "FROM riwayat_antrian ra "
        + "INNER JOIN user u ON ra.id_user = u.id_user";

    final String insert
        = "INSERT INTO riwayat_antrian (id_user, nama_dokter)"
        + "VALUES (?, ?);";
}
