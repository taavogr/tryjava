/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava11;

/**
 *
 * @author Alumno
 */
public class AppJava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lista[]=new int [5];
        
       lista[2]=3;
       lista[4]=20;
       
       for (int i=0;i<lista.length;i++)
       {
           System.out.println("valor: "+lista[i]);
       }
       
       String[] nombre={"Juan","Luis","Carlos","Katy","Carolina","Renato"};
    }
    
}
