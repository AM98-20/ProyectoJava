/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Oscar Andrade
 */
public class DatosGenerales extends javax.swing.JFrame {

    /**
     * Creates new form DatosGenerales
     */
    public DatosGenerales() {
        initComponents();
    }
    
    cls_Empleado Empleado = new cls_Empleado();
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg_EstadoCivil = new javax.swing.ButtonGroup();
        btg_Genero = new javax.swing.ButtonGroup();
        btg_TipoEmpleado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tb_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rb_Soltero = new javax.swing.JRadioButton();
        rb_Casado = new javax.swing.JRadioButton();
        rb_UnionLibre = new javax.swing.JRadioButton();
        rb_Viudo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rb_Administrativo = new javax.swing.JRadioButton();
        rb_Docente = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rb_Masculino = new javax.swing.JRadioButton();
        rb_Femenino = new javax.swing.JRadioButton();
        b_Aceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tb_DNI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        js_Nac_dia = new javax.swing.JSpinner();
        js_Nac_mes = new javax.swing.JSpinner();
        js_Nac_anio = new javax.swing.JSpinner();
        js_Ingreso_dia = new javax.swing.JSpinner();
        js_Ingreso_mes = new javax.swing.JSpinner();
        js_Ingreso_anio = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Datos Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 210, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 50, 20));
        getContentPane().add(tb_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, -1));

        jLabel3.setText("Fecha Ingreso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        btg_EstadoCivil.add(rb_Soltero);
        rb_Soltero.setSelected(true);
        rb_Soltero.setText("Soltero");

        btg_EstadoCivil.add(rb_Casado);
        rb_Casado.setText("Casado");

        btg_EstadoCivil.add(rb_UnionLibre);
        rb_UnionLibre.setText("Union Libre");

        btg_EstadoCivil.add(rb_Viudo);
        rb_Viudo.setText("Viudo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_Viudo)
                    .addComponent(rb_UnionLibre)
                    .addComponent(rb_Casado)
                    .addComponent(rb_Soltero))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_Soltero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_Casado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_UnionLibre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_Viudo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, -1));

        btg_TipoEmpleado.add(rb_Administrativo);
        rb_Administrativo.setSelected(true);
        rb_Administrativo.setText("Administrativo");

        btg_TipoEmpleado.add(rb_Docente);
        rb_Docente.setText("Docente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_Administrativo)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_Docente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_Administrativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_Docente)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        btg_Genero.add(rb_Masculino);
        rb_Masculino.setSelected(true);
        rb_Masculino.setText("Masculino");

        btg_Genero.add(rb_Femenino);
        rb_Femenino.setText("Femenino");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_Masculino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_Femenino)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rb_Masculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_Femenino)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        b_Aceptar.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        b_Aceptar.setText("Aceptar");
        b_Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        b_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(b_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Empleado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Estado Civil");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Genero");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));
        getContentPane().add(tb_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        jLabel8.setText("DNI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel9.setText("Nacimiento");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 20));

        js_Nac_dia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(js_Nac_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        js_Nac_mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(js_Nac_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        js_Nac_anio.setModel(new javax.swing.SpinnerNumberModel(1950, null, 2020, 1));
        getContentPane().add(js_Nac_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        js_Ingreso_dia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(js_Ingreso_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        js_Ingreso_mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(js_Ingreso_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        js_Ingreso_anio.setModel(new javax.swing.SpinnerNumberModel(1950, null, 2020, 1));
        getContentPane().add(js_Ingreso_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_AceptarActionPerformed
        // TODO add your handling code here:
        
        int dianacimiento;
        int mesnacimiento;
        int anionacimiento;
        
        int diaingreso;
        int mesingreso;
        int anioingreso;
        
       
        if(tb_Nombre.getText().isEmpty())
        {
            Empleado.setNombre("Default");
        }
        else
        {
            Empleado.setNombre(tb_Nombre.getText());
        }
        
        if(tb_DNI.getText().isEmpty())
        {
           Empleado.setIdentidad("0000-0000-0000");
        }
        else
        {
            Empleado.setIdentidad(tb_DNI.getText());
        }
       dianacimiento = (int) js_Nac_dia.getValue();
       mesnacimiento = (int) js_Nac_mes.getValue();
       anionacimiento = (int) js_Nac_anio.getValue();
       
       diaingreso = (int) js_Ingreso_dia.getValue();
       mesingreso = (int) js_Ingreso_mes.getValue();
       anioingreso = (int) js_Ingreso_anio.getValue();
       
       Empleado.CalcularEdad(dianacimiento, mesnacimiento, anionacimiento);
       Empleado.CalcularAntiguedad(diaingreso, mesingreso, anioingreso);
        
        
        //Estado Civil
        if(rb_Soltero.isSelected())
        {
            Empleado.setEstadocivil('S');
        }
        else if(rb_Casado.isSelected())
        {
            Empleado.setEstadocivil('C');
        }
        else if(rb_Viudo.isSelected())
        {
            Empleado.setEstadocivil('V');
        }
        else
        {
            Empleado.setEstadocivil('U');
        }
        
        //Genero
        if(rb_Masculino.isSelected())
        {
            Empleado.setGenero('M');
        }
        else
        {
            Empleado.setGenero('F');
        }
        
        //Tipo Empleado
        if(rb_Administrativo.isSelected())
        {
            Empleado.setTipoempleado('A');
            frm_EmpleadoAdmi Administracion = new frm_EmpleadoAdmi();
            Administracion.setVisible(true);
        }
        else
        {
            Empleado.setTipoempleado('D');
            Docentes Profesor = new Docentes();
            Profesor.setVisible(true);
        }

       //Empleado.MostrarDatos();
       
       
       
       
    }//GEN-LAST:event_b_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(DatosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosGenerales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Aceptar;
    private javax.swing.ButtonGroup btg_EstadoCivil;
    private javax.swing.ButtonGroup btg_Genero;
    private javax.swing.ButtonGroup btg_TipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner js_Ingreso_anio;
    private javax.swing.JSpinner js_Ingreso_dia;
    private javax.swing.JSpinner js_Ingreso_mes;
    private javax.swing.JSpinner js_Nac_anio;
    private javax.swing.JSpinner js_Nac_dia;
    private javax.swing.JSpinner js_Nac_mes;
    private javax.swing.JRadioButton rb_Administrativo;
    private javax.swing.JRadioButton rb_Casado;
    private javax.swing.JRadioButton rb_Docente;
    private javax.swing.JRadioButton rb_Femenino;
    private javax.swing.JRadioButton rb_Masculino;
    private javax.swing.JRadioButton rb_Soltero;
    private javax.swing.JRadioButton rb_UnionLibre;
    private javax.swing.JRadioButton rb_Viudo;
    private javax.swing.JTextField tb_DNI;
    private javax.swing.JTextField tb_Nombre;
    // End of variables declaration//GEN-END:variables
}
