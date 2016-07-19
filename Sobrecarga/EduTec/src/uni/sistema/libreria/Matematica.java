/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistema.libreria;

/**
 *
 * @author Alumno
 */
public class Matematica {
    
    //metodos sobrecargados
    public static double Promedio(int n1,int n2){
        
        return (n1+n2)/2.0;
    }
    public static double Promedio(int n1,int n2, int n3){
        
        return (n1+n2+n3)/3.0;
    }
    public static double Promedio(int n1,int n2, int n3, int n4){
        
        return (n1+n2+n3+n4)/4.0;
    }
    public static double Promedio(int n1,int n2, int n3, int n4, int n5){
        
        return (n1+n2+n3+n4+n5)/5.0;
    }
    
}
