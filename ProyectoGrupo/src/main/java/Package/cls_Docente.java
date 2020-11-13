/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Kenia Martinez
 */
public class cls_Docente extends cls_Empleado {
    //METODOS
    private static double aguinaldo = 0;
    private static double decimocuarto = 0;
    private static double preaviso = 0;
    private static double cesantia = 0;
    private static int numClases = 0;
    private static double pagoClase = 0;

    //PROPIEDADES ACCESORAS

    public double getAguinaldo() {
        return aguinaldo;
    }

    public void setAguinaldo(double aguinaldo) {
        cls_Docente.aguinaldo = aguinaldo;
    }

    public double getDecimocuarto() {
        return decimocuarto;
    }

    public void setDecimocuarto(double decimocuarto) {
        cls_Docente.decimocuarto = decimocuarto;
    }

    public double getPreaviso() {
        return preaviso;
    }

    public void setPreaviso(double preaviso) {
        cls_Docente.preaviso = preaviso;
    }

    public double getCesantia() {
        return cesantia;
    }

    public void setCesantia(double cesantia) {
        cls_Docente.cesantia = cesantia;
    }

    public int getNumClases() {
        return numClases;
    }

    public void setNumClases(int numClases) {
        cls_Docente.numClases = numClases;
    }

    public double getPagoClase() {
        return pagoClase;
    }

    public void setPagoClase(double pagoClase) {
        cls_Docente.pagoClase = pagoClase;
    }

    //METODOS
    @Override
    protected double CalcularSueldo() {
        _sueldo = numClases * pagoClase;
        return _sueldo;
    }
    
    @Override
    protected double CalcularPrestaciones(){
        return preaviso + cesantia + aguinaldo + decimocuarto;
    }
    
    public double CalculoCesantia(){
        cesantia = _sueldo * getAntiguedad();
        return cesantia;
    }
    
    public double CalculoPreaviso(){
        preaviso = (2*_sueldo);
        return preaviso;
    }
    
    public double CalculoAguinaldo(){
        aguinaldo = _sueldo * 0.50;
        return aguinaldo;
    }
    
    public double CalculoDecimo(){
        decimocuarto = _sueldo * 0.50;
        return decimocuarto;
    }
}
