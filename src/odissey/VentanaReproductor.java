package odissey;
import odissey.*;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
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
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

/**
 *
 * @author maesly
 */
import odissey.DatosInterfaz;

public class VentanaReproductor extends javax.swing.JFrame {
    //variables del programa 
    private Ecualizador ecualizador;
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
   
    private final BasicPlayer Audio = new BasicPlayer();
    FileNameExtensionFilter filtrado = new FileNameExtensionFilter("Solo Mp3","mp3","jpg");
    
    private String ruta = "/home/maesly/NetBeansProjects/Odissey/src/Canciones";
    private final JFileChooser abrirFile  = new JFileChooser(new File(ruta));
    
    private File archivo= null;
    private Tag tag;
    private  AudioFile audiofile = new AudioFile();
    
    private String agregaCanciones[]= new String[10];
    private final ArrayList<String> datos = new ArrayList<>();

    Reproductor reproductor = new Reproductor();
    DatosInterfaz datosInterfaz = new DatosInterfaz();
    String[] canciones = {"","",""};
    
    public void getArtista(){
        String[] temp = {};
        for (int i = 0; i < canciones.length; i++) {
           temp[0] = canciones[0];
            
        }
        
    }
    
    public class ToolTipText {

    public ToolTipText(JButton boton,String texto) {
        boton.setToolTipText(texto);
    }
    
}
    /**
     * Creates new form VentanaReproductor
     */
    public VentanaReproductor() {
        initComponents();
        this.setBounds(250, 100, 1000, 600);
        this.setResizable(false);
        this.setTitle("Odissey++ Reproductor");
        
        E0 = E1 = E2 = E3 = E4 = E5 = E6 = E7 = E8 = E9 = 0;
        ecualizador = new Ecualizador(jPanelEcualizador);
        //SlidersChange();
        //basic_playerlistener();
        //jlistlistener();
        new Etiquetas(jLabelTitulo,jLabelGenero,jLabelGrupo,jLabelGrupo,jLabelAlbum,ListaCanciones,datos);
        
        new ToolTipText(jButtonPlay, "Pulse para Reproducir");
        new ToolTipText(jButtonPausa, "Pulse para Pausar");
        new ToolTipText(jButtonDetener, "Pulse para detener");
        new ToolTipText(jButtonAtras, "Pulse Para Retroceder");
        new ToolTipText(buscarCancion, "Agrega los mp3 del directorio");
        new ToolTipText(jButtonAdelante, "Al terminar la cancion reproduce la siguiente de la lista");
        
        //Importa iconos esteticos en dos posiciones a los botones.........
        new Botones(jButtonPlay,"Reproducir.png","ReproducirP.png");
        new Botones(jButtonDetener,"Parar.png","PararP.png");
        new Botones(jButtonPausa, "Pausar.png", "PausarP.png");
        new Botones(jButtonAdelante, "Avance.png", "AvanceP.png");
        new Botones(jButtonAtras, "Retroceso.png", "RetrocesoP.png");
        new Botones(buscarCancion, "Agregar.png", "AgregarP.png");
        new Botones(jButtonAdelante, "Siguiente.png", "SiguienteP.png");
      
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
        jButtonPlay = new javax.swing.JButton();
        jButtonPausa = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonAdelante = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButtonDetener = new javax.swing.JButton();
        jPanelEcualizador = new javax.swing.JPanel();
        jPanelMetadata = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAlbum = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelGrupo = new javax.swing.JLabel();
        jLabelFecha1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        buscarCancion.setText("Añadir ");
        buscarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buscarCancionMouseReleased(evt);
            }
        });
        buscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCancionActionPerformed(evt);
            }
        });
        getContentPane().add(buscarCancion);
        buscarCancion.setBounds(210, 260, 90, 40);

        eliminarCancion.setText("Eliminar");
        eliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCancionActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCancion);
        eliminarCancion.setBounds(310, 260, 90, 40);

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
        jComboBox1.setBounds(30, 260, 150, 40);

        jSeparator1.setBackground(new java.awt.Color(253, 246, 239));
        jSeparator1.setForeground(new java.awt.Color(253, 239, 239));
        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 36), new java.awt.Color(246, 242, 242))); // NOI18N
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 210, 410, 40);

        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Amigos ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 2, 36), new java.awt.Color(254, 247, 247))); // NOI18N
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(410, 210, 390, 40);

        ListaCanciones.setBackground(new java.awt.Color(118, 118, 118));
        ListaCanciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 39, 96), 3, true));
        jScrollPane1.setViewportView(ListaCanciones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 320, 390, 240);

        jPanelBotones.setBackground(new java.awt.Color(118, 118, 118));
        jPanelBotones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 39, 96), 3, true));
        jPanelBotones.setLayout(null);

        jButtonPlay.setText("Play");
        jButtonPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonPlayMouseReleased(evt);
            }
        });
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonPlay);
        jButtonPlay.setBounds(10, 70, 80, 30);

        jButtonPausa.setText("Pausa");
        jPanelBotones.add(jButtonPausa);
        jButtonPausa.setBounds(180, 70, 90, 30);

        jButtonAtras.setText("Atrás");
        jPanelBotones.add(jButtonAtras);
        jButtonAtras.setBounds(10, 120, 80, 30);

        jButtonAdelante.setText("Adelante");
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAdelante);
        jButtonAdelante.setBounds(180, 120, 90, 30);
        jPanelBotones.add(jProgressBar1);
        jProgressBar1.setBounds(30, 30, 210, 20);

        jButtonDetener.setText("Detener");
        jPanelBotones.add(jButtonDetener);
        jButtonDetener.setBounds(100, 90, 68, 30);

        getContentPane().add(jPanelBotones);
        jPanelBotones.setBounds(350, 30, 280, 170);

        jPanelEcualizador.setBackground(new java.awt.Color(118, 118, 118));
        jPanelEcualizador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 39, 96), 3, true));
        jPanelEcualizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelEcualizadorMouseReleased(evt);
            }
        });
        jPanelEcualizador.setLayout(null);
        getContentPane().add(jPanelEcualizador);
        jPanelEcualizador.setBounds(660, 30, 270, 170);

        jPanelMetadata.setBackground(new java.awt.Color(118, 118, 118));
        jPanelMetadata.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
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

        jLabelFecha1.setForeground(new java.awt.Color(253, 251, 251));
        jLabelFecha1.setText("Fecha:");
        jPanelMetadata.add(jLabelFecha1);
        jLabelFecha1.setBounds(10, 90, 290, 18);

        getContentPane().add(jPanelMetadata);
        jPanelMetadata.setBounds(20, 30, 310, 180);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fa.png"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(-390, -30, 1460, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdelanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdelanteActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        
        String dato = jComboBox1.getSelectedItem().toString();
        System.out.println(dato);
        datosInterfaz.getOrdenarPor(dato);
        datosInterfaz.imprimirDatos();
        String[] canciones = {"Adele","Hector el father", "Shakira", "Paquita"};
        ListaCanciones.setListData(canciones);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButtonPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPlayMouseReleased
        // TODO add your handling code here:
        reproductor.Play("/home/maesly/NetBeansProjects/Odissey/src/Documentos/weAretheChampiñones.mp3");
        
    }//GEN-LAST:event_jButtonPlayMouseReleased

    private void eliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarCancionActionPerformed

    private void buscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCancionActionPerformed

    private void buscarCancionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCancionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCancionMouseReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jPanelEcualizadorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEcualizadorMouseReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jPanelEcualizadorMouseReleased

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
    private javax.swing.JLabel jLabelFecha1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelEcualizador;
    private javax.swing.JPanel jPanelMetadata;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
