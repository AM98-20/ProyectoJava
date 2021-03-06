/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.text.DecimalFormat;

/**
 *
 * @author Alexander Martinez
 */
public class MostrarDatos extends javax.swing.JFrame {

    /**
     * Creates new form MostrarDatos
     */
    public MostrarDatos(){
        initComponents();
        txt_Nombre.setText(empA.getNombre());
        txt_Id.setText(empA.getIdentidad());
        switch (empA.getEstadocivil()) {
            case 'S':
                txt_Estado.setText("Soltero");
                break;
            case 'C':
                txt_Estado.setText("Casado");
                break;
            case 'V':
                txt_Estado.setText("Viudo");
                break;
            default:
                txt_Estado.setText("Union Libre");
                break;
        }
        if (empA.getGenero() == 'F') {
            txt_Genero.setText("Femenino");
        }else{
            txt_Genero.setText("Masculino");
        }
        txt_Edad.setText("" + empA.getEdad());
        txt_Tiempo.setText("" + empA.getAntiguedad());
        txt_Sueldo.setText("L. "+ dec.format(empA.getSueldo()));
        if (empA.getTipoempleado() == 'A') {
            txt_Puesto.setText("Administrativo");
        }else{
            txt_Puesto.setText("Docente");
        }
        txt_Motivo.setText(empA.getMotivo());
        if (empA.getTipoempleado() == 'A') {
            txt_aguinaldo.setText("L. " + dec.format(admi.getAguinaldo()));
            txt_Decimocuarto.setText("L. " + dec.format(admi.getDecimocuarto()));
            txt_Preaviso.setText("L. " + dec.format(admi.getPreAviso()));
            txt_Cesantia.setText("L. " + dec.format(admi.getCesantia()));
        } else {
            txt_aguinaldo.setText("L. " + dec.format(doc.getAguinaldo()));
            txt_Decimocuarto.setText("L. " + dec.format(doc.getDecimocuarto()));
            txt_Preaviso.setText("L. " + dec.format(doc.getPreaviso()));
            txt_Cesantia.setText("L. " + dec.format(doc.getCesantia()));
        }
        
    }
    cls_Empleado empA = new cls_Empleado();
    DecimalFormat dec = new DecimalFormat("#.00");
    cls_EmpleadoAdmi admi = new cls_EmpleadoAdmi();
    cls_Docente doc = new cls_Docente();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Id = new javax.swing.JLabel();
        lbl_Estado = new javax.swing.JLabel();
        lbl_Laboral = new javax.swing.JLabel();
        lbl_Edad = new javax.swing.JLabel();
        lbl_Genero = new javax.swing.JLabel();
        lbl_Puesto = new javax.swing.JLabel();
        lbl_Sueldo = new javax.swing.JLabel();
        lbl_Prestaciones = new javax.swing.JLabel();
        lbl_Aguinaldo = new javax.swing.JLabel();
        lbl_Decimocuarto = new javax.swing.JLabel();
        lbl_Preaviso = new javax.swing.JLabel();
        lbl_Cesantia = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JLabel();
        txt_Estado = new javax.swing.JLabel();
        txt_Tiempo = new javax.swing.JLabel();
        txt_Id = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JLabel();
        txt_Genero = new javax.swing.JLabel();
        txt_Puesto = new javax.swing.JLabel();
        txt_Sueldo = new javax.swing.JLabel();
        txt_Motivo = new javax.swing.JLabel();
        txt_aguinaldo = new javax.swing.JLabel();
        txt_Decimocuarto = new javax.swing.JLabel();
        txt_Preaviso = new javax.swing.JLabel();
        txt_Cesantia = new javax.swing.JLabel();
        btn_Finalizar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Titulo.setText("Datos Pago Empleado");

        lbl_Nombre.setText("Nombre:");

        lbl_Id.setText("Id:");

        lbl_Estado.setText("Estado Civil:");

        lbl_Laboral.setText("Tiempo Laboral:");

