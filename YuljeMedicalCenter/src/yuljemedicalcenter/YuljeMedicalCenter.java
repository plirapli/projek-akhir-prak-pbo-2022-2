/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yuljemedicalcenter;

import helper.LookAndFeel;
import view.ViewAntrianPublik;
import view.ViewMainMenu;

/**
 *
 * @author Muhammad Rafli
 */
public class YuljeMedicalCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LookAndFeel();
        new ViewMainMenu();
    }
    
    public static ViewAntrianPublik viewAntrianPublik = new ViewAntrianPublik();
}
