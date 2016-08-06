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
public interface ICrudDao <T> {
    
    void crear(T a) throws Exception;
    void actualizar (T a) throws Exception;
    void eliminar(T a) throws Exception;
    T buscar(int a) throws Exception;
    T buscarxnombre(String a) throws Exception;
    List <T> leer() throws Exception;
}
