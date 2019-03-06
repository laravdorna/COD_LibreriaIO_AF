/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_libreriaio;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class WindDialogo  extends Dialogo {

    @Override
    public void mostrar(String msg) {
        JOptionPane.showInputDialog(msg);
    }
    
}