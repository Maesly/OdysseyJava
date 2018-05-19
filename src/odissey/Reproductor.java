/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odissey;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author maesly
 */
public class Reproductor {
     FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    
    public void stop(){
       if(player != null){
           player.close();
       }
    }
    public void Play(String path){
        try{
        FIS = new FileInputStream(path);
        BIS = new BufferedInputStream(FIS);
        
        player = new Player(BIS);
        player.play();
        
    }catch(FileNotFoundException | JavaLayerException ex){
    
    }
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                
                }
            }
        }){
        
        };
    
               
    }
    
}
