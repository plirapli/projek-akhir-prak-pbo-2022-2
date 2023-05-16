/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOAntrian;
import dao_interface.InterfaceAntrian;
import java.util.List;
import model.ModelAntrian;
import model.TableModelAntrian;
import view.ViewAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public class ControllerAntrian {

    ViewAntrian view;
    InterfaceAntrian implementAntrian;
    List<ModelAntrian> listAntrian;

    public ControllerAntrian(ViewAntrian view) {
        this.view = view;
        implementAntrian = new DAOAntrian();
    }

    public void getAll() {
        listAntrian = implementAntrian.getAll();
        TableModelAntrian tableAntrian = new TableModelAntrian(listAntrian);
        view.getTableAntrianData().setModel(tableAntrian);
    }
}
