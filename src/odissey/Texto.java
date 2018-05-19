/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odissey;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
/**
 *
 * @author maesly
 */
public class Texto {
    
    public Texto(String fuente, String texto, JLabel label,Color color,int tamano ){
        label.setText(texto);
        label.setForeground(color);
        label.setPreferredSize(new Dimension(300,20));
        label.setFont(new Font(fuente, 1, tamano));
    
    }
    
}
