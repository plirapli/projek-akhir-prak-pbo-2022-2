/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao_interface;

import java.util.List;
import model.Dokter;

/**
 *
 * @author Yudha
 */
public interface InterfaceDokter {

    public List<Dokter> getAll();

    public void insert(Dokter dokter);
}