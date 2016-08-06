/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import java.util.List;
import uni.sistemas.entity.Producto;
import uni.sistemas.model.ProductoDaoFile;

/**
 *
 * @author Gustavo
 */
public class ProductoControl {
    
    ProductoDaoFile dao;

    public ProductoControl() {
        dao=new ProductoDaoFile();
    }
    
    public void AgregarProducto(Producto x)throws Exception{
        dao.crear(x);
    }
    
    public void ActualizarProducto(Producto x)throws Exception{
        dao.actualizar(x);
    }
    public void EliminarProducto(Producto x)throws Exception{
        dao.eliminar(x);
    }
    public Producto BuscarProducto(int x)throws Exception{
        return dao.buscar(x);
    }
    public List<Producto> ListarProducto()throws Exception{
        return dao.leer();
    }
    
    public Producto BuscarxNombre(String x) throws Exception{
        return dao.buscarxnombre(x);
    }
    
    
}
