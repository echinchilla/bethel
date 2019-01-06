package com.bethel.adminrrhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Erick Chinchilla
 */

@Controller
@RequestMapping("/permisos")
public class PermisosController {
    
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "permisosLista";
    }
    
    @RequestMapping(value = { "/crear"}, method = RequestMethod.GET)
    public String crear(ModelMap model) {
        return "permisosCrear";
    }
    
    @RequestMapping(value = { "/modificar"}, method = RequestMethod.GET)
    public String modificar(ModelMap model) {
        return "permisosModificar";
    }
    
    @RequestMapping(value = { "/eliminar"}, method = RequestMethod.GET)
    public String eliminar(ModelMap model) {
        return "permisosEliminar";
    }
}
