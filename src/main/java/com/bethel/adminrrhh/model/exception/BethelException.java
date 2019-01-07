package com.bethel.adminrrhh.model.exception;

/**
 * Clase para manejo de excepciones personalizadas 
 * @author Erick Chinchilla
 */
public class BethelException extends Exception{
    
    private int Codigo;
    private String Mensaje;
    private String Controlador;
    private String Accion;

    public BethelException(String Mensaje,int Codigo, String Controlador, String Accion) {
        super(Mensaje);
        this.Codigo = Codigo;
        this.Mensaje = Mensaje;
        this.Controlador = Controlador;
        this.Accion = Accion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getControlador() {
        return Controlador;
    }

    public void setControlador(String Controlador) {
        this.Controlador = Controlador;
    }

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    @Override
    public String toString() {
        return "Ocurrio un Error no Controlado, En Caso de Continuar Informe al Administrador del Sistema. Más Detalles del Error: \n \n" + "Codigo=" + Codigo + ", \nDescripción=" + Mensaje + ", \nUbicación=" + Controlador + ", \nAccion=" + Accion;
    }
    
    
    
    
    
}
