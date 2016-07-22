package arreglos;
import java.util.*;

public class Arreglos4 {
    public static void main(String[] args) {
        int x[] = { 14, 3, 17, 2, 9, 19, 6 };
        String ape[] = {"Zapata","Leon","Ruiz", "Alva"};
        
     // ordenar arreglos x y ape en forma ASC
     Arrays.sort(x);       // ordena x ASC
     Arrays.sort(ape);  // ordena ape ASC
     
     // imprimiendo x y ape ordenados ASC
     System.out.print("Datos de x ordenados ASC : ");
       for(int i=0; i<x.length;i++) {
         System.out.print(x[i]+" ");
       }    
       System.out.println("");  // salto de linea
       System.out.print("Datos de ape ordenados ASC : ");
       for(int i=0; i<ape.length;i++) {
         System.out.print(ape[i]+" ");
        } 
     
        
    }
}
