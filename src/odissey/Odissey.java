/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odissey;

/**
 *
 * @author maesly
 */

import odissey.VentanaPrincipal;
public class Odissey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setBounds(250, 0, 550, 475);
        ventana.setResizable(false);
        ventana.setVisible(true);
        
    }
    
}
