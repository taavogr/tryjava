/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.entity;

/**
 *
 * @author Gustavo
 */
public class Detalle {
    
    private int codigo;
    private String nombre;
    private double precio_unitario;
    private int cantidad;

    public Detalle() {
    }

    public Detalle(int codigo, String nombre, double precio_unitario, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
