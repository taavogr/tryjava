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
public class Alumno {
    private int id;
    private String nombre;
    private String Curso;
    private double exa_parcial;
    private double exa_final;
    private double practica;
    private double promedio;
    private String estado;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String Curso, double exa_parcial, double exa_final, double practica) {
        this.id = id;
        this.nombre = nombre;
        this.Curso = Curso;
        this.exa_parcial = exa_parcial;
        this.exa_final = exa_final;
        this.practica = practica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public double getExa_parcial() {
        return exa_parcial;
    }

    public void setExa_parcial(double exa_parcial) {
        this.exa_parcial = exa_parcial;
    }

    public double getExa_final() {
        return exa_final;
    }

    public void setExa_final(double exa_final) {
        this.exa_final = exa_final;
    }

    public double getPractica() {
        return practica;
    }

    public void setPractica(double practica) {
        this.practica = practica;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
   
    
}
