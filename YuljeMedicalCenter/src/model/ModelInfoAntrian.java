/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Muhammad Rafli
 */
public class ModelInfoAntrian {

    private Integer id_nomor_antrian, nomor;
    private String nama_dokter;

    public Integer getId_nomor_antrian() {
        return id_nomor_antrian;
    }

    public void setId_nomor_antrian(Integer id_nomor_antrian) {
        this.id_nomor_antrian = id_nomor_antrian;
    }

    public Integer getNomor() {
        return nomor;
    }

    public void setNomor(Integer nomor) {
        this.nomor = nomor;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }
}
