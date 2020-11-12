/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Walter Amador
 */
public class cls_EmpleadoAdmi extends cls_Empleado{
    
    private static double aguinaldo = 0;
    private static double decimocuarto = 0;
    private static double preAviso = 0;
    private static double cesantia = 0;
    private static double totalPrestaciones;
    
    public void calcularAguinaldo(){
        cls_EmpleadoAdmi.aguinaldo = getSueldo() * 0.5;
    }
    
    public void calcularDecimocuarto(){
        cls_EmpleadoAdmi.decimocuarto = getSueldo() * 0.5;
    }
    
    public void calcularPreAviso(boolean avisado){
        if(avisado){
            cls_EmpleadoAdmi.preAviso = 0;
        }else{
            cls_EmpleadoAdmi.preAviso = getSueldo() * 2;
        }
    }
    
    public void calcularCesantia(){
        cls_EmpleadoAdmi.cesantia = getSueldo() * getTiempolaboral();
    }
}
