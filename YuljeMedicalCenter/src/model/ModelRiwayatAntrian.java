/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.Month;

/**
 *
 * @author Muhammad Rafli
 */
public class ModelRiwayatAntrian {

    private int no_rm;
    private String pasien, dokter;
    private Timestamp created_at;

    public int getNo_rm() {
        return no_rm;
    }

    public void setNo_rm(int no_rm) {
        this.no_rm = no_rm;
    }

    public String getPasien() {
        return pasien;
    }

    public void setPasien(String pasien) {
        this.pasien = pasien;
    }

    public String getDokter() {
        return dokter;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

    public String getDate() {
        int year = created_at.toLocalDateTime().getYear();
        Month month = created_at.toLocalDateTime().getMonth();
        DayOfWeek day = created_at.toLocalDateTime().getDayOfWeek();
        int tgl = created_at.toLocalDateTime().getDayOfMonth();

        String date = day + ", " + tgl + " " + month + " " + year;
        return date;
    }

    public String getTime() {
        int hour = created_at.toLocalDateTime().getHour();
        int minute = created_at.toLocalDateTime().getMinute();
        int second = created_at.toLocalDateTime().getSecond();

        String waktu = hour + ":" + minute + ":" + second;
        return waktu;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

}
