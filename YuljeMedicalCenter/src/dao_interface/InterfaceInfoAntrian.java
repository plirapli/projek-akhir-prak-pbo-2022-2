/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao_interface;

import java.util.List;
import model.ModelInfoAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public interface InterfaceInfoAntrian {
    public List<ModelInfoAntrian> getAll();
    
    public void update (ModelInfoAntrian antrian);
    
    public int getMaxAntrian(int id);
}