        lbl_Edad.setText("Edad:");

        lbl_Genero.setText("Genero:");

        lbl_Puesto.setText("Puesto:");

        lbl_Sueldo.setText("Sueldo:");

        lbl_Prestaciones.setText("Prestaciones:");

        lbl_Aguinaldo.setText("Aguinaldo:");

        lbl_Decimocuarto.setText("Decimo Cuarto:");

        lbl_Preaviso.setText("Preaviso:");

        lbl_Cesantia.setText("Cesantia:");

        txt_Nombre.setText("--");

        txt_Estado.setText("--");

        txt_Tiempo.setText("--");

        txt_Id.setText("--");

        txt_Edad.setText("--");

        txt_Genero.setText("--");

        txt_Puesto.setText("--");

        txt_Sueldo.setText("--");

        txt_Motivo.setText("--");

        txt_aguinaldo.setText("--");

        txt_Decimocuarto.setText("--");

        txt_Preaviso.setText("--");

        txt_Cesantia.setText("--");

        btn_Finalizar.setText("Finalizar");
        btn_Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinalizarActionPerformed(evt);
            }
        });

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lbl_Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Puesto)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Puesto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Sueldo)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Sueldo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_Laboral)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Tiempo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_Nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Nombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_Estado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Estado)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_Aguinaldo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_aguinaldo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_Decimocuarto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_Decimocuarto)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lbl_Prestaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Motivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Id)
                            .addComponent(lbl_Genero)
                            .addComponent(lbl_Edad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Id)
                            .addComponent(txt_Edad)
                            .addComponent(txt_Genero)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_Preaviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Preaviso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Cesantia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Cesantia)))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Nuevo)
                .addGap(34, 34, 34)
                .addComponent(btn_Finalizar)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Nombre)
                            .addComponent(txt_Nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Estado)
                            .addComponent(txt_Estado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Laboral)
                            .addComponent(txt_Tiempo))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Puesto)
                            .addComponent(txt_Puesto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Sueldo)
                            .addComponent(txt_Sueldo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Prestaciones)
                            .addComponent(txt_Motivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Aguinaldo)
                            .addComponent(txt_aguinaldo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Decimocuarto)
                            .addComponent(txt_Decimocuarto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Id)
                            .addComponent(lbl_Id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Edad)
                            .addComponent(txt_Edad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Genero)
                            .addComponent(txt_Genero))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Preaviso)
                            .addComponent(txt_Preaviso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Cesantia)
                            .addComponent(txt_Cesantia))))
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Finalizar)
                    .addComponent(btn_Nuevo))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinalizarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_FinalizarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        // TODO add your handling code here:
        DatosGenerales prin = new DatosGenerales();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_NuevoActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Finalizar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JLabel lbl_Aguinaldo;
    private javax.swing.JLabel lbl_Cesantia;
    private javax.swing.JLabel lbl_Decimocuarto;
    private javax.swing.JLabel lbl_Edad;
    private javax.swing.JLabel lbl_Estado;
    private javax.swing.JLabel lbl_Genero;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Laboral;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Preaviso;
    private javax.swing.JLabel lbl_Prestaciones;
    private javax.swing.JLabel lbl_Puesto;
    private javax.swing.JLabel lbl_Sueldo;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel txt_Cesantia;
    private javax.swing.JLabel txt_Decimocuarto;
    private javax.swing.JLabel txt_Edad;
    private javax.swing.JLabel txt_Estado;
    private javax.swing.JLabel txt_Genero;
    private javax.swing.JLabel txt_Id;
    private javax.swing.JLabel txt_Motivo;
    private javax.swing.JLabel txt_Nombre;
    private javax.swing.JLabel txt_Preaviso;
    private javax.swing.JLabel txt_Puesto;
    private javax.swing.JLabel txt_Sueldo;
    private javax.swing.JLabel txt_Tiempo;
    private javax.swing.JLabel txt_aguinaldo;
    // End of variables declaration//GEN-END:variables
}
