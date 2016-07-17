/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exitos.controller;

import exitos.entity.honorario;
import exitos.model.honorarioModel;

/**
 *
 * @author Gustavo
 */
public class honorarioController {
    
    honorarioModel model;

    public honorarioController() {
        
        model=new honorarioModel();
    }
    
    public void calcular_honorario(honorario x){
        model.procesar_datos(x);
    }

    
}
