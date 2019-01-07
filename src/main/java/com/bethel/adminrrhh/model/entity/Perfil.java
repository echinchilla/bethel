package com.bethel.adminrrhh.model.entity;

/**
 * Entidad Perfil con respectos a los campos de la tabla en la base de datos
 * @author Erick Chinchilla
 */
public class Perfil {
   
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    // número de identificador del perfil
    private int IdPerfil;
    
    // nombre del perfil
    private String Nombre;
    
    // estado del perfil
    private String Estado;
    
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    /**
     * Constructor Vacio
     */
    public Perfil() {
        this(0,"","");
    }
    
    /**
     * Constructor con inicialización de valores
     * @param IdPerfil número entero de identificador
     * @param Nombre descripción del perfil
     * @param Estado estado del perfil
     */
    public Perfil(int IdPerfil, String Nombre, String Estado) {
        this.IdPerfil = IdPerfil;
        this.Nombre = Nombre;
        this.Estado = Estado;
    }
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Get/Set">
    
    /**
     * Obtiene el valor del Identificador del perfil
     * @return número entero 
     */
    public int getIdPerfil() {
        return IdPerfil;
    }

    /**
     * Ingresa un valor nuevo para el identificador
     * @param IdPerfil número entero correspondiente al nuevo valor
     */
    public void setIdPerfil(int IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    /**
     * Obtiene el nombre del perfil
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
     * Obtiene string con el valor del estado del perfil
     * @return string con el estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * Ingresa un nuevo valor para el estado del perfil
     * @param Estado string con nuevo valor
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Otros Métodos">
    
    /**
     * Obtiene una descripción del identificador y el nombre que posee el perfil 
     * @return string con el nombre e identificador 
     */
    @Override
    public String toString(){
        return getIdPerfil()+ " - "+getNombre();
    }
    
    // </editor-fold>
    
}
