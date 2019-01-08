package com.bethel.adminrrhh.model;

import com.bethel.adminrrhh.model.entity.Permisos;
import com.bethel.adminrrhh.model.exception.BethelException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase con la logica de los crud para Permisos
 * @author Erick Chinchilla
 */
public class Crud_Permisos implements Crud<Permisos>{

    private List<Permisos> listaPermisos = new ArrayList<>();
            
    
    @Override
    public List<Permisos> getAll() throws BethelException {
        try {
            listaPermisos.add(new Permisos(1,"vacaciones","activo"));
                              listaPermisos.add(                        new Permisos(2,"usuarios","activo"));
                                                      listaPermisos.add(new Permisos(3,"prestamos","inactivo"));
                                                      listaPermisos.add(new Permisos(4,"empleados","activo"));
                                                      listaPermisos.add(new Permisos(5,"planilla","inactivo"));
            return listaPermisos;
        } catch (Exception ex) {
            String exMessage = ex.getMessage();
        }
        throw new BethelException("No se Pudo obtener el listado de permisos: ", 115, "Permisos", "Seleccion Permisos");
    }


    @Override
    public Permisos getById(long Id) throws BethelException {
        for (Permisos p : listaPermisos) { if(p.getIdPermiso()==Id) return p;}
        return null;
    }

    @Override
    public Boolean exist(long Id) throws BethelException{
        for(Permisos p:listaPermisos ){if(p.getIdPermiso()==Id) return true;}
        return false;
    }

    @Override
    public Boolean save(Permisos entity) throws BethelException{
        try{
         if(exist(entity.getIdPermiso())){
            Permisos p=getById(entity.getIdPermiso());
            p.setNombre(entity.getNombre());
            p.setEstado(entity.getEstado());
            return true;
        }else{
            listaPermisos.add(entity);
            return true;
        }   
        }catch(Exception ex){
          return false;   
        }
    }

    @Override
    public Boolean delete(long Id) throws BethelException{
        if(exist(Id)){
            listaPermisos.remove(getById(Id));
            return true;
        }
        return false;
    }
    
}
