/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import API.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Fabrizio
 */
public class TablaArticulos extends javax.swing.JFrame {

    /**
     * Creates new form TablaArticulos
     */
    
    String path;
    float presupuesto;
    float precio;
            
    public TablaArticulos(String ppath) {
        initComponents();
        this.path=ppath;
        this.presupuesto=0;
        this.precio=0;
        
    }
    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        VentanaAmazon = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        NombreL = new javax.swing.JLabel();
        PrecioL = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        Nombre = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NombreL1 = new javax.swing.JLabel();
        PrecioL1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        Nombre1 = new javax.swing.JLabel();
        Precio1 = new javax.swing.JLabel();
        Imagen1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Items = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBArticulos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TXValTotDol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXPresCol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXValTotCol = new javax.swing.JTextField();
        TXPresDol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXPresRest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TXPresRestDol = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLabel1.setText("Objeto a buscar:");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        NombreL.setText("Nombre:");

        PrecioL.setText("Precio:");

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        NombreL1.setText("Nombre:");

        PrecioL1.setText("Precio:");

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaAmazonLayout = new javax.swing.GroupLayout(VentanaAmazon.getContentPane());
        VentanaAmazon.getContentPane().setLayout(VentanaAmazonLayout);
        VentanaAmazonLayout.setHorizontalGroup(
            VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaAmazonLayout.createSequentialGroup()
                .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaAmazonLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NombreL1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PrecioL1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaAmazonLayout.createSequentialGroup()
                        .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel1)
                                        .addGap(129, 129, 129)
                                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NombreL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PrecioL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(buscar))
                            .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(516, Short.MAX_VALUE))
        );
        VentanaAmazonLayout.setVerticalGroup(
            VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaAmazonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaAmazonLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NombreL)
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PrecioL)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Precio1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(VentanaAmazonLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addGroup(VentanaAmazonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(NombreL1)
                                                .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(PrecioL1)))))
                                .addGap(37, 37, 37)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(354, 354, 354))))
                    .addGroup(VentanaAmazonLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TBArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Articulo", "Grado de Importancia", "Precio en colones", "Aproximado en dolares"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBArticulos.setRowHeight(30);
        jScrollPane1.setViewportView(TBArticulos);

        jLabel2.setText("Presupuesto en Colones:");

        TXValTotDol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXValTotDolActionPerformed(evt);
            }
        });

        jLabel3.setText("Presupuesto  estimado en Dolares:");

        TXPresCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXPresColActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor Total de los Articulos:");

        TXValTotCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXValTotColActionPerformed(evt);
            }
        });

        TXPresDol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXPresDolActionPerformed(evt);
            }
        });

        jLabel5.setText("Presupuesto restante: ");

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel6.setText("Tabla de Articulos ");

        jLabel7.setText("Valor Total estimado en Dolares:");

        TXPresRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXPresRestActionPerformed(evt);
            }
        });

        jLabel8.setText("Presupuesto restante en Dolares: ");

        TXPresRestDol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXPresRestDolActionPerformed(evt);
            }
        });

        jMenu1.setText("Articulos");

        jMenuItem1.setText("Agregar Articulo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar Articulo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cambiar prespuesto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Busqueda y ayuda");

        jMenuItem4.setText("Google");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setText("Buscar en Amazon Marketplace");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("Manual de usuario");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXPresCol)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXPresDol, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXValTotCol, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TXValTotDol, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(TXPresRest, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXPresRestDol, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(TXPresCol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TXPresDol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TXValTotCol, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(TXValTotDol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TXPresRest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXPresRestDol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXValTotDolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXValTotDolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXValTotDolActionPerformed

    private void TXPresColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXPresColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXPresColActionPerformed

    private void TXValTotColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXValTotColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXValTotColActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AgregarElem nuevo=new AgregarElem(path,this);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        try {
            Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
            p.waitFor();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chrome no pudo ser localizado");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void TXPresDolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXPresDolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXPresDolActionPerformed

    private void TXPresRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXPresRestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXPresRestActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        EliminarArticulo elim = new EliminarArticulo(path,this);
        elim.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        PresuNuevo nuev= new PresuNuevo(path,this);
        nuev.setVisible(true); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void TXPresRestDolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXPresRestDolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXPresRestDolActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.VentanaAmazon.setVisible(true);
        this.VentanaAmazon.setSize(800, 525);
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            // TODO add your handling code here:
            String busqueda=this.busqueda.getText();
            API_Manager API=new API_Manager();
            API.generateResponse(busqueda);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TablaArticulos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnirestException ex) {
            Logger.getLogger(TablaArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public JTable getTBArticulos() {
        return TBArticulos;
    }

    public void setTBArticulos(JTable TBArticulos) {
        this.TBArticulos = TBArticulos;
    }

    public JTextField getTXPresCol() {
        return TXPresCol;
    }

    public void setTXPresCol(JTextField TXPresCol) {
        this.TXPresCol = TXPresCol;
    }

    public JTextField getTXPresDol() {
        return TXPresDol;
    }

    public void setTXPresDol(JTextField TXPresDol) {
        this.TXPresDol = TXPresDol;
    }

    public JTextField getTXPresRest() {
        return TXPresRest;
    }

    public void setTXPresRest(JTextField TXPresRest) {
        this.TXPresRest = TXPresRest;
    }

    public JTextField getTXValTotCol() {
        return TXValTotCol;
    }

    public void setTXValTotCol(JTextField TXValTotCol) {
        this.TXValTotCol = TXValTotCol;
    }

    public JTextField getTXValTotDol() {
        return TXValTotDol;
    }

    public void setTXValTotDol(JTextField TXValTotDol) {
        this.TXValTotDol = TXValTotDol;
    }

    public JTextField getTXPresRestDol() {
        return TXPresRestDol;
    }

    public void setTXPresRestDol(JTextField TXPresRestDol) {
        this.TXPresRestDol = TXPresRestDol;
    }

    
     public void CrearTabla() throws IOException{
        DefaultTableModel tabla = (DefaultTableModel) TBArticulos.getModel();
        tabla.setRowCount(0);
         try {
            FileInputStream archivo = new FileInputStream(new File(path));
            XSSFWorkbook documento= new XSSFWorkbook(archivo);
            XSSFSheet pagina= documento.getSheetAt(0);
            int numFilas=pagina.getLastRowNum();
             System.out.println(numFilas);
             setPrecio(0);
             setPresupuesto(0);
            for(int contFila=0; contFila<=numFilas; contFila++)
            {
                if(contFila==0){
                    Row fila=pagina.getRow(contFila);
                    Cell celda = fila.getCell(0);
                    TXPresCol.setText("₡"+String.valueOf((float)celda.getNumericCellValue()));
                    TXPresDol.setText("$"+String.valueOf((float)celda.getNumericCellValue()/560));
                    setPresupuesto((float)celda.getNumericCellValue());
                }else{
                    Row fila=pagina.getRow(contFila);
                    Cell celda;
                    celda = fila.getCell(0);
                    if(!"?".equals((String)celda.getStringCellValue())){
                        ArrayList<String> anaRey=new ArrayList<String>();
                        anaRey.add((String)celda.getStringCellValue());
                        celda = fila.getCell(1);       
                        anaRey.add(String.valueOf((int)celda.getNumericCellValue()));
                        celda = fila.getCell(2);
                        setPrecio(getPrecio()+(float)celda.getNumericCellValue());
                        anaRey.add(String.valueOf((float)celda.getNumericCellValue()));
                        celda = fila.getCell(3);       
                        anaRey.add(String.valueOf((float)celda.getNumericCellValue()));
                        Object[]filaConv=anaRey.toArray();
                        tabla.addRow(filaConv);
                    }
                }
                TXValTotCol.setText("₡"+String.valueOf(getPrecio()));
                TXValTotDol.setText("$"+String.valueOf(getPrecio()/560));
                TXPresRest.setText("₡"+Float.toString(getPresupuesto()-getPrecio()));
                TXPresRestDol.setText("$"+Float.toString(getPresupuesto()-getPrecio()/560));
                if(getPresupuesto()-getPrecio()<0){
                    Color myColor = new Color(245, 69, 69);
                    TXPresRest.setBackground(myColor);
                    TXPresRestDol.setBackground(myColor);
                }else{
                    Color myColor = new Color(159, 212, 55);
                    TXPresRest.setBackground(myColor);
                    TXPresRestDol.setBackground(myColor);
                }
                archivo.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no pudo ser cargado");
        } 
    }
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Imagen1;
    private javax.swing.ButtonGroup Items;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel NombreL;
    private javax.swing.JLabel NombreL1;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Precio1;
    private javax.swing.JLabel PrecioL;
    private javax.swing.JLabel PrecioL1;
    private javax.swing.JTable TBArticulos;
    private javax.swing.JTextField TXPresCol;
    private javax.swing.JTextField TXPresDol;
    private javax.swing.JTextField TXPresRest;
    private javax.swing.JTextField TXPresRestDol;
    private javax.swing.JTextField TXValTotCol;
    private javax.swing.JTextField TXValTotDol;
    private javax.swing.JDialog VentanaAmazon;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
