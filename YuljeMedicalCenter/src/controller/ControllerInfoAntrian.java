/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOInfoAntrian;
import dao_interface.InterfaceInfoAntrian;
import java.util.List;
import model.ModelInfoAntrian;
import model.TableModelInfoAntrian;
import view.ViewAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public class ControllerInfoAntrian {

    ViewAntrian view;
    InterfaceInfoAntrian implementInfoAntrian;
    List<ModelInfoAntrian> listInfoAntrian;

    public ControllerInfoAntrian(ViewAntrian view) {
        this.view = view;
        implementInfoAntrian = new DAOInfoAntrian();
    }

    public void readAllData() {
        listInfoAntrian = implementInfoAntrian.getAll();
        TableModelInfoAntrian tableInfoAntrian = new TableModelInfoAntrian(listInfoAntrian);
        view.getTableInfoAntrianData().setModel(tableInfoAntrian); // Masukkin data ke table
    }

    public void updateDataSelesai() {
        // Ngambil data dari form trus masukkin ke model
        ModelInfoAntrian antrian = new ModelInfoAntrian();
        Integer nomor = Integer.valueOf(view.getNomorAntrian().getText()); // Konversi string pada text nomor ke model
        nomor += 1; // Tambah 1 antrian
        antrian.setId_nomor_antrian(view.getSelectedId_nomor_antrian());
        antrian.setNomor(nomor);

        // Masukkin model tadi ke db
        implementInfoAntrian.update(antrian);
        view.getNomorAntrian().setText(nomor.toString());
    }
    
    public void updateDataReset() {
        // Ngambil data dari form trus masukkin ke model
        ModelInfoAntrian antrian = new ModelInfoAntrian();
        antrian.setId_nomor_antrian(view.getSelectedId_nomor_antrian());
        antrian.setNomor(0);

        // Masukkin model tadi ke db
        implementInfoAntrian.update(antrian);
        view.getNomorAntrian().setText("0");
    }

    public void selectField(int row) {
        view.setSelectedId_nomor_antrian(listInfoAntrian.get(row).getId_nomor_antrian());
        view.getNamaDokter().setText(listInfoAntrian.get(row).getNama_dokter());
        view.getNomorAntrian().setText(listInfoAntrian.get(row).getNomor().toString());
    }
}
