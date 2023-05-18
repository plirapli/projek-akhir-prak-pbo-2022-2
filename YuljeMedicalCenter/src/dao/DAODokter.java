/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao_interface.InterfaceDokter;
import helper.Connector;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ModelDokter;

/**
 *
 * @author Yudha
 */
public class DAODokter implements InterfaceDokter {

    public DAODokter() {
        connect = Connector.getConnection();
    }

    Connection connect;

    // Queries
    String read = "SELECT * FROM Dokter;";
    String insert = "INSERT INTO Dokter (nama, spesialisasi) VALUES (?,?);";
    String insertInfoAntrian = "INSERT INTO nomor_antrian (id_dokter, nomor) VALUES (?, 0);";
    String update = "UPDATE dokter set nama=?, spesialisasi=? WHERE id_dokter=?;";
    String delete = "DELETE FROM dokter WHERE id_dokter=?;";

    // Get all data dokter
    @Override
    public List<ModelDokter> getAll() {
        List<ModelDokter> listDokter = null;

        try {
            listDokter = new ArrayList<ModelDokter>();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(read);
            while (rs.next()) {
                ModelDokter dokter = new ModelDokter();
                dokter.setId_dokter(rs.getInt("id_dokter"));
                dokter.setNama(rs.getString("nama"));
                dokter.setSpesialis(rs.getString("spesialisasi"));
                listDokter.add(dokter);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listDokter;
    }

    // Insert data dokter
    @Override
    public void insert(ModelDokter in) {
        PreparedStatement statement = null;
        try {
            statement = connect.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, in.getNama());
            statement.setString(2, in.getSpesialis());

            int affectedRows = statement.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1);
                    try {
                        // Insert data baru ke nomor antrian
                        statement = connect.prepareStatement(insertInfoAntrian);
                        statement.setInt(1, generatedId);
                        statement.execute();
                        statement.close();
                    } catch (SQLException e) {
                        System.out.println("Input Failed! (" + e.getMessage() + ")");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Input Failed! (" + e.getMessage() + ")");
        }
    }

    // Update data dokter
    @Override
    public void update(ModelDokter up) {
        PreparedStatement statement = null;
        try {
            statement = connect.prepareStatement(update);
            statement.setString(1, up.getNama());
            statement.setString(2, up.getSpesialis());
            statement.setInt(3, up.getId_dokter());
            statement.execute();
        } catch (SQLException e) {
            System.out.println("update Failed! (" + e.getMessage() + ")");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("update Failed!");
            }
        }
    }

    // Delete data dokter
    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connect.prepareStatement(delete);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Delete Failed! (" + e.getMessage() + ")");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Delete Failed!");
            }
        }
    }
}
