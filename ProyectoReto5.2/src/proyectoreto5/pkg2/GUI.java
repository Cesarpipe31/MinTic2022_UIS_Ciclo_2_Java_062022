package proyectoreto5.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    private ProductoDAO productodao;
    private Producto producto;

    public GUI() {
        initComponents();
        modelo = new DefaultTableModel(new Object[]{"ID","Nombre","Temperatura","Valor base","Costo"},0);
        tbProductos.setModel(modelo);
        productodao = new ProductoDAO();
        producto = new Producto();
        listarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtValorBase = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Farmacias", jPanel1);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Temperatura");

        jLabel4.setText("Valor Base");

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtNombre)
                    .addComponent(txtTemperatura)
                    .addComponent(txtValorBase)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(capturarDatos()){
            if(productodao.guardarProducto(producto)){
                modelo.setRowCount(0);
                listarProductos();
                limpiarDatos();
                JOptionPane.showMessageDialog(rootPane, "Se guardo el producto satisfactoriamente.");
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se ha podido guardar el producto.");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Digite todos los datos.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(!txtID.getText().equals("")){
            if(productodao.eliminarProducto(txtID.getText())){
                modelo.setRowCount(0);
                listarProductos();
                limpiarDatos();
                JOptionPane.showMessageDialog(rootPane, "Se ha eliminado el producto satisfactorimente.");
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se ha podido eliminar el producto.");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Digite el ID para eliminar un producto.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if(capturarDatos()){
            if(productodao.actualizarProducto(producto)){
                modelo.setRowCount(0);
                listarProductos();
                limpiarDatos();
                JOptionPane.showMessageDialog(rootPane, "Se actulizo el producto satisfactoriamente.");
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se ha podido actulizar el producto.");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Digite todos los datos.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        if(!txtID.getText().equals("")){
            Producto p = productodao.consultarProducto(txtID.getText());
            if(producto != null){
                modelo.setRowCount(0);
                listarProductos();
                limpiarDatos();
                String consulta = "Id: "+p.getId()
                        +"\nNomrbe: "+p.getNombre()
                        +"\nTemperatura "+p.getTemperatura()
                        +"\nValor base"+p.getValorBase();
                JOptionPane.showMessageDialog(rootPane, "Se ha encontrado el producto.\n"+consulta,"CONSULTA",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se encontro el producto.");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Digite el ID para consultar un producto.");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        // TODO add your handling code here:
        int fila = tbProductos.getSelectedRow();
        txtID.setText(tbProductos.getValueAt(fila, 0).toString());
        txtNombre.setText(tbProductos.getValueAt(fila, 1).toString());
        txtTemperatura.setText(tbProductos.getValueAt(fila, 2).toString());
        txtValorBase.setText(tbProductos.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tbProductosMouseClicked
    
//    public void consultarDatos(){
//        List<Object> datos = new ArrayList<>(Arrays.asList(txtID.getText(),txtNombre.getText(),Double.parseDouble(txtTemperatura.getText()),Double.parseDouble(txtValorBase.getText())));
//        List<Producto> productos = new ArrayList<>();
//        for(int i = 0; i <= tbProductos.getRowCount()-1; i++){
//            for(int j = 0; j <= tbProductos.getColumnCount()-1; j++){
//                if(datos.contains(tbProductos.getValueAt(i, j))){
//                    productos.add(new Producto(tbProductos.getValueAt(i, 0).toString(),tbProductos.getValueAt(i, 1).toString(),Double.parseDouble(tbProductos.getValueAt(i, 2).toString()),Double.parseDouble(tbProductos.getValueAt(i, 0).toString())));
//                }
//            }
//        }
//        modelo.setRowCount(0);
//        for(Producto p : productos){
//            modelo.addRow(new Object[]{p.getId(),p.getNombre(),p.getTemperatura(),p.getValorBase(),p.calcularCostoAlmacenamiento()});
//        }
//        limpiarDatos();
//    }
    
    
    public void listarProductos(){
        List<Producto> productos = new ArrayList<>();
        productos = productodao.listarProducto();
        if(productos != null){
            for(Producto p : productos){
                modelo.addRow(new Object[]{p.getId(),p.getNombre(),p.getTemperatura(),p.getValorBase(),p.calcularCostoAlmacenamiento()});
            }
        }
    }
    
    public boolean capturarDatos(){
        if(!txtID.getText().equals("") && !txtNombre.getText().equals("") && !txtTemperatura.getText().equals("") && !txtValorBase.getText().equals("")){
            producto.setId(txtID.getText());
            producto.setNombre(txtNombre.getText());
            producto.setTemperatura(Double.parseDouble(txtTemperatura.getText()));
            producto.setValorBase(Double.parseDouble(txtValorBase.getText()));
            return true;
        }else{
            return false;
        }
    }
    
    public void limpiarDatos(){
        txtID.setText("");
        txtNombre.setText("");
        txtTemperatura.setText("");
        txtValorBase.setText("");
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI vista = new GUI();
                vista.setVisible(true);
                vista.setLocationRelativeTo(null);
                vista.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtValorBase;
    // End of variables declaration//GEN-END:variables
}
