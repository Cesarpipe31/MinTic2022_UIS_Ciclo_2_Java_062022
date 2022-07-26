package View;

import Model.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_Productos extends javax.swing.JFrame {

    public frm_Productos() {
        initComponents();
        Refrescar();
    }

  
    @SuppressWarnings("unchecked")
                                                          

    public void Refrescar()
    {
        //Metodo para consultar los registros de la base de datos
        //Asigno las variables que contendran los datos del modelo
        Object[][] misdatos = new Object[1][4];
        //Creo las columnas para la tabla
        Object[] miscolumnas = {"Id","Nombre","Temperatura","Valor Base"};
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
            mimodelo.addRow(misdatos[0]);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProductos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablelistaproductos = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblValorBase = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldTemperatura = new javax.swing.JTextField();
        jTextFieldValorBase = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProductos.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        lblProductos.setText("Productos");

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

        lblNombre.setText("Nombre");

        lblId.setText("Id");

        lblTemperatura.setText("Temperatura");

        lblValorBase.setText("Valor Base");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTemperaturaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblId))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId)
                            .addComponent(jTextFieldNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTemperatura)
                            .addComponent(lblValorBase))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldValorBase)
                            .addComponent(jTextFieldTemperatura)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(49, 49, 49)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProductos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(80, 80, 80)
                        .addComponent(btnConsultar)
                        .addGap(76, 76, 76)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblId))
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemperatura)
                            .addComponent(jTextFieldTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorBase)
                            .addComponent(jTextFieldValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblProductos)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsultar)
                    .addComponent(btnSalir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                                
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
    }       
*/    
/*        
        private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                                   
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
    }    
    */

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        JOptionPane mimensaje = new JOptionPane();
        //Obtengo los valores de los elementos que dibuje en el formulario
        ///String micodtipoid = jComboBox_codtipoid.getSelectedItem().toString();
        String miid = jTextFieldId.getText();
        //Creo el objeto cliente
        Producto miproducto = new Producto();
        //Asigno los atributos al objeto cliente
        miproducto.setId(miid);
        //Invoca el metodo para grabar en la base de datos de la clase cliente
        if(miproducto.borrarProducto()==true)
        {
            mimensaje.showMessageDialog(this,"¡El producto fue eliminado exitosamente!","Confirmación de borrado", mimensaje.WARNING_MESSAGE);
            Refrescar();
        }
        else
        {
            mimensaje.showMessageDialog(this,"¡No fue posible borrar el producto!","Error de borrado", mimensaje.ERROR_MESSAGE);
        }
    }                                                


    
    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTemperaturaActionPerformed

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
        String minombre = jTextFieldNombre.getText();
        double mitemperatura = Double.parseDouble(jTextFieldTemperatura.getText());
        double mivalorbase = Double.parseDouble(jTextFieldValorBase.getText());        
        //Invoca el metodo para grabar en la base de datos de la clase cliente
        if(miproducto.borrarProducto()==true)
        {
            mimensaje.showMessageDialog(this,"¡El producto fue eliminado exitosamente!","Confirmación de borrado", mimensaje.WARNING_MESSAGE);
            Refrescar();
        }
        else
        {
            mimensaje.showMessageDialog(this,"¡No fue posible borrar el producto!","Error de borrado", mimensaje.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

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
                new frm_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
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
