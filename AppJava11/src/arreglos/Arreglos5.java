package arreglos;
import javax.swing.*;
import java.util.*;

public class Arreglos5 {
    public static void main(String[] args) {
    // solicitar por panel 4 notas, ingresarlas en     
    // un arreglo, imprimirlas como son ingresadas,
    // ordenar las notas ASC, imprimir por consola
    // las notas ordenadas ASC, imprimir por panel 
    // la menor y la mayor nota, e imprimir por consola
   //  todas las notas en forma DESC.
      int nota[] = new int[4];
     String snota;
     for(int i=0; i<nota.length;i++){
          snota = JOptionPane.showInputDialog(
                  "Ingrese Nota "+(i+1));
          nota[i] = Integer.parseInt(snota);          
      }  
      
     // imprimir notas ingresadas
     System.out.print("Notas ingresados : ");
     for(int i=0; i<nota.length;i++) {
        System.out.print(nota[i]+" ");
     }        
     // ordenamos ASC
     Arrays.sort(nota);
     // imprimimos nota ASC
      System.out.println("");
      System.out.print("Notas ordenadas ASC : ");
      for(int i=0; i<nota.length;i++) {
          System.out.print(nota[i]+" ");
     }   
     // imprimir por panel menor y mayor nota
      JOptionPane.showMessageDialog(null, 
       "Menor Nota : "+nota[0]+"\n" + 
       "Mayor Nota : "+nota[nota.length-1]);
     
     // imprimir por consola nota[] DESC
      System.out.println("");
      System.out.print("Notas ordenadas DESC : ");
      for(int i=nota.length-1; i>=0; i--) {
          System.out.print(nota[i]+" ");
     }    
      
      
      
        
        
    }
    
}
