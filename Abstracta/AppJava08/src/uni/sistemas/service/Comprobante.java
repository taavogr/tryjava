/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.service;

import uni.sistemas.entity.Item;

/**
 *
 * @author Alumno
 */

public abstract class Comprobante {
    public abstract Item[] Documento(double total); 
   
}
