package odissey;
import odissey.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import com.sun.xml.internal.ws.api.addressing.WSEndpointReference.Metadata;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.SliderUI;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import jdk.internal.org.xml.sax.ContentHandler;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;

/**
 *
 * @author maesly
 */
import odissey.DatosInterfaz;

public class VentanaReproductor extends javax.swing.JFrame {
    //variables del programa 
    private Ecualizador_Graphics ecualizador;
    private Map ElementosMap;
    float []eculi = new float[9];
    int E0,E1,E2,E3,E4,E5,E6,E7,E8,E9;
    private Color c = Color.BLACK;
    private final Color c1 = new Color(153,255,153);
    private final Color c2 = new Color(255,255,204);
    private final String fuente1 = "Georgia";
    private final String fuente2 = "Segoe Print";
    private boolean mute = false;
    private boolean bloquear = false;
    private boolean repitaCancion = false;
    private boolean siguiente = false;
    private float balance = 0.5f;
    private float volumenM;
    private float volumen = 0.8f;
     
    private BasicPlayer Audio = new BasicPlayer();
    FileNameExtensionFilter filtrado = new FileNameExtensionFilter("Solo Mp3","mp3","jpg");
    
    private String ruta = "/home/maesly/NetBeansProjects/Odissey/src/Canciones";
    private final JFileChooser abrirFile  = new JFileChooser(new File(ruta));
    
    private File archivo = null;
    private Tag tag;
    private  AudioFile audiofile = new AudioFile();
    
    private String agregaCanciones[]= new String[10];
    private final ArrayList<String> datos = new ArrayList<>();

    Reproductor reproductor = new Reproductor();
    DatosInterfaz datosInterfaz = new DatosInterfaz();
    String[] canciones = {"","",""};
    
