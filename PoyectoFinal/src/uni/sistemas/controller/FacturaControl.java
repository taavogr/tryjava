/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import java.util.List;
import uni.sistemas.entity.Detalle;
import uni.sistemas.entity.Factura;
import uni.sistemas.model.DetalleDaoFile;
import uni.sistemas.model.FacturaDaoFile;

/**
 *
 * @author Gustavo
 */
public class FacturaControl {
    FacturaDaoFile dao;
    DetalleDaoFile daode;

    public FacturaControl() {
        dao=new FacturaDaoFile();
        daode= new DetalleDaoFile();
    }
    
    public void facturar(Factura x) throws Exception{
        dao.facturar(x);
    }
    
    public void agregar_prod(Detalle x) throws Exception{
        daode.agregar_detalle(x);
    }
    
    public List<Detalle> listar_detalles()throws Exception{
        return daode.leer_detalles();
    }
    
}
