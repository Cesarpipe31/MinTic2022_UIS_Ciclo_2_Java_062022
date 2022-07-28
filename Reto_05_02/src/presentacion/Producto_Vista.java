package presentacion;

import logica.Producto;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Producto_Vista extends javax.swing.JFrame {

    public Producto_Vista() {
        initComponents();
        Refrescar();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
                                                          

    public void Refrescar()
    {
        //Metodo para consultar los registros de la base de datos
        //Asigno las variables que contendran los datos del modelo
        Object[][] misdatos = new Object[1][5];
        //Creo las columnas para la tabla
        Object[] miscolumnas = {"Id","Nombre","Temperatura","Valor Base","Costo"};
        //Declaro el modelo de datos
        DefaultTableModel mimodelo = new DefaultTableModel();
        //Asigno las columnas de la tabla
        mimodelo.setColumnIdentifiers(miscolumnas);
        //Asigno los datos del modelo a la tabla
        jTablelistaproductos.setModel(mimodelo);
        //Creo el objeto cliente
        Producto miproducto = new Producto();
        //Obtengo la lista de productos de la base de datos
        List<Producto> misproductos = miproducto.listarProducto();
        //Recorro la lista y asigno a cada elemento del modelo los valores de los campos de la base de datos
        for(Producto productoactual : misproductos)
        {
            //Asignar a cada casilla de la matriz un valor del campo en la base de datos           
            misdatos[0][0] = productoactual.getId();
            misdatos[0][1] = productoactual.getNombre();
            misdatos[0][2] = productoactual.getTemperatura();
            misdatos[0][3] = productoactual.getValorBase();
            //Agrego cada registro de la base de datos al modelo
            
            //double mitemperatura = Double.parseDouble(jTextFieldTemperatura.getText());
            
            if(productoactual.getTemperatura()>20)
                {
                    misdatos[0][4]=productoactual.getValorBase()*(1.1);
                }
                else
                {
                    misdatos[0][4]=productoactual.getValorBase()*(1.2);
                }
                    mimodelo.addRow(misdatos[0]);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        lblProductos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablelistaproductos = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblValorBase = new javax.swing.JLabel();
        jTextFieldValorBase = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTextFieldTemperatura = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setLocation(new java.awt.Point(0, 0));

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });

        jTextFieldId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIdKeyPressed(evt);
            }
        });

        lblProductos.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(51, 51, 255));
        lblProductos.setText("Productos de Farmacia");

        jTablelistaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablelistaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablelistaproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablelistaproductos);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("Id");

        lblTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTemperatura.setText("Temperatura");

        lblValorBase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValorBase.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValorBase.setText("Valor Base");

        jTextFieldValorBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValorBaseKeyPressed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jTextFieldTemperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTemperaturaKeyPressed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnLimpiar.setText("Nuevo");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldTemperatura)
                            .addComponent(jTextFieldValorBase))
                        .addGap(39, 39, 39)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(lblProductos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemperatura)
                            .addComponent(jTextFieldTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorBase)
                            .addComponent(jTextFieldValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultar)
                            .addComponent(btnSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*    
       
*/    
/*        
   
    */
/*
                                                
*/

    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     JOptionPane mensajesalir = new JOptionPane();
            int option = mensajesalir.showConfirmDialog(null,"¿Estás seguro de que quieres cerrar la aplicación?","Confirmación de cierre",mensajesalir.YES_NO_OPTION, mensajesalir.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jTablelistaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablelistaproductosMouseClicked
       int registroactual = jTablelistaproductos.getSelectedRow();
       ///jComboBox_codtipoid.setSelectedItem(jTablelistaproductos.getValueAt(registroactual,0).toString());
       jTextFieldId.setText(jTablelistaproductos.getValueAt(registroactual,0).toString());
       jTextFieldNombre.setText(jTablelistaproductos.getValueAt(registroactual,1).toString());
       jTextFieldTemperatura.setText(jTablelistaproductos.getValueAt(registroactual,2).toString());
       jTextFieldValorBase.setText(jTablelistaproductos.getValueAt(registroactual,3).toString());
    }//GEN-LAST:event_jTablelistaproductosMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Refrescar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       JOptionPane mimensaje = new JOptionPane();
        //Obtengo los valores de los elementos que dibuje en el formulario
        String miid = jTextFieldId.getText();
        String minombre = jTextFieldNombre.getText();
        double mitemperatura = Double.parseDouble(jTextFieldTemperatura.getText());
        double mivalorbase = Double.parseDouble(jTextFieldValorBase.getText());        
        //Creo el objeto cliente
        Producto miproducto = new Producto();
        //Asigno los atributos al objeto cliente
        miproducto.setId(miid);
        miproducto.setNombre(minombre);
        miproducto.setTemperatura(mitemperatura);
        miproducto.setValorBase(mivalorbase);
        //Invoca el metodo para grabar en la base de datos de la clase cliente
        if(miproducto.guardarProducto()==true)
        {
            mimensaje.showMessageDialog(this,"¡El producto fue agregado exitosamente!","Confirmación de registro", mimensaje.INFORMATION_MESSAGE);
            Refrescar();
        }
        else
        {
            mimensaje.showMessageDialog(this,"¡No fue posible agregar el producto!","Error de registro", mimensaje.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        JOptionPane mimensaje = new JOptionPane();
        //Obtengo los valores de los elementos que dibuje en el formulario
       /// String micodtipoid = jComboBox_codtipoid.getSelectedItem().toString();
        String miid = jTextFieldId.getText();
        String minombre = jTextFieldNombre.getText();
        double mitemperatura = Double.parseDouble(jTextFieldTemperatura.getText());
        double mivalorbase = Double.parseDouble(jTextFieldValorBase.getText());        
        //Creo el objeto cliente
        Producto miproducto = new Producto();
        //Asigno los atributos al objeto cliente
        miproducto.setId(miid);
        miproducto.setNombre(minombre);
        miproducto.setTemperatura(mitemperatura);
        miproducto.setValorBase(mivalorbase);
        //Invoca el metodo para grabar en la base de datos de la clase cliente
        if(miproducto.actualizarProducto()==true)
        {
            mimensaje.showMessageDialog(this,"¡El producto fue actualizado exitosamente!","Confirmación de actualización", mimensaje.INFORMATION_MESSAGE);
            Refrescar();
        }
        else
        {
            mimensaje.showMessageDialog(this,"¡No fue posible actualizar el producto!","Error de actualización", mimensaje.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                JOptionPane mimensaje = new JOptionPane();
        //Obtengo los valores de los elementos que dibuje en el formulario
        String miid = jTextFieldId.getText();
        Producto miproducto = new Producto();
        miproducto.setId(miid);
        int option = mimensaje.showConfirmDialog(this,"¿Estás seguro de borrar el registro?","Confirmación de eliminación",mimensaje.YES_NO_OPTION, mimensaje.WARNING_MESSAGE);
        if (option == JOptionPane.YES_OPTION)
        {
            if(miproducto.borrarProducto()==true)
            {
                mimensaje.showMessageDialog(this,"¡ El registro fue eliminado exitosamente !","Confirmación de eliminación", mimensaje.INFORMATION_MESSAGE);
                Refrescar();
            }
            else
            {
                mimensaje.showMessageDialog(this,"¡ Error al eliminar !","Error en la eliminación", mimensaje.ERROR_MESSAGE);
            }    
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
  
  
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jTextFieldId.setText("");
        jTextFieldNombre.setText("");
        jTextFieldTemperatura.setText("");
        jTextFieldValorBase.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTextFieldId.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldTemperaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTemperaturaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTextFieldValorBase.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldTemperaturaKeyPressed

    private void jTextFieldIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTextFieldTemperatura.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldIdKeyPressed

    private void jTextFieldValorBaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorBaseKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldValorBaseKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto_Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablelistaproductos;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTemperatura;
    private javax.swing.JTextField jTextFieldValorBase;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblValorBase;
    // End of variables declaration//GEN-END:variables
}
