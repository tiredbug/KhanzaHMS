/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package khanzahms;

import usu.widget.util.WidgetUtilities;

/**
 *
 * @author igos
 */
public class KhanzaHMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       WidgetUtilities.invokeLater(() -> {
           frmUtama utama=frmUtama.getInstance();
           utama.isWall();
           //utama.setIconImage(new javax.swing.ImageIcon( getClass(). getResource("/picture/home.PNG")).getImage());
           utama.setVisible(true);
       });
    }
    
}
