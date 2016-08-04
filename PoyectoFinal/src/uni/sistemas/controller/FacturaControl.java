/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import uni.sistemas.entity.Factura;
import uni.sistemas.model.FacturaDaoFile;

/**
 *
 * @author Gustavo
 */
public class FacturaControl {
    FacturaDaoFile dao;

    public FacturaControl() {
        dao=new FacturaDaoFile();
    }
    
    public void facturar(Factura x) throws Exception{
        dao.facturar(x);
    }
    
}
