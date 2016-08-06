/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.service;

import java.util.List;

/**
 *
 * @author Gustavo
 */
public interface DetalleDao <T>{
    
    void agregar_detalle(T a) throws Exception;
    List<T> leer_detalles() throws Exception;
    
}
