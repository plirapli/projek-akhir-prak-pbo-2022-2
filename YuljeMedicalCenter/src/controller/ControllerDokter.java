/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAODokter;
import dao_interface.InterfaceDokter;
import java.util.List;
import javax.swing.JOptionPane;
import model.Dokter;
import model.TableModelDokter;
import view.ViewDokter;

/**
 *
 * @author Yudha
 */
public class ControllerDokter {

    ViewDokter viewDokter;
    InterfaceDokter interfaceDokter;
    List<Dokter> listDokter;

    public ControllerDokter(ViewDokter viewDokter) {
        this.viewDokter = viewDokter;
        interfaceDokter = new DAODokter();

    }

    public void isiTable() {
        listDokter = interfaceDokter.getAll();
        TableModelDokter tabeldokter = new TableModelDokter(listDokter);
        viewDokter.getTabelData().setModel(tabeldokter);

    }

    public void insertData() {
        // Ngambil data dari form
        String nama = viewDokter.getNamaData().getText();
        String spesialisasi = viewDokter.getSpesialisasiData().getText();
        
        // Masukkin ke db
        Dokter dokter = new Dokter();
        dokter.setNama(nama);
        dokter.setSpesialis(spesialisasi);
        interfaceDokter.insert(dokter);
        JOptionPane.showMessageDialog(null, "Berhasil menambahkan " + nama, "Input Berhasil", 1);
    }

}
