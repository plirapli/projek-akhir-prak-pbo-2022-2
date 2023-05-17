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
import view.ViewAntrianPublik;

/**
 *
 * @author Muhammad Rafli
 */
public class ControllerAntrianPublik {

    ViewAntrianPublik view;
    InterfaceInfoAntrian implementInfoAntrian;
    List<ModelInfoAntrian> listInfoAntrian;

    public ControllerAntrianPublik(ViewAntrianPublik view) {
        this.view = view;
        implementInfoAntrian = new DAOInfoAntrian();
    }

    public void getAll() {
        listInfoAntrian = implementInfoAntrian.getAll();
        TableModelInfoAntrian tableInfoAntrian = new TableModelInfoAntrian(listInfoAntrian);
        view.getTableData().setModel(tableInfoAntrian);

        // Nyembunyiin kolom id_dokter
        view.getTableData().getColumnModel().getColumn(0).setMinWidth(0);
        view.getTableData().getColumnModel().getColumn(0).setMaxWidth(0);
    }
}
