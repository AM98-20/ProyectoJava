/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Andrade
 */
public class cls_Empleado {

    protected  static String _nombre;
    protected  static int _antiguedad;
    protected  static char _genero;
    protected  static char _estadocivil;
    protected  static char _tipoempleado;
    protected  static double _sueldo;
    protected  static int _edad;
    protected  static String _identidad;
    
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getAntiguedad() {
        return _antiguedad;
    }

    public void setAntiguedad(int _antiguedad) {
        this._antiguedad = _antiguedad;
    }

    public char getGenero() {
        return _genero;
    }

    public void setGenero(char _genero) {
        this._genero = _genero;
    }

    public char getEstadocivil() {
        return _estadocivil;
    }

    public void setEstadocivil(char _estadocivil) {
        this._estadocivil = _estadocivil;
    }

    public char getTipoempleado() {
        return _tipoempleado;
    }

    public void setTipoempleado(char _tipoempleado) {
        this._tipoempleado = _tipoempleado;
    }

    public double getSueldo() {
        return _sueldo;
    }

    public void setSueldo(double _sueldo) {
        this._sueldo = _sueldo;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public String getIdentidad() {
        return _identidad;
    }

    //Atributos
    public void setIdentidad(String _identidad) {
        this._identidad = _identidad;
    }
 
 
    //Propiedades
    
    
    //Metodos
    protected double CalcularSueldo()
    {
        return 0;
    }
    
    protected double CalcularPrestaciones()
    {
        return 0;
    }
    
    protected void MostrarDatos()
    {
        System.out.print(""+getNombre());
        System.out.println(" "+getIdentidad());
        System.out.println(" "+getEstadocivil());
        System.out.println(" "+getGenero());
        System.out.println(" "+getTipoempleado());
        System.out.println(" "+getAntiguedad());
        System.out.println(" "+getEdad());
    }
    
    protected void CalcularEdad(int dia, int mes, int anio)
    {
        Calendar fechaActual = Calendar.getInstance();
        
        int years = fechaActual.get(Calendar.YEAR) - anio;
        int months = fechaActual.get(Calendar.MONTH) - mes;
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) -dia ;
 
        
          if(months < 0 || (months==0 && days < 0))
          { 
            years--;
          }
         _edad = years;
        
    }
    protected void CalcularAntiguedad(int dia, int mes, int anio)
    {
        Calendar fechaActual = Calendar.getInstance();
        
        int years = fechaActual.get(Calendar.YEAR) - anio;
        int months = fechaActual.get(Calendar.MONTH) - mes;
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) -dia ;
 
        
          if(months < 0 || (months==0 && days < 0))
          { 
            years--;
          }
         _antiguedad = years;     

        
    }
   
   
    
    
    
    
    
}
