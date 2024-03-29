
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
        jButton_agregar = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Temperatura = new javax.swing.JTextField();
        jTextField_ValorBase = new javax.swing.JTextField();
        jLabel1_id = new javax.swing.JLabel();
        jLabel2_nombre = new javax.swing.JLabel();
        jLabel3_temperatura = new javax.swing.JLabel();
        jLabel4_valorVBase = new javax.swing.JLabel();

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
        jTable_listaproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_listaproductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_listaproducto);

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

        jButton_salir.setText("SALIR");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });

        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jTextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreActionPerformed(evt);
            }
        });

        jLabel1_id.setText("ID");

        jLabel2_nombre.setText("NOMBRE");

        jLabel3_temperatura.setText("TEMPERATURA");

        jLabel4_valorVBase.setText("VALOR BASE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel_producto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3_temperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4_valorVBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_agregar)
                                .addGap(70, 70, 70)
                                .addComponent(jButton_actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_eliminar)
                                .addGap(59, 59, 59)
                                .addComponent(jButton_salir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel_producto)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_nombre))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_temperatura))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_valorVBase))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_agregar)
                        .addComponent(jButton_eliminar)
                        .addComponent(jButton_salir)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public void Refrescar(){
            Object[][] misdatos = new Object[1][5];
            Object[]miscolumnas = {"Nombre", "Id", "Temperatura","ValorBase","Costo"};
            DefaultTableModel mimodelo = new DefaultTableModel();
            mimodelo.setColumnIdentifiers(miscolumnas);
            jTable_listaproducto.setModel(mimodelo);
            Producto miproducto = new Producto();
            List<Producto> misproductos = miproducto.listarProductos();
            for(Producto productoactual : misproductos)
            {
                misdatos[0][1]=productoactual.getNombre();
                misdatos[0][0]=productoactual.getId();
                misdatos[0][2]=productoactual.getTemperatura();
                misdatos[0][3]=productoactual.getValorBase();
                mimodelo.addRow(misdatos[0]);
                if(productoactual.getTemperatura()>20)
                {
                    misdatos[0][4]=productoactual.getValorBase()*(1.1);
                }
                else
                {
                    misdatos[0][4]=productoactual.getValorBase()*(1.2);
                
                }
            }
        }
    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        JOptionPane mimensaje = new JOptionPane();
        String minombre = jTextField_Nombre.getText();
        String miid = jTextField_Id.getText();
        double mitemperatura = Double.parseDouble(jTextField_Temperatura.getText());
        double mivalorBase = Double.parseDouble(jTextField_ValorBase.getText());
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
        String minombre = jTextField_Nombre.getText();
        String miid = jTextField_Id.getText();
        double mitemperatura = Double.parseDouble(jTextField_Temperatura.getText());
        double mivalorBase = Double.parseDouble(jTextField_ValorBase.getText());
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
        String minombre = jTextField_Nombre.getText();
        String miid = jTextField_Id.getText();
        double mitemperatura = Double.parseDouble(jTextField_Temperatura.getText());
        double mivalorBase = Double.parseDouble(jTextField_ValorBase.getText());
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

    private void jTextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreActionPerformed

    private void jTable_listaproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_listaproductoMouseClicked
      int registroactual = jTable_listaproducto.getSelectedRow();
      jTextField_Id.setText(jTable_listaproducto.getValueAt(registroactual,0).toString());
      jTextField_Nombre.setText(jTable_listaproducto.getValueAt(registroactual,1).toString());
      jTextField_Temperatura.setText(jTable_listaproducto.getValueAt(registroactual,2).toString());
      jTextField_ValorBase.setText(jTable_listaproducto.getValueAt(registroactual,3).toString());
    }//GEN-LAST:event_jTable_listaproductoMouseClicked

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

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
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JLabel jLabel1_id;
    private javax.swing.JLabel jLabel2_nombre;
    private javax.swing.JLabel jLabel3_temperatura;
    private javax.swing.JLabel jLabel4_valorVBase;
    private javax.swing.JLabel jLabel_producto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_listaproducto;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Temperatura;
    private javax.swing.JTextField jTextField_ValorBase;
    // End of variables declaration//GEN-END:variables
}
