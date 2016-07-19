
package uni.sistemas.model;

/**
 *
 * @author Alumno
 */
public class Nieto extends Hijo{
    //constructor
    public Nieto(){
        System.out.println("Android es un SO para mobiles");
    }
    //metodo
    @Override
    public void Mensaje(){
        super.Mensaje();
        System.out.println("Python es un lenguaje POO");
    }
}
