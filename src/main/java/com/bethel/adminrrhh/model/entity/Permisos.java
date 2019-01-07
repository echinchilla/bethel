package com.bethel.adminrrhh.model.entity;

/**
 * Entidad Permisos, según los campos existentes en la base de datos.
 * @author Erick Chinchilla
 */
public class Permisos {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    // número de identificador del permiso
    private int IdPermiso;
    
    // nombre del permiso
    private String Nombre;
    
    // estado del permiso
    private String Estado;
    
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    /**
     * Constructor Vacio
     */
    public Permisos() {
        this(0,"","");
    }
    
    /**
     * Constructor con inicialización de valores
     * @param IdPermiso número entero de identificador
     * @param Nombre descripción del permiso
     * @param Estado estado del permiso
     */
    public Permisos(int IdPermiso, String Nombre, String Estado) {
        this.IdPermiso = IdPermiso;
        this.Nombre = Nombre;
        this.Estado = Estado;
    }
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Get/Set">
    
    /**
     * Obtiene el valor del Identificador del permiso
     * @return número entero 
     */
    public int getIdPermiso() {
        return IdPermiso;
    }

    /**
     * Ingresa un valor nuevo para el identificador
     * @param IdPermiso número entero correspondiente al nuevo valor
     */
    public void setIdPermiso(int IdPermiso) {
        this.IdPermiso = IdPermiso;
    }

    /**
     * Obtiene el nombre del permiso
     * @return string con el nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Ingresa un valor nuevo para el nombre
     * @param Nombre string con el nuevo nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene string con el valor del estado del permiso
     * @return string con el estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * Ingresa un nuevo valor para el estado del permiso
     * @param Estado string con nuevo valor
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Otros Métodos">
    
    /**
     * Obtiene una descripción del identificador y el nombre que posee el permiso 
     * @return string con el nombre e identificador 
     */
    @Override
    public String toString(){
        return getIdPermiso()+ " - "+getNombre();
    }
    
    // </editor-fold>
    
}
