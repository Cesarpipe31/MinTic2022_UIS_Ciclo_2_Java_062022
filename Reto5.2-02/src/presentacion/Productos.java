
package presentacion;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.Producto;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JFrame {

    
    public Productos() {
        initComponents();
        Refrescar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_producto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_listaproducto = new javax.swing.JTable();
        jButton_consultar = new javax.swing.JButton();
        jButton_agregar = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jComboBox_id = new javax.swing.JComboBox<>();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_temperatura = new javax.swing.JTextField();
        jTextField_valorBase = new javax.swing.JTextField();
        jButton_salir = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_producto.setText("PRODUCTO");

        jTable_listaproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_listaproducto);

        jButton_consultar.setText("CONSULTAR");
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });

        jButton_agregar.setText("AGREGAR");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });

        jButton_actualizar.setText("ACTUALIZAR");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });

        jButton_eliminar.setText("ELIMINAR");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jComboBox_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField_nombre.setText("NOMBRE");

        jTextField_temperatura.setText("TEMPERATURA");

        jTextField_valorBase.setText("VALOR BASE");

        jButton_salir.setText("SALIR");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton_consultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_eliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_salir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_valorBase, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel_producto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(476, 1284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel_producto)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_valorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_consultar)
                    .addComponent(jButton_agregar)
                    .addComponent(jButton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_eliminar)
                    .addComponent(jButton_salir))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        Refrescar();
    }//GEN-LAST:event_jButton_consultarActionPerformed
        public void Refrescar(){
            Object[][] misdatos = new Object[1][5];
            Object[]miscolumnas = {"Nombre", "Id", "Temperatura","ValorBase"};
            DefaultTableModel mimodelo = new DefaultTableModel();
            mimodelo.setColumnIdentifiers(miscolumnas);
            jTable_listaproducto.setModel(mimodelo);
            Producto miproducto = new Producto();
            List<Producto> misproductos = miproducto.listarProductos();
            for(Producto productoactual : misproductos)
            {
                misdatos[0][1]=productoactual.getNombre();
                misdatos[0][2]=productoactual.getId();
                misdatos[0][3]=productoactual.getTemperatura();
                misdatos[0][4]=productoactual.getValorBase();
                mimodelo.addRow(misdatos[0]);
            }
        }
    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        JOptionPane mimensaje = new JOptionPane();
        String minombre = jTextField_nombre.getText();
        String miid = jComboBox_id.getSelectedItem().toString();
        double mitemperatura = Double.parseDouble(jTextField_temperatura.getText());
        double mivalorBase = Double.parseDouble(jTextField_valorBase.getText());
        Producto miproducto = new Producto();
        miproducto.setNombre(minombre);
        miproducto.setId(miid);
        miproducto.setTemperatura(mitemperatura);
        miproducto.setValorBase(mivalorBase);
        if(miproducto.guardarProducto()== true){
            mimensaje.showMessageDialog(this,"¡ El producto fue agregado exitosamente !","Confirmación de adicionado", mimensaje.INFORMATION_MESSAGE);
            Refrescar();
        }
        else
        {
            mimensaje.showMessageDialog(this,"¡ Error al agregar !","Error en la adicion", mimensaje.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_agregarActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        JOptionPane mimensaje = new JOptionPane();
        String minombre = jTextField_nombre.getText();
        String miid = jComboBox_id.getSelectedItem().toString();
        double mitemperatura = Double.parseDouble(jTextField_temperatura.getText());
        double mivalorBase = Double.parseDouble(jTextField_valorBase.getText());
        Producto miproducto = new Producto();
        miproducto.setNombre(minombre);
        miproducto.setId(miid);
        miproducto.setTemperatura(mitemperatura);
        miproducto.setValorBase(mivalorBase);
        if(miproducto.actualizarProducto()== true){
            mimensaje.showMessageDialog(this,"¡ El producto fue actualizado exitosamente !","Confirmación de actualización", mimensaje.INFORMATION_MESSAGE);
            Refrescar();
        }
        else
        {
            mimensaje.showMessageDialog(this,"¡ Error al actualizar !","Error en la actualización", mimensaje.ERROR_MESSAGE);
        }
       
        
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
       JOptionPane mimensaje = new JOptionPane();
        String minombre = jTextField_nombre.getText();
        String miid = jComboBox_id.getSelectedItem().toString();
        double mitemperatura = Double.parseDouble(jTextField_temperatura.getText());
        double mivalorBase = Double.parseDouble(jTextField_valorBase.getText());
        Producto miproducto = new Producto();
        miproducto.setNombre(minombre);
        miproducto.setId(miid);
        miproducto.setTemperatura(mitemperatura);
        miproducto.setValorBase(mivalorBase);
        if(miproducto.borrarProducto()== true){
            mimensaje.showMessageDialog(this,"¡ El producto fue eliminado exitosamente !","Confirmación de eliminacion", mimensaje.INFORMATION_MESSAGE);
            Refrescar();
        }
        else
        {
            mimensaje.showMessageDialog(this,"¡ Error al eliminar !","Error en la eliminacion", mimensaje.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
       JOptionPane mimensaje = new JOptionPane();
        int option = mimensaje.showConfirmDialog(this,"¿Estás seguro de que quieres cerrar la aplicación?","Confirmación de cierre",mimensaje.YES_NO_OPTION, mimensaje.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
    }//GEN-LAST:event_jButton_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_agregar;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JComboBox<String> jComboBox_id;
    private javax.swing.JLabel jLabel_producto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_listaproducto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_temperatura;
    private javax.swing.JTextField jTextField_valorBase;
    // End of variables declaration//GEN-END:variables
}