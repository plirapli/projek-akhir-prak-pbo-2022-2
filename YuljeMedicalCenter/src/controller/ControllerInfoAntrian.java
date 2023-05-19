/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOAntrian;
import dao.DAODokter;
import dao.DAOInfoAntrian;
import dao.DAORiwayatAntrian;
import dao_interface.InterfaceAntrian;
import dao_interface.InterfaceDokter;
import dao_interface.InterfaceInfoAntrian;
import dao_interface.InterfaceRiwayatAntrian;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelAntrian;
import model.ModelInfoAntrian;
import model.ModelRiwayatAntrian;
import model.TableModelInfoAntrian;
import view.ViewAntrian;
import view.ViewAntrianPublik;

/**
 *
 * @author Muhammad Rafli
 */
public class ControllerInfoAntrian {

    ViewAntrian view;
    InterfaceInfoAntrian implementInfoAntrian;
    InterfaceAntrian implementAntrian;
    InterfaceRiwayatAntrian implementRiwayatAntrian;
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
        view.getMaxAntrian();
    }

    public void updateDataReset() {
        // Ngambil data dari form trus masukkin ke model
        ModelInfoAntrian antrian = new ModelInfoAntrian();
        antrian.setId_nomor_antrian(view.getSelectedId_nomor_antrian());
        antrian.setNomor(0);

        // Masukkin model tadi ke db
        implementInfoAntrian.update(antrian);
        view.getNomorAntrian().setText("0");
        view.getMaxAntrian();
    }

    public void updateAntrian() {
        // Mengambil nama dokter & id_user berdasarkan id yang lagi diselect
        implementAntrian = new DAOAntrian();
        int id_dokter = view.getSelectedId_dokter();
        int nomor_antrian = Integer.parseInt(view.getNomorAntrian().getText()) + 1;
        ModelAntrian antrian = implementAntrian.getByID(id_dokter, nomor_antrian);

        // Masukkin data ke riwayat antrian
        implementRiwayatAntrian = new DAORiwayatAntrian();
        ModelRiwayatAntrian riwayatAntrian = new ModelRiwayatAntrian();
        riwayatAntrian.setDokter(antrian.getDokter());
        riwayatAntrian.setId_user(antrian.getId_user());
        implementRiwayatAntrian.insert(riwayatAntrian);

        // Hapus data yang ada di antrian
        int id_antrian = antrian.getId_antrian();
        implementAntrian.delete(id_antrian);
    }

    public void selectField(int row) {
        view.setSelectedId_nomor_antrian(listInfoAntrian.get(row).getId_nomor_antrian());
        view.setSelectedId_dokter(listInfoAntrian.get(row).getId_dokter());
        view.getNamaDokter().setText(listInfoAntrian.get(row).getNama_dokter());
        view.getNomorAntrian().setText(listInfoAntrian.get(row).getNomor().toString());
        view.getMaxAntrian();
    }

    // Untuk mengecek nomor antrian yang paling besar di list antrian
    public int checkMaxAntrian() {
        int id_dokter = view.getSelectedId_dokter();
        return implementInfoAntrian.getMaxAntrian(id_dokter);
    }
}
