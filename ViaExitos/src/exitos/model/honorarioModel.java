/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exitos.model;

import exitos.cons.Constante;
import exitos.entity.honorario;

/**
 *
 * @author Gustavo
 */
public class honorarioModel {

    public honorarioModel() {
    }
    
    public void procesar_datos(honorario ho){
        double total=ho.getDias_trabajados()*ho.getHoras_diarias()*ho.getPago_x_hora();
        double impuesto=0;
        if (total>=1500) {
            impuesto=Constante.IMPUESTO*total;
            total=total-impuesto;
               
        }
        
        ho.setTotal_a_pagar(total);
        ho.setImpuesto(impuesto);
        
    }
    
    
    
}
