/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import uni.sistemas.entity.Producto;
import uni.sistemas.repositorio.ICrudDao;

/**
 *
 * @author Alumno
 */
public class ProductoDaoMemory implements ICrudDao<Producto>{

    //variables
    Producto lista[];
    static int count,n;
   //constructor

    public ProductoDaoMemory() {
        lista=new Producto[100];
        count=0;
        n=0;
        
    }
    
    @Override
    public void create(Producto t) {
        count++;
        t.setId(count);//codigo de producto aut generado
        lista[n]=t;
        n++;
        
    }

    @Override
    public void update(Producto t) {
        int index=0;
        for (Producto x : lista) {
            if (x.getId()==t.getId()) {
                lista[index]=t;
                break;
                
            }
            index++;
        }
    }

    @Override
    public void delete(Producto t) {
        for (int i = 0; i < n; i++) {
            if (lista[i].getId()==t.getId()) {
                for (int j = i; j < n; j++) {
                    lista[j]=lista[j+1];
                }
                n--;
                break;
            }
                
            }
        }
        
    

    @Override
    public Producto fin(int t) {
        for (Producto x : lista) {
            if (x.getId()==t) {
                
               return x;
                
            }
        }
        return null;
        
        
    }

    @Override
    public Producto[] readALL() {
        Producto[] aux;
        if (n==100) {
            aux=lista;
            
        }else{
            aux=new Producto[n];
            System.arraycopy(lista, 0, aux, 0, n);
        }
        return aux;
        
    }
    
}
