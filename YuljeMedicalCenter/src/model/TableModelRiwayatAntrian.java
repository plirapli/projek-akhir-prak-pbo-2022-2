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
public class TableModelRiwayatAntrian extends AbstractTableModel {

    List<ModelRiwayatAntrian> listRiwayatAntrian;

    public TableModelRiwayatAntrian(List<ModelRiwayatAntrian> listRiwayatAntrian) {
        this.listRiwayatAntrian = listRiwayatAntrian;
    }

    @Override
    public int getRowCount() {
        System.out.println(listRiwayatAntrian.size());
        return listRiwayatAntrian.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No.";
            case 1:
                return "No. RM";
            case 2:
                return "Pasien";
            case 3:
                return "Dokter";
            case 4:
                return "Tanggal";
            case 5:
                return "Jam";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 ->
                rowIndex + 1;
            case 1 ->
                listRiwayatAntrian.get(rowIndex).getNo_rm();
            case 2 ->
                listRiwayatAntrian.get(rowIndex).getPasien();
            case 3 ->
                listRiwayatAntrian.get(rowIndex).getDokter();
            case 4 ->
                listRiwayatAntrian.get(rowIndex).getDate();
            case 5 ->
                listRiwayatAntrian.get(rowIndex).getTime();
            default ->
                null;
        };
    }
}
