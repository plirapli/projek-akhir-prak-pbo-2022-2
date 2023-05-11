/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInteface.InterfaceDokter;
import helper.Connector;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import model.Dokter;

/**
 *
 * @author Yudha
 */
public class DAODokter implements InterfaceDokter {
    
    public DAODokter(){
        con = Connector.getConnection();
    }
    
    @Override
    public List<Dokter> getAll() {
       List<Dokter> listDokter = null;
       try{
           listDokter = new ArrayList<Dokter>();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(read);
           while(rs.next()){
           Dokter dktr = new Dokter();
           dktr.setId_dokter(rs.getInt("id_dokter"));
           dktr.setNama(rs.getString("nama"));
           dktr.setSpesialis(rs.getString("spesialisasi"));
           listDokter.add(dktr);
           }
           
       }catch(SQLException e){
           System.out.println("Error : "+ e);
       }
       return listDokter;
    }
    
    Connection con;
    String read = "SELECT * FROM Dokter;";
    
    
    
    
    
    
    
}
