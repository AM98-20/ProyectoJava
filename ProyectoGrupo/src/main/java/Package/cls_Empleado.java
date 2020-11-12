/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Oscar Andrade
 */
public class cls_Empleado {

    //Atributos
    protected static String _nombre;
    protected static int _tiempolaboral;
    protected static char _genero;
    protected static char _estadocivil;
    protected static char _tipoempleado;
    protected static double _sueldo;
 
    //Propiedades
    
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getTiempolaboral() {
        return _tiempolaboral;
    }

    public void setTiempolaboral(int _tiempolaboral) {
        this._tiempolaboral = _tiempolaboral;
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

    //Metodos
    protected double CalcularSueldo()
    {
        return 0;
    }
    
    private void MostrarDatos()
    {
        
    }
    
   
   
    
    
    
    
    
}
