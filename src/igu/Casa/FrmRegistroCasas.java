

package igu.Casa;

import Control.Casa.CasaControl;



import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import controlador.Utiles.Utiles;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Casa;
import vista.listas.tablas.ModeloTablaCasa;



/**
 *
 * @author sebastian
 */

public class FrmRegistroCasas extends javax.swing.JFrame {
    private CasaControl casaControl = new CasaControl();
    private controlador.Casa.CasaControl control = new controlador.Casa.CasaControl();
    private ModeloTablaCasa modelotabla = new ModeloTablaCasa();
    

    private void cargarVista(){
        int fila = tablaCasas.getSelectedRow();
        if(fila < 0){
            JOptionPane.showMessageDialog(null, "Escoja un registro de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                casaControl.setCasa(modelotabla.getCasas().getInfo(fila));
                txtArea.setText(casaControl.getCasa().getArea());
                txtDireccion.setText(casaControl.getCasa().getDireccion());
                txtDimension.setText(casaControl.getCasa().getDimension());
                txtTipoCasa.setText(casaControl.getCasa().getTipo());
               
            } catch (EmptyException ex) {
                Logger.getLogger(FrmRegistroCasas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 public void cargarCasas(DynamicList<Casa> casas) {
        modelotabla.setCasas(casas);
    }

    public Boolean verificar() {
        return (!txtArea.getText().trim().isEmpty()
                && !txtDimension.getText().trim().isEmpty()
                && !txtTipoCasa.getText().trim().isEmpty()
                && !txtDireccion.getText().trim().isEmpty());
    }

    private void cargarTabla() {
        modelotabla.setCasas(control.all());
        tablaCasas.setModel(modelotabla);
        tablaCasas.updateUI();
    }
    
    private void modificar() {
        if (verificar()) {
             {
                casaControl.getCasa().setDimension(txtDimension.getText());
                casaControl.getCasa().setArea(txtArea.getText());
                casaControl.getCasa().setDireccion(txtDireccion.getText());
                casaControl.getCasa().setTipo(txtTipoCasa.getText());
                
                if (casaControl.guardar()) {
                    control.merge(casaControl.getCasa(),tablaCasas.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Datos guardados");
                    cargarTabla();
                    limpiar();
                    casaControl.setCasa(null);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo guardar, hubo un error");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falta llenar campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardar() throws EmptyException {
        if (verificar()) {
                casaControl.getCasa().setArea(txtArea.getText());
                casaControl.getCasa().setDimension(txtDimension.getText());
                casaControl.getCasa().setDireccion(txtDireccion.getText());
                casaControl.getCasa().setTipo(txtTipoCasa.getText());
                
        if (casaControl.guardar()) {
            control.persist(casaControl.getCasa());
            JOptionPane.showMessageDialog(null, "Datos guardados");
            cargarTabla();
            limpiar();
            
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar, hubo un error");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Falta llenar campos", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void limpiar() {
      
        
        tablaCasas.clearSelection();
        txtArea.setText("");
        txtDireccion.setText("");
        txtDimension.setText("");
        txtTipoCasa.setText("");
        cargarTabla();
        casaControl.setCasa(null);
        
    }
    
     public FrmRegistroCasas() throws EmptyException {
        initComponents();
        limpiar();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDimension = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTipoCasa = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCasas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRO CASAS");

        jLabel2.setText("DIMENSION");

        jLabel3.setText("AREA");

        jLabel4.setText("DIRECCION:");

        jLabel5.setText("TIPO DE CASA:");

        txtDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDimensionActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tablaCasas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaCasas);

        jLabel6.setText("CASAS REGISTRADAS");

        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTipoCasa, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDimension)
                                        .addComponent(txtDireccion)
                                        .addComponent(txtArea))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardar)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeleccionar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTipoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnSeleccionar))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDimensionActionPerformed

    }//GEN-LAST:event_txtDimensionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 try {
            guardar();
        } catch (EmptyException ex) {
            System.out.println(ex.getMessage());
        }
              
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        cargarVista();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

 
     public static void main(String args[]) {
   
  
        java.awt.EventQueue.invokeLater(new Runnable() {
           
           public void run() {
                try {
                    new FrmRegistroCasas().setVisible(true);
                } catch (EmptyException ex) {
                    Logger.getLogger(FrmRegistroCasas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCasas;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDimension;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtTipoCasa;
    // End of variables declaration//GEN-END:variables
}
