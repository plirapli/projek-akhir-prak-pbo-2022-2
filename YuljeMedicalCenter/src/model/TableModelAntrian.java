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
public class TableModelAntrian extends AbstractTableModel {

    List<ModelAntrian> listAntrian;

    public TableModelAntrian(List<ModelAntrian> listAntrian) {
        this.listAntrian = listAntrian;
    }

    @Override
    public int getRowCount() {
        return listAntrian.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No.";
            case 1:
                return "Dokter";
            case 2:
                return "Pasien";
            case 3:
                return "Nomor RM";
            case 4:
                return "Nomor Antrian";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex;
            case 1:
                return listAntrian.get(rowIndex).getDokter();
            case 2:
                return listAntrian.get(rowIndex).getPasien();
            case 3:
                return listAntrian.get(rowIndex).getNomor_rm();
            case 4:
                return listAntrian.get(rowIndex).getNomor_antrian();
            default:
                return null;
        }
    }

}
