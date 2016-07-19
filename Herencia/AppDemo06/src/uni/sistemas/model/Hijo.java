
package uni.sistemas.model;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Hijo extends Padre{
    //constructor
    public Hijo(){
        super();
        System.out.println("Lenguaje C# es parecido a Java");
    }
    //metodo
    @Override
    public void Mensaje(){
       // nombre="Pepe Lucho";
        fecha=new Date();
        System.out.println("NetBeans es un IDE para java");
        System.out.println("Fecha :"+fecha);
    }
}
