/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAODokter;
import DAOInteface.InterfaceDokter;
import java.util.List;
import model.Dokter;
import model.TableModelDokter;
import view.ViewDokter;

/**
 *
 * @author Yudha
 */
public class ControllerDokter {
    ViewDokter viewDokter;
    InterfaceDokter Idokter;
    List<Dokter> listDokter;
    
    
    
    
    public ControllerDokter(ViewDokter viewDokter){
        this.viewDokter = viewDokter;
        Idokter = new DAODokter();
     
        
    }
    
    public void isiTable(){
        listDokter = Idokter.getAll();
        TableModelDokter tabeldokter = new TableModelDokter(listDokter);
        viewDokter.getTabelData().setModel(tabeldokter);
        
    }
    
}