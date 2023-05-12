/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao_interface;

import java.util.List;
import model.ModelDokter;

/**
 *
 * @author Yudha
 */
public interface InterfaceDokter {

    public List<ModelDokter> getAll();

    public void insert(ModelDokter dokter);
}
