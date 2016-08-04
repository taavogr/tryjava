/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.service;

/**
 *
 * @author Gustavo
 */
public interface FacturaDao <T>{
    
    void facturar (T a) throws Exception;
    void actualizar_factura(double a) throws Exception;
    
}
