/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exitos.entity;

/**
 *
 * @author Gustavo
 */
public class honorario {
    
    //atributos
    private  String nombre_Trabajador;
    private  int horas_diarias;
    private int dias_trabajados;
    private double pago_x_hora;
    private double impuesto;
    private double total_a_pagar;
    private double rete;
    
    //constructor

    public honorario() {
    }
    
    
    //metodos getters and setters

    public String getNombre_Trabajador() {
        return nombre_Trabajador;
    }

    public void setNombre_Trabajador(String nombre_Trabajador) {
        this.nombre_Trabajador = nombre_Trabajador;
    }

    public int getHoras_diarias() {
        return horas_diarias;
    }

    public void setHoras_diarias(int horas_diarias) {
        this.horas_diarias = horas_diarias;
    }

    public int getDias_trabajados() {
        return dias_trabajados;
    }

    public void setDias_trabajados(int dias_trabajados) {
        this.dias_trabajados = dias_trabajados;
    }

    public double getPago_x_hora() {
        return pago_x_hora;
    }

    public void setPago_x_hora(double pago_x_hora) {
        this.pago_x_hora = pago_x_hora;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal_a_pagar() {
        return total_a_pagar;
    }

    public void setTotal_a_pagar(double total_a_pagar) {
        this.total_a_pagar = total_a_pagar;
    }
    
    public double getRete(){
        return rete;
    }
    
    public void setRete(double rete){
        this.rete=rete;
    }
    
    
    
}
