/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import uni.sistemas.entity.Producto;
import uni.sistemas.model.ProductoDaoMemory;

/**
 *
 * @author Alumno
 */
public class ProductoController {
    ProductoDaoMemory dao;

    public ProductoController() {
        dao=new ProductoDaoMemory();
    }
    
    public void ProductoAdicionar(Producto p){
        dao.create(p);
    }
    
    public void ProductoEliminar(Producto p){
        dao.delete(p);
    }
    
    public void ProductoActualizar(Producto p){
        dao.update(p);
    }
    
    public Producto[] ProductoListar(){
        return dao.readALL();
    }
    public Producto ProductoBuscar(int id){
        return dao.fin(id);
    }
    
    
    
}
