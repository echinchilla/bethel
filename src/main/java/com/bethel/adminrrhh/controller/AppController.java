/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bethel.adminrrhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase Controlador del App Home
 * @author echin
 */

@Controller
@RequestMapping("/")
public class AppController {
    
    /**
     * Método GET para acceder a la pagina de inicio de la app
     * @param model
     * @return string : uri de la pagina de inicio de la app
     */
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }
        
}
