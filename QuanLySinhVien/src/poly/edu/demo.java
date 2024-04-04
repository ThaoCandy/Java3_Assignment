/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poly.edu;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import poly.edu.view.View_Login;

/**
 *
 * @author user
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatArcOrangeIJTheme.setup();
        new View_Login().setVisible(true);
    }
    
}
