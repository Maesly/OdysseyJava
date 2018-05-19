/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odissey;
import Algoritmos.*;

/**
 *
 * @author maesly
 */
public class DatosInterfaz {
    
    String ordenarPor = "";
    String[] canciones =  {"lola","australia"};
    boolean play = false, atras = false, adelante = false;
    
    
    public void getOrdenarPor(String ordenar){
        this.ordenarPor = ordenar;
        if(ordenarPor == "Artista"){
            RadixSort_1 radixSort_1 = new RadixSort_1();
            radixSort_1.menu(canciones);
            System.out.println("Ordenado con RadixSort");
        }else{
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.menuBubble(canciones);
            System.out.println("Ordenado con BubbleSort");
            
        }
        
    }
    
    public void imprimirDatos(){
        System.out.println("Ordenar por nombre de " + ordenarPor);
    }
    
    public void setPlay(boolean play){
        this.play = play;
    }
    
    public void setAtras(boolean atras){
        this.atras = atras;
    }
    
    public void setAdelante(boolean adelante){
        this.adelante = adelante;
    }
    
    
    
}
