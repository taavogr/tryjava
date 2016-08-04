/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.entity;

import java.util.Date;





/**
 *
 * @author Gustavo
 */
public class Factura {
    
    int codigo_factura;
    int codigo_clitente;
    Date fecha_venta;
    double monto;

    public Factura() {
        fecha_venta=new Date();
    }

    public Factura(int codigo_factura, int codigo_clitente, double monto) {
        this.codigo_factura = codigo_factura;
        this.codigo_clitente = codigo_clitente;
       
        this.monto = monto;
    }

    public int getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(int codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public int getCodigo_clitente() {
        return codigo_clitente;
    }

    public void setCodigo_clitente(int codigo_clitente) {
        this.codigo_clitente = codigo_clitente;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
    
}
