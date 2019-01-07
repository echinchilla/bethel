package com.bethel.adminrrhh.model;

import com.bethel.adminrrhh.model.entity.Perfil;
import com.bethel.adminrrhh.model.exception.BethelException;
import java.util.List;

/**
 * Clase con la logica de los crud para Perfil
 * @author Erick Chinchilla
 */
public class Crud_Perfil implements Crud<Perfil>{

    @Override
    public List<Perfil> getAll() throws BethelException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Perfil getById(long Id) throws BethelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean exist(long Id) throws BethelException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean save(Perfil entity) throws BethelException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(long Id) throws BethelException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
