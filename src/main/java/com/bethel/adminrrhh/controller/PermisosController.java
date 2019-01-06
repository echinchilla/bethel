package com.bethel.adminrrhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase controlador para el mantenimiento de Permisos.
 * 
 * @author Erick Chinchilla
 * @version 1.0
 */

@Controller
@RequestMapping("/permisos")
public class PermisosController {
    
    /**
     * método GET para ingresar a la lista 
     * @param model
     * @return string : uri de la pagina correspondiente a la lista de permisos
     */
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "permisosLista";
    }
    
    /**
     * Método GET para ingresar a la vista de detalles
     * @param model
     * @param id : Código del pemiso que se desea ver
     * @return string : uri de la pagina para visualizar los detalles
     */
    @RequestMapping(value = { "/detalles/{id}"}, method = RequestMethod.GET)
    public String detalles(ModelMap model,@PathVariable int id) {
        return "permisosDetalles";
    }
    
    /**
     * Método para GET para ingresar a la vista de crear
     * @param model
     * @return string : uri de la vista para crear un nuevo permiso
     */
    @RequestMapping(value = { "/crear"}, method = RequestMethod.GET)
    public String crear(ModelMap model) {
        return "permisosCrear";
    }
    
    /**
     * Método POST para insertar en la base de datos un nuevo registro
     * @param model
     * @return string : uri de la pagina prncipal del mantenimiento en caso de éxito.
     */
    @RequestMapping(value = { "/crear"}, method = RequestMethod.POST)
    public String insertar(ModelMap model) {
        return "permisosLista";
    }
    
    /**
     * Método GET para obtener la vista correspondiente a la actualizacion de un permiso
     * @param model
     * @param id : codigo del permiso que se desea actualizar
     * @return string : uri de la vista que corresponde a la actualización de un registro
     */
    @RequestMapping(value = { "/modificar/{id}"}, method = RequestMethod.GET)
    public String modificar(ModelMap model,@PathVariable int id) {
        return "permisosModificar";
    }
    
    /**
     * Método POST para guardar el registro modificado en la base de datos
     * @param model
     * @return URI : de la pagina principal del mantenimiento en caso de éxito.
     */
    @RequestMapping(value = { "/modificar"}, method = RequestMethod.POST)
    public String modificar(ModelMap model) {
        return "permisosLista";
    }
    
    /**
     * Método GET para obtener la vista que permite eliminar un registro 
     * @param model
     * @param id : código del permiso que se desea eliminar.
     * @return string: uri de la vista que permite realizar la eliminación.
     */
    @RequestMapping(value = { "/eliminar/{id}"}, method = RequestMethod.GET)
    public String eliminar(ModelMap model,@PathVariable int id) {
        return "permisosEliminar";
    }
    
    /**
     * Método POST para confirmar la eliminación del registro en la base de datos, ejecuta la accion.
     * @param model
     * @return string :uri de la pagina principal del mantenimiento en caso de éxito.
     */
    @RequestMapping(value = { "/eliminar"}, method = RequestMethod.POST)
    public String eliminar(ModelMap model) {
        return "permisosLista";
    }
}
