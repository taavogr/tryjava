package uni.sistemas.model;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public  class Padre {
    //atributos
    private String nombre;
    protected Date fecha;
    //constructor

    public Padre() {
        System.out.println("Lenguaje C es el papa de Java");
    }
    // metodo

    public void Mensaje() {
        System.out.println("Java es el lenguaje mas usado");
    }

}
