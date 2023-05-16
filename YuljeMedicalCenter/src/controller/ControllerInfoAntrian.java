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

    public void getAll() {
        listInfoAntrian = implementInfoAntrian.getAll();
        TableModelInfoAntrian tableInfoAntrian = new TableModelInfoAntrian(listInfoAntrian);
        view.getTableInfoAntrianData().setModel(tableInfoAntrian);
    }
}
