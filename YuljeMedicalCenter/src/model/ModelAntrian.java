/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Muhammad Rafli
 */
public class ModelAntrian {

    private Integer id_user, nomor_rm, nomor_antrian;
    private String dokter, pasien;

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getNomor_rm() {
        return nomor_rm;
    }

    public void setNomor_rm(Integer nomor_rm) {
        this.nomor_rm = nomor_rm;
    }

    public Integer getNomor_antrian() {
        return nomor_antrian;
    }

    public void setNomor_antrian(Integer nomor_antrian) {
        this.nomor_antrian = nomor_antrian;
    }

    public String getDokter() {
        return dokter;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

    public String getPasien() {
        return pasien;
    }

    public void setPasien(String pasien) {
        this.pasien = pasien;
    }
}
