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
        con = Connector.getConnection();
    }

    // Get all data dokter
    @Override
    public List<ModelDokter> getAll() {
        List<ModelDokter> listDokter = null;

        try {
            listDokter = new ArrayList<ModelDokter>();
            Statement st = con.createStatement();
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

    // Add data dokter
    @Override
    public void insert(ModelDokter b) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(insert);
            statement.setString(1, b.getNama());
            statement.setString(2, b.getSpesialis());
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Input Gagal! (" + e.getMessage() + ")");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Input Gagal!");
            }
        }
    }

    Connection con;
    String read = "SELECT * FROM Dokter;";
    String insert = "INSERT INTO Dokter (nama, spesialisasi) VALUES (?,?);";
}
