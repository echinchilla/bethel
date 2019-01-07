package com.bethel.adminrrhh.model;

import com.bethel.adminrrhh.model.exception.BethelException;
import java.util.List;

/**
 * Interfaz para la generación de los métodos CRUD
 * @author Erick Chinchilla
 */
public interface Crud<T> {
    
    /**
     * Obtener todas las entidades almacenadas en la base de datos
     * @return Lista con las entidades encontradas, o una lista vacia en caso de no existir ninguna
     */
    public List<T> getAll() throws BethelException;
    
    /**
     * Obtiene una entidad especifica según su el id 
     * @param Id número identificador por el que se quiere buscar
     * @return la entidad encontrada o null si no existe
     */
    public T getById(long Id) throws BethelException;
    
    /**
     * Verifica la existencia de una entidad según su Id
     * @param Id número del identificador a verificar
     * @return True si exitir o false en caso contrario
     */
    public Boolean exist(long Id) throws BethelException;
    
    /**
     * Guarda los datos de una entidad, si esta ya existe entonces se actualizan los valores 
     * @param entity objecto instanciado que se desea guardar
     * @return True en caso de realizar la operacion con éxito o un false de lo contrario
     */
    public Boolean save(T entity) throws BethelException;
    
    /**
     * Elimina una entidad basado en su identificador
     * @param Id número del identificador de la entidad que se desea eliminar
     * @return True en caso de éxito o false de lo contrario
     */
    public Boolean delete(long Id) throws BethelException;
    
}
