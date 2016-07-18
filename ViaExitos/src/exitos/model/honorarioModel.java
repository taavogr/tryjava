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
        double impuesto=total*Constante.IMPUESTO;
        double retension=0;
        
        total=total-impuesto;
        if (impuesto>=1500) {
            retension=Constante.RETE*impuesto;
            impuesto=impuesto-retension;
               
        }
        
        ho.setTotal_a_pagar(total);
        ho.setImpuesto(impuesto);
        ho.setRete(retension);
        
    }
    
    
    
}
