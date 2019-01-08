package com.bethel.adminrrhh.controller;

import com.bethel.adminrrhh.model.Alerta;
import com.bethel.adminrrhh.model.Crud_Permisos;
import com.bethel.adminrrhh.model.entity.Permisos;
import com.bethel.adminrrhh.model.exception.BethelException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public class PermisosController extends Crud_Permisos
{
    
    private static List<Alerta> notificaciones=new ArrayList<Alerta>();
    
    /**
     * método GET para ingresar a la lista 
     * @param model
     * @return string : uri de la pagina correspondiente a la lista de permisos
     */
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        try{
            model.addAttribute("permisos",getAll());   
        }catch(BethelException ex){
            notificaciones.add(Alerta.ERROR(ex.getMensaje()));
        }
        model.addAttribute("notificaciones", notificaciones);
        return "permisosLista";
    }
    
    /**
     * Método GET para ingresar a la vista de detalles
     * @param model
     * @param id : Código del pemiso que se desea ver
     * @return string : uri de la pagina para visualizar los detalles
     */
    @RequestMapping(value = { "/detalles/{id}"}, method = RequestMethod.GET)
    public String detalles(ModelMap model,@PathVariable long id) {
        try{
            model.addAttribute("permiso", getById(id));
        }catch(BethelException ex){
            notificaciones.add(Alerta.ERROR(ex.getMensaje()));
        }
        model.addAttribute("notificaciones", notificaciones);
        return "permisosDetalles";
    }
    
    /**
     * Método para GET para ingresar a la vista de crear
     * @param model
     * @return string : uri de la vista para crear un nuevo permiso
     */
    @RequestMapping(value = { "/crear"}, method = RequestMethod.GET)
    public String crear(ModelMap model) {
        model.addAttribute("permiso",new Permisos());
        return "permisosCrear";
    }
    
    /**
     * Método POST para insertar en la base de datos un nuevo registro
     * @param model
     * @return string : uri de la pagina prncipal del mantenimiento en caso de éxito.
     */
    @RequestMapping(value = { "/crear"}, method = RequestMethod.POST)
    public String insertar(ModelMap model,@ModelAttribute("permiso") Permisos permiso) {
        try {
            if (save(permiso)){
                notificaciones.add(Alerta.EXITO("Permiso Creado Correctamente"));
                model.addAttribute("notificaciones", notificaciones);
                return "redirect:/permisos/";
            }else{
                notificaciones.add(Alerta.ERROR("Permiso NO Creado"));
                model.addAttribute("permiso",permiso);
                return "redirect:/permisos/crear";
            }
        } catch (BethelException ex) {
            notificaciones.add(Alerta.ERROR(ex.getMensaje()));
            model.addAttribute("notificaciones", notificaciones);
            return "redirect:/insertar";
        }
    }
    
    /**
     * Método GET para obtener la vista correspondiente a la actualizacion de un permiso
     * @param model
     * @param id : codigo del permiso que se desea actualizar
     * @return string : uri de la vista que corresponde a la actualización de un registro
     */
    @RequestMapping(value = { "/modificar/{id}"}, method = RequestMethod.GET)
    public String modificar(ModelMap model,@PathVariable long id) {
        try{
            model.addAttribute("permiso", getById(id));
        }catch(BethelException ex){
            notificaciones.add(Alerta.ERROR(ex.getMensaje()));
            return "redirect:/permisos/";
        }
        model.addAttribute("notificaciones", notificaciones);
        notificaciones.clear();
        return "permisosModificar";
    }
    
    /**
     * Método POST para guardar el registro modificado en la base de datos
     * @param model
     * @return URI : de la pagina principal del mantenimiento en caso de éxito.
     */
    @RequestMapping(value = { "/modificar"}, method = RequestMethod.POST)
    public String modificar(ModelMap model,@ModelAttribute("permiso") Permisos permiso) {
        try{
            if(save(permiso)){
                notificaciones.add(Alerta.EXITO("Permiso Actualizado Correctamente"));
                model.addAttribute("notificaciones", notificaciones);
                return "redirect:/permisos/";
            }
            else{
                notificaciones.add(Alerta.ERROR("Permiso No Actualizado"));
                model.addAttribute("notificaciones", notificaciones);
                notificaciones.clear();
                return "redirect:/permisos/modificar";
            }
        }catch(BethelException ex){
            notificaciones.add(Alerta.ERROR(ex.getMensaje()));
            model.addAttribute("notificaciones", notificaciones);
            notificaciones.clear();
            return "redirect:/modificar";
        }
    }
    
    /**
     * Método GET para obtener la vista que permite eliminar un registro 
     * @param model
     * @param id : código del permiso que se desea eliminar.
     * @return string: uri de la vista que permite realizar la eliminación.
     */
    @RequestMapping(value = { "/eliminar/{id}"}, method = RequestMethod.GET)
    public String eliminar(ModelMap model,@PathVariable long id) {
        try{
            model.addAttribute("permiso", getById(id));
        }catch(BethelException ex){
            notificaciones.add(Alerta.ERROR(ex.getMensaje()));
            return "redirect:/permisos/";
        }
        model.addAttribute("notificaciones", notificaciones);
        return "permisosEliminar";
    }
    
    /**
     * Método POST para confirmar la eliminación del registro en la base de datos, ejecuta la accion.
     * @param model
     * @return string :uri de la pagina principal del mantenimiento en caso de éxito.
     */
    @RequestMapping(value = { "/eliminar"}, method = RequestMethod.POST)
    public String eliminar(ModelMap model,@ModelAttribute("permiso") Permisos permiso) {
        try{
            if(delete(permiso.getIdPermiso())){
                notificaciones.add(Alerta.EXITO("Permiso Eliminado Correctamnete"));
                model.addAttribute("notificaciones", notificaciones);
                return "redirect:/permisos/";
            }else{
                notificaciones.add(Alerta.ERROR("Permiso No Eliminado"));
                model.addAttribute("notificaciones", notificaciones);
                return "redirect:/permisos/eliminar/"+permiso.getIdPermiso();
            }
            
        }catch(BethelException ex){
            notificaciones.add(Alerta.ERROR(ex.getMensaje()));
            model.addAttribute("notificaciones", notificaciones);
            notificaciones.clear();
            return "redirect:/permisos/eliminar";
        }
    }
}
