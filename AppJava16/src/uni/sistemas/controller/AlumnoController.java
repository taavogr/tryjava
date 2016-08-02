/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import uni.sistemas.entity.Alumno;
import uni.sistemas.model.AlumnoDaoMemory;

/**
 *
 * @author Alumno
 */
public class AlumnoController {
    
    AlumnoDaoMemory dao;

    public AlumnoController() {
        dao=new AlumnoDaoMemory();
    }
    
    public void AgregarAlumno(Alumno a){
        dao.create(a);
    }
    public void ActualizarAlumno(Alumno a){
        dao.update(a);
        
    }
    
    public void EliminarAlumno(Alumno a){
        dao.delete(a);
    }
    
    public Alumno BuscarAlumno(int x){
        return dao.fin(x);
    }
    
    public Alumno[] ListarAlumnos()
    {
        return dao.readAll();
    }
    
    
    
}
