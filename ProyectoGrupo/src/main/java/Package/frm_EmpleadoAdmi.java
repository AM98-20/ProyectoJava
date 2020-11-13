
package Package;

import javax.swing.JOptionPane;

public class frm_EmpleadoAdmi extends javax.swing.JFrame {

    public frm_EmpleadoAdmi() {
        initComponents();
        
        
        lblNombre.setText(admi.getNombre());
        lblidentidad.setText(admi.getIdentidad());
        lblAniosLaborados.setText(String.valueOf(admi.getAntiguedad()));
        
    }
    
    //Instancia a la clase Empleado Administrativo
    private cls_EmpleadoAdmi admi = new cls_EmpleadoAdmi();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_Motivo = new javax.swing.ButtonGroup();
        btnGroupAvisado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAvisado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txt_sueldoMensual = new javax.swing.JTextField();
        rb_despido = new javax.swing.JRadioButton();
        rb_renuncia = new javax.swing.JRadioButton();
        btnCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblAniosLaborados = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblidentidad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rb_avisadoSI = new javax.swing.JRadioButton();
        rb_avisadoNO = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Empleado Administrativo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 310, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sueldo Mensual:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lblAvisado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAvisado.setText("¿Fue avisado?");
        getContentPane().add(lblAvisado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("---");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, -1));

        txt_sueldoMensual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_sueldoMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, -1));

        btnGroup_Motivo.add(rb_despido);
        rb_despido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_despido.setSelected(true);
        rb_despido.setText("Despido");
        rb_despido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_despidoActionPerformed(evt);
            }
        });
        getContentPane().add(rb_despido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        btnGroup_Motivo.add(rb_renuncia);
        rb_renuncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_renuncia.setText("Renuncia");
        getContentPane().add(rb_renuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular Prestaciones");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblAniosLaborados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAniosLaborados.setText("---");
        getContentPane().add(lblAniosLaborados, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Identidad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblidentidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblidentidad.setText("---");
        getContentPane().add(lblidentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Motivo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        btnGroupAvisado.add(rb_avisadoSI);
        rb_avisadoSI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_avisadoSI.setSelected(true);
        rb_avisadoSI.setText("Si");
        getContentPane().add(rb_avisadoSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        btnGroupAvisado.add(rb_avisadoNO);
        rb_avisadoNO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_avisadoNO.setText("No");
        rb_avisadoNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_avisadoNOActionPerformed(evt);
            }
        });
        getContentPane().add(rb_avisadoNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Años laborados:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean tryParse(String txt, Class<?> cls){
        try {
            if(cls == int.class){
                Integer.parseInt(txt);
                
            }else if(cls == double.class){
                Double.parseDouble(txt);
            }
            
            return true;
            
            
        } catch (Exception e) {
            return false;
        }
    }
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        double sueldo;
        
        if(tryParse(txt_sueldoMensual.getText(), double.class)){
            sueldo = Double.parseDouble(txt_sueldoMensual.getText());
            
            if(sueldo > 0){
                
                admi.setSueldo(sueldo);
                
                if(rb_despido.isSelected()){
                    admi.setMotivo(rb_despido.getName());
                    
                    admi.calcularPreAviso(rb_avisadoSI.isSelected());
                    admi.calcularAguinaldo();
                    admi.calcularDecimocuarto();
                    admi.calcularCesantia();
                    
                    admi.CalcularPrestaciones();
                    
                }else{
                    admi.setMotivo(rb_renuncia.getName());
                    
                    admi.calcularAguinaldo();
                    admi.calcularDecimocuarto();
                    admi.CalcularPrestaciones();
                }
                
                MostrarDatos mostrarDatos = new MostrarDatos();
                mostrarDatos.setVisible(true);
                this.dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un sueldo positivo","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el sueldo correctamente","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rb_despidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_despidoActionPerformed
        if(rb_despido.isSelected()){
            lblAvisado.setVisible(true);
            rb_avisadoSI.setVisible(true);
            rb_avisadoNO.setVisible(true);
        }else{
            lblAvisado.setVisible(false);
            rb_avisadoSI.setVisible(false);
            rb_avisadoNO.setVisible(false);
        }
    }//GEN-LAST:event_rb_despidoActionPerformed

    private void rb_avisadoNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_avisadoNOActionPerformed
        if(rb_despido.isSelected()){
            lblAvisado.setVisible(true);
            rb_avisadoSI.setVisible(true);
            rb_avisadoNO.setVisible(true);
        }else{
            lblAvisado.setVisible(false);
            rb_avisadoSI.setVisible(false);
            rb_avisadoNO.setVisible(false);
        }
    }//GEN-LAST:event_rb_avisadoNOActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_EmpleadoAdmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup btnGroupAvisado;
    private javax.swing.ButtonGroup btnGroup_Motivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAniosLaborados;
    private javax.swing.JLabel lblAvisado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblidentidad;
    private javax.swing.JRadioButton rb_avisadoNO;
    private javax.swing.JRadioButton rb_avisadoSI;
    private javax.swing.JRadioButton rb_despido;
    private javax.swing.JRadioButton rb_renuncia;
    private javax.swing.JTextField txt_sueldoMensual;
    // End of variables declaration//GEN-END:variables
}
