package odissey;
/**
 *
 * @author maesly
 */
import odissey.DatosInterfaz;
public class VentanaReproductor extends javax.swing.JFrame {
    
    Reproductor reproductor = new Reproductor();
    DatosInterfaz datosInterfaz = new DatosInterfaz();
    String[] canciones = {"","",""};
    
    public void getArtista(){
        String[] temp = {};
        for (int i = 0; i < canciones.length; i++) {
           temp[0] = canciones[0];
            
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
        jPanelEcualizador = new javax.swing.JPanel();
        E1 = new javax.swing.JProgressBar();
        jPanelMetadata = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MetadataCanciones = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        jButtonPlay.setBounds(30, 70, 80, 30);

        jButtonPausa.setText("Pausa");
        jPanelBotones.add(jButtonPausa);
        jButtonPausa.setBounds(150, 70, 90, 30);

        jButtonAtras.setText("Atrás");
        jPanelBotones.add(jButtonAtras);
        jButtonAtras.setBounds(30, 120, 80, 30);

        jButtonAdelante.setText("Adelante");
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAdelante);
        jButtonAdelante.setBounds(150, 120, 90, 30);
        jPanelBotones.add(jProgressBar1);
        jProgressBar1.setBounds(30, 30, 210, 20);

        getContentPane().add(jPanelBotones);
        jPanelBotones.setBounds(350, 30, 280, 170);

        jPanelEcualizador.setBackground(new java.awt.Color(118, 118, 118));
        jPanelEcualizador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 39, 96), 3, true));
        jPanelEcualizador.setLayout(null);
        jPanelEcualizador.add(E1);
        E1.setBounds(20, 120, 150, 20);

        getContentPane().add(jPanelEcualizador);
        jPanelEcualizador.setBounds(660, 30, 270, 170);

        jPanelMetadata.setBackground(new java.awt.Color(118, 118, 118));
        jPanelMetadata.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanelMetadata.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(253, 251, 251));
        jLabel2.setText("Canción:");
        jPanelMetadata.add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 18);

        MetadataCanciones.setBackground(new java.awt.Color(118, 118, 118));
        MetadataCanciones.setBorder(null);
        jScrollPane2.setViewportView(MetadataCanciones);

        jPanelMetadata.add(jScrollPane2);
        jScrollPane2.setBounds(90, 10, 210, 160);

        jLabel3.setForeground(new java.awt.Color(253, 251, 251));
        jLabel3.setText("Genero:");
        jPanelMetadata.add(jLabel3);
        jLabel3.setBounds(10, 90, 60, 18);

        jLabel4.setForeground(new java.awt.Color(253, 251, 251));
        jLabel4.setText("Artista:");
        jPanelMetadata.add(jLabel4);
        jLabel4.setBounds(10, 30, 60, 18);

        jLabel5.setForeground(new java.awt.Color(253, 251, 251));
        jLabel5.setText("Album:");
        jPanelMetadata.add(jLabel5);
        jLabel5.setBounds(10, 50, 60, 18);

        jLabel6.setForeground(new java.awt.Color(253, 251, 251));
        jLabel6.setText("Año:");
        jPanelMetadata.add(jLabel6);
        jLabel6.setBounds(10, 70, 60, 18);

        getContentPane().add(jPanelMetadata);
        jPanelMetadata.setBounds(20, 30, 310, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fa.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-390, -30, 1460, 640);

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
    private javax.swing.JProgressBar E1;
    private javax.swing.JList<String> ListaCanciones;
    private javax.swing.JList<String> MetadataCanciones;
    private javax.swing.JButton buscarCancion;
    private javax.swing.JButton eliminarCancion;
    private javax.swing.JButton jButtonAdelante;
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonPausa;
    private javax.swing.JButton jButtonPlay;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelEcualizador;
    private javax.swing.JPanel jPanelMetadata;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
