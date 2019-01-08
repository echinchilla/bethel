package com.bethel.adminrrhh.model;

/**
 *
 * @author Erick Chinchilla
 */
public class Alerta {
    
    private String Estilo;
    private String Titulo;
    private String Mensaje;

    public String getEstilo() {
        return Estilo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    private Alerta(String Estilo,String Titulo ,String Mensaje){
        this.Estilo=Estilo;
        this.Titulo=Titulo;
        this.Mensaje=Mensaje;
    }
  
    public static Alerta EXITO(String Mensaje){
        return new Alerta("toast-success","Éxio",Mensaje);
    }
    
    public static Alerta ERROR(String Mensaje){
        return new Alerta("toast-danger","Error",Mensaje);
    }
    
    public static Alerta INFO(String Mensaje){
        return new Alerta("toast-info","Atención",Mensaje);
    }
    
    public static Alerta ADVERTENCIA(String Mensaje){
        return new Alerta("toast-warning","Advertencia",Mensaje);
    }
    
    public static Alerta DEFECTO(String Mensaje){
        return new Alerta("toast-default","",Mensaje);
    }
    
}
