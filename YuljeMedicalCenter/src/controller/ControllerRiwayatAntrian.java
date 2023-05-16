/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAORiwayatAntrian;
import dao_interface.InterfaceRiwayatAntrian;
import java.util.List;
import model.ModelRiwayatAntrian;
import model.TableModelRiwayatAntrian;
import view.ViewRiwayatAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public class ControllerRiwayatAntrian {

    ViewRiwayatAntrian view;
    InterfaceRiwayatAntrian implement;
    List<ModelRiwayatAntrian> list;

    public ControllerRiwayatAntrian(ViewRiwayatAntrian view) {
        this.view = view;
        implement = new DAORiwayatAntrian();
    }

    public void getAll() {
        list = implement.getAll();
        TableModelRiwayatAntrian table = new TableModelRiwayatAntrian(list);
        view.getTableData().setModel(table);
    }
}
