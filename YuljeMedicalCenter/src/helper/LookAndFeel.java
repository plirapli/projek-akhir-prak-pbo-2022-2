/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import view.ViewAntrian;

/**
 *
 * @author Muhammad Rafli
 */
public class LookAndFeel {

    public LookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel(new FlatLightLaf());
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