    public String[] getArtista(){
        String[] temp= {};
        for (int i = 0; i < canciones.length; i++) {
           temp[i] = agregaCanciones[i]; 
        }
        System.out.println("temp");
        return temp;
    }
    /**
     * Creates new form VentanaReproductor
     */
    public VentanaReproductor() {
        initComponents();
        this.setBounds(250, 100, 1000, 650);
        this.setResizable(false);
        this.setTitle("Odissey++ Reproductor");
        
        E0 = E1 = E2 = E3 = E4 = E5 = E6 = E7 = E8 = E9 = 0;
        ecualizador = new Ecualizador_Graphics(jPanelEcualizador);
        ecualizador.Repintado();
        jlistlistener();
        new Etiquetas(jLabelTitulo,jLabelGenero,jLabelGrupo,jLabelGrupo,jLabelAlbum,ListaCanciones,datos);
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarCancion = new javax.swing.JButton();
        eliminarCancion = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCanciones = new javax.swing.JList<>();
        jPanelBotones = new javax.swing.JPanel();
        jButtonPausa = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonAdelante = new javax.swing.JButton();
        jButtonDetener = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();
        jPanelEcualizador = new javax.swing.JPanel();
        jPanelMetadata = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAlbum = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelGrupo = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelFecha3 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        buscarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/AgregarP.png"))); // NOI18N
        buscarCancion.setContentAreaFilled(false);
        buscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCancionActionPerformed(evt);
            }
        });
        getContentPane().add(buscarCancion);
        buscarCancion.setBounds(270, 300, 50, 40);

        eliminarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BorrarP.png"))); // NOI18N
        eliminarCancion.setContentAreaFilled(false);
        eliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCancionActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCancion);
        eliminarCancion.setBounds(340, 300, 90, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artista ", "Álbum", "Canción " }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 300, 150, 40);

        jSeparator1.setBackground(new java.awt.Color(253, 246, 239));
        jSeparator1.setForeground(new java.awt.Color(253, 239, 239));
        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 36), new java.awt.Color(246, 242, 242))); // NOI18N
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 240, 480, 40);

        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Amigos ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 2, 36), new java.awt.Color(254, 247, 247))); // NOI18N
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(480, 240, 640, 40);

        ListaCanciones.setBackground(new java.awt.Color(118, 118, 118));
        ListaCanciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 39, 96), 3, true));
        jScrollPane1.setViewportView(ListaCanciones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 390, 240);

        jPanelBotones.setBackground(new java.awt.Color(118, 118, 118));
        jPanelBotones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 39, 96), 3, true));
        jPanelBotones.setLayout(null);

        jButtonPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/PausarP.png"))); // NOI18N
        jButtonPausa.setContentAreaFilled(false);
        jButtonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPausaActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonPausa);
        jButtonPausa.setBounds(160, 10, 50, 40);

        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/RetrocesoP.png"))); // NOI18N
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAtras);
        jButtonAtras.setBounds(20, 10, 50, 40);

        jButtonAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/AvanceP.png"))); // NOI18N
        jButtonAdelante.setContentAreaFilled(false);
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAdelante);
        jButtonAdelante.setBounds(210, 10, 50, 40);

        jButtonDetener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/PararP.png"))); // NOI18N
        jButtonDetener.setBorderPainted(false);
        jButtonDetener.setContentAreaFilled(false);
        jButtonDetener.setFocusPainted(false);
        jButtonDetener.setFocusable(false);
        jButtonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetenerActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonDetener);
        jButtonDetener.setBounds(70, 10, 50, 40);

        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/ReproducirP.png"))); // NOI18N
        jButtonPlay.setBorderPainted(false);
        jButtonPlay.setContentAreaFilled(false);
        jButtonPlay.setFocusPainted(false);
        jButtonPlay.setFocusable(false);
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonPlay);
        jButtonPlay.setBounds(110, 10, 60, 40);
        jPanelBotones.add(jLabelImagen);
        jLabelImagen.setBounds(210, 40, 80, 80);

        getContentPane().add(jPanelBotones);
        jPanelBotones.setBounds(360, 30, 300, 180);

        jPanelEcualizador.setBackground(new java.awt.Color(118, 118, 118));
        jPanelEcualizador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 39, 96), 3, true));
        jPanelEcualizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelEcualizadorMouseReleased(evt);
            }
        });
        jPanelEcualizador.setLayout(null);
        getContentPane().add(jPanelEcualizador);
        jPanelEcualizador.setBounds(690, 30, 280, 180);

        jPanelMetadata.setBackground(new java.awt.Color(118, 118, 118));
        jPanelMetadata.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 22, 118), 3, true));
        jPanelMetadata.setLayout(null);

        jLabelTitulo.setForeground(new java.awt.Color(253, 251, 251));
        jLabelTitulo.setText("Canción:");
        jPanelMetadata.add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 10, 290, 18);

        jLabelAlbum.setForeground(new java.awt.Color(253, 251, 251));
        jLabelAlbum.setText("Album:");
        jPanelMetadata.add(jLabelAlbum);
        jLabelAlbum.setBounds(10, 50, 290, 18);

        jLabelGenero.setForeground(new java.awt.Color(253, 251, 251));
        jLabelGenero.setText("Genero:");
        jPanelMetadata.add(jLabelGenero);
        jLabelGenero.setBounds(10, 70, 290, 18);

        jLabelGrupo.setForeground(new java.awt.Color(253, 251, 251));
        jLabelGrupo.setText("Artista/Grupo:");
        jPanelMetadata.add(jLabelGrupo);
        jLabelGrupo.setBounds(10, 30, 290, 18);

        jLabelTotal.setForeground(new java.awt.Color(253, 251, 251));
        jLabelTotal.setText("Total de canciones:");
        jPanelMetadata.add(jLabelTotal);
        jLabelTotal.setBounds(10, 110, 290, 18);

        jLabelFecha3.setForeground(new java.awt.Color(253, 251, 251));
        jLabelFecha3.setText("Fecha:");
        jPanelMetadata.add(jLabelFecha3);
        jLabelFecha3.setBounds(10, 90, 290, 18);

        getContentPane().add(jPanelMetadata);
        jPanelMetadata.setBounds(20, 30, 310, 180);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fa.png"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(-390, -30, 1460, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        // TODO add your handling code here:
        int indice = ListaCanciones.getSelectedIndex();
        String repCancion = ListaCanciones.getSelectedValue();
        
        if(archivo!=null & Audio.getStatus()!=0 & indice!=-1){
            
            String ReproduceCancion = datos.get(indice);
            
            archivo = new File(ReproduceCancion);
            Thread hilo_reproducir = new Thread(new Runnable() {
                @Override
                public void run() {
                    reproductor.Play("/home/maesly/NetBeansProjects/Odissey/src/Canciones/" + repCancion);
                }
            });hilo_reproducir.start();
        }
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdelanteActionPerformed
        // TODO add your handling code here:
         if (ListaCanciones.getSelectedIndex()+1!=agregaCanciones.length){
            bloquear=true;
            Comprovacion(1);
            bloquear=false;
        }
    }//GEN-LAST:event_jButtonAdelanteActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        
        String dato = jComboBox1.getSelectedItem().toString();
        System.out.println(dato);
        String[] artista = getArtista();
        datosInterfaz.getOrdenarPor(dato,artista);
        datosInterfaz.imprimirDatos();

        ListaCanciones.setListData(canciones);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void eliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCancionActionPerformed
        // TODO add your handling code here:
        String eliminar = ListaCanciones.getSelectedValue();
        
         int indice = ListaCanciones.getSelectedIndex();
        
        if (agregaCanciones[0]!=null && indice!=-1 ){
            
            datos.remove(indice);
            agregaCanciones = new String[datos.size()];
            int x=0;
             for (String anade:datos){
                 File file = new File(anade);		
                 agregaCanciones[x]=file.getName();	
                 x++;      
             }      
             ListaCanciones.setListData(agregaCanciones);
            
        }
        
    }//GEN-LAST:event_eliminarCancionActionPerformed

    private void buscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCancionActionPerformed

        abrirFile.setDialogTitle("Ruta Absoluta Busqueda..");
        abrirFile.setFileFilter(filtrado);
        abrirFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        
        if (abrirFile.showOpenDialog(jLabelFondo)==0){
            File file = new File(""+abrirFile.getSelectedFile());        
            
            String argumento = file.getName();//Obtenemos el nombre del archivo...
            argumento=argumento.substring(argumento.length()-3,argumento.length());//Obtenemos los tres ultimos caracteres de la cadena de nombre...
            
            //Evaluamos la condicion de que el archivo al que hacemos referencia exista....
            //Evaluamos la condicion de que el archivo que hacemos referencia sea de extension mp3...
            if (file.exists()& argumento.equals("mp3")){
                
                archivo = abrirFile.getSelectedFile();//Obtenemos la ruta del archivo..
                                 
                try {
                    audiofile = AudioFileIO.read(archivo);
                    tag =  audiofile.getTag();
     
                } catch (CannotReadException | IOException | TagException | 
                        ReadOnlyFileException | InvalidAudioFrameException ex) {
                    System.out.println("Error no hay archivo el argumento es "+archivo);
                }                     
                ruta = abrirFile.getCurrentDirectory().toString();
                new Texto(fuente1, "Ruta: "+ ruta,jLabelTitulo , Color.WHITE, 15);
              
                datos.add(archivo.toString());
                
                agregaCanciones = new String[datos.size()];
              
                int x=0;
                for (String cancion:datos){
                    File introduce = new File(cancion);
                    agregaCanciones[x] = introduce.getName();
                    x++;
                }
                ListaCanciones.setListData(agregaCanciones);
                JLaEtiquetas(archivo);
            }   
            
        }   
    }//GEN-LAST:event_buscarCancionActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jPanelEcualizadorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEcualizadorMouseReleased
        // TODO add your handling code here:
        
       try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {}
        java.awt.EventQueue.invokeLater(new Runnable(){
                    @Override
            public void run(){
                new Ecualizador().setVisible(true);
            }
        });
    }//GEN-LAST:event_jPanelEcualizadorMouseReleased

    private void jButtonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetenerActionPerformed
        // TODO add your handling code here:
        reproductor.stop();
        if (Audio.getStatus()==0){
            bloquear=true;
            reproductor.stop();
            bloquear=false;
  
            
        }      
    }//GEN-LAST:event_jButtonDetenerActionPerformed

    private void jButtonPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPausaActionPerformed
        // TODO add your handling code here:
        reproductor.pause();
        if (Audio.getStatus()==1){
            try {
                Audio.resume();
            } catch (BasicPlayerException ex) {
                Logger.getLogger(VentanaReproductor.class.getName()).log(Level.SEVERE, null, ex);
            }       
        }else  if (Audio.getStatus()==0){
            try {
                Audio.pause();
                //Reducir();
            } catch (BasicPlayerException ex) {
                Logger.getLogger(VentanaReproductor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonPausaActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
               
        if (ListaCanciones.getSelectedIndex()!=0){
            bloquear=true;
            Comprovacion(-1);
            bloquear=false;
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed
    public void Comprovacion(int opera){
    int indice = ListaCanciones.getSelectedIndex();        
        if (archivo!=null & indice!=-1 & Audio.getStatus()==0){
            //El metodo getAnchotSelectionIndex obtenemos el numero de posicion en el que se encuentra el JList...
            int pista = ListaCanciones.getAnchorSelectionIndex();
            ListaCanciones.setSelectedIndex(pista+opera);
            try {
                Audio.stop();
            } catch (BasicPlayerException ex) {
                Logger.getLogger(VentanaReproductor.class.getName()).log(Level.SEVERE, null, ex);
            }
            jButtonPlay.doClick();
        }
    }
    
    public void CalculoSecundero(String milisegundos,String texto,JLabel label){
        float horas,mint;
        float segundostotal =  Integer.parseInt(milisegundos)/1000000;//Almacenamos y pasamos a segundos los microsegundos obtenenidos.

        horas = (int)segundostotal/3600;		//Conversion de segundostotal a horas.
        mint = (int)segundostotal/60-horas *60;		//Conversion de segundostotal a minutos.
        segundostotal= segundostotal-mint*60-horas*3600;//Conversion de segundostotal a segundos.

        String secundero = (int)horas + ":" +(int) mint +":"+ (int)segundostotal;//Creamos una variable String para almacenar el tiempo total horas, minutos, segundos.              

        new Texto(fuente1, texto+secundero, label, c2, 15);
    }
    
   

    public void jlistlistener(){
        
        ListaCanciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(ListaCanciones.getAnchorSelectionIndex());
                
                int indice = ListaCanciones.getSelectedIndex();

                 if (indice!=-1){
                    String ReproduceCancion = datos.get(indice);
       
                    File file = new File(ReproduceCancion);
                    try {
                    audiofile = AudioFileIO.read(file);                   
                    tag=audiofile.getTag();

                    } catch (CannotReadException | IOException | TagException | NullPointerException |
                        ReadOnlyFileException | InvalidAudioFrameException ex) {System.out.println("Error.. " + ex); }
                    
                    //Hace la llamada al metodo encargado de rellenar los JLbels....
                    JLaEtiquetas(file);
                    if (e.getClickCount()==2){
                        try {
                            bloquear=true;
                            Audio.stop();
                            bloquear=false;
                        } catch (BasicPlayerException ex) {System.out.println("Error... " + ex);}
                        jButtonPlay.doClick();
                        if (Audio.getStatus()==2){
                            jButtonPlay.doClick();
                        }
                    }
                 }
            } 
        });
    }
   
     public void JLaEtiquetas(File file){
        
            new Texto(fuente1, "Total: "+datos.size(), jLabelTotal, Color.WHITE, 15);
            new Texto(fuente1, "Cancion: "+file.getName(), jLabelTitulo, c, 15);
          try {  
            new Texto(fuente1, "Titulo: "+tag.getFirst(FieldKey.TITLE), jLabelTitulo, c, 15);     
            new Texto(fuente1, "Genero: "+tag.getFirst(FieldKey.GENRE), jLabelGenero, c, 15);
            new Texto(fuente1, "Grupo: "+tag.getFirst(FieldKey.ARTIST), jLabelGrupo, c, 15);
            
            new Texto(fuente1, "Album: "+tag.getFirst(FieldKey.ALBUM), jLabelAlbum, c, 15);
            
            
        } catch (NullPointerException e) { System.out.print("Error en las etiquetas, el tag es igual a "+ tag);
        c = new Color(58,68,72);
        new Texto(fuente1, "Titulo: ", jLabelTitulo, c, 15);     
        new Texto(fuente1, "Genero: ", jLabelGenero, c, 15);
        new Texto(fuente1, "Grupo: ", jLabelGrupo, c, 15);
        
        new Texto(fuente1, "Album: ", jLabelAlbum, c, 15);
        
        c = Color.BLACK;
        }
  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaCanciones;
    private javax.swing.JButton buscarCancion;
    private javax.swing.JButton eliminarCancion;
    private javax.swing.JButton jButtonAdelante;
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonDetener;
    private javax.swing.JButton jButtonPausa;
    private javax.swing.JButton jButtonPlay;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelAlbum;
    private javax.swing.JLabel jLabelFecha3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelEcualizador;
    private javax.swing.JPanel jPanelMetadata;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
