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

    private Integer id_nomor_antrian, id_dokter, nomor;
    private String nama_dokter;

    public Integer getId_nomor_antrian() {
        return id_nomor_antrian;
    }

    public void setId_nomor_antrian(Integer id_nomor_antrian) {
        this.id_nomor_antrian = id_nomor_antrian;
    }

    public Integer getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(Integer id_dokter) {
        this.id_dokter = id_dokter;
    }
    
    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public Integer getNomor() {
        return nomor;
    }

    public void setNomor(Integer nomor) {
        this.nomor = nomor;
    }
}
