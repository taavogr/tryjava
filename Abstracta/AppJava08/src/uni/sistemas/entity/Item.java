/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.entity;

/**
 *
 * @author Alumno
 */
public class Item {
    
    private String concepto;
    private double importe;
    
    public Item(){
       
    }
    
    
    public Item(String concepto, double importe)
    {
        this.concepto=concepto;
        this.importe=importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
   
    
}
