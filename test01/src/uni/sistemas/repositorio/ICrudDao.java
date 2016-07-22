/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.repositorio;

/**
 *
 * @author Alumno
 */
public interface ICrudDao <T>{
    
    void create(T t);
    void update(T t);
    void delete(T t);
    
    T fin(int t);
    T[] readAll();
    
    
    
}
