/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAODokter;
import dao_interface.InterfaceDokter;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelDokter;
import model.TableModelDokter;
import view.ViewDokter;

/**
 *
 * @author Yudha
 */
public class ControllerDokter {

    ViewDokter viewDokter;
    InterfaceDokter interfaceDokter;
    List<ModelDokter> listDokter;

    public ControllerDokter(ViewDokter viewDokter) {
        this.viewDokter = viewDokter;
        interfaceDokter = new DAODokter();
    }

    public void readData() {
        listDokter = interfaceDokter.getAll();
        TableModelDokter tabeldokter = new TableModelDokter(listDokter);
        viewDokter.getTabelData().setModel(tabeldokter);
    }

    public void insertData() {
        // mengambil data dari form dan masukkin ke db
        ModelDokter dokter = new ModelDokter();
        dokter.setNama(viewDokter.getNamaData().getText());
        dokter.setSpesialis(viewDokter.getSpesialisasiData().getText());
        interfaceDokter.insert(dokter);
        JOptionPane.showMessageDialog(null, "Berhasil menambahkan " + dokter.getNama() + " ke dalam daftar.");
    }

    public void selectField(int row) {
        viewDokter.getNamaData().setText(listDokter.get(row).getNama());
        viewDokter.getSpesialisasiData().setText(listDokter.get(row).getSpesialis());
        viewDokter.getId_dokterData().setText(listDokter.get(row).getId_dokter().toString());
    }

    public void updateData() {
        // mengambil data dari form dan masukkin ke db
        ModelDokter dokter = new ModelDokter();
        dokter.setNama(viewDokter.getNamaData().getText());
        dokter.setSpesialis(viewDokter.getSpesialisasiData().getText());
        dokter.setId_dokter(Integer.parseInt(viewDokter.getId_dokterData().getText()));

        interfaceDokter.update(dokter);
        JOptionPane.showMessageDialog(null, "Update Success");
    }

    public void reset() {
        viewDokter.getNamaData().setText("");
        viewDokter.getSpesialisasiData().setText("");
        viewDokter.getId_dokterData().setText("");

    }

    public void deleteData() {
        ModelDokter dokter = new ModelDokter();

        interfaceDokter.delete(Integer.parseInt(viewDokter.getId_dokterData().getText()));
        JOptionPane.showMessageDialog(null, "Delete Data Success");
    }
}
