/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Muhammad Rafli
 */
public class TableModelInfoAntrian extends AbstractTableModel {

    List<ModelInfoAntrian> listInfoAntrian;

    public TableModelInfoAntrian(List<ModelInfoAntrian> listInfoAntrian) {
        this.listInfoAntrian = listInfoAntrian;
    }

    @Override
    public int getRowCount() {
        return listInfoAntrian.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Nomor Antrian";
            case 1:
                return "Dokter";
            case 2:
                return "Nomor Antrian";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listInfoAntrian.get(rowIndex).getId_nomor_antrian();
            case 1:
                return listInfoAntrian.get(rowIndex).getNama_dokter();
            case 2:
                return listInfoAntrian.get(rowIndex).getNomor();
            default:
                return null;
        }
    }
}
