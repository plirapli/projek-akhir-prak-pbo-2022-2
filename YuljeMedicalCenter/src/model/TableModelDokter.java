/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Yudha
 */
public class TableModelDokter extends AbstractTableModel {

    List<ModelDokter> listDokter;

    public TableModelDokter(List<ModelDokter> listDokter) {
        this.listDokter = listDokter;

    }

    @Override
    public int getRowCount() {
        return this.listDokter.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Dokter";
            case 1:
                return "Nama";
            case 2:
                return "Spesialisasi";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listDokter.get(rowIndex).getId_dokter();
            case 1:
                return listDokter.get(rowIndex).getNama();
            case 2:
                return listDokter.get(rowIndex).getSpesialis();
            default:
                return null;
        }
    }

}
