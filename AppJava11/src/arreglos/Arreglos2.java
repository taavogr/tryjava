package arreglos;
import javax.swing.*;


public class Arreglos2 {
    public static void main(String[] args) {
     // solicitar por panel 4 notas, almacenarlas en
     // un arreglo, e imprimir el promedio de las 3 notas
     // mas altas. No considerar la menor nota.
     int nota[] = new int[4];
     int menor = 20, suma = 0;
     String snota;
     for(int i=0; i<nota.length;i++){
          snota = JOptionPane.showInputDialog(
                  "Ingrese Nota "+(i+1));
          nota[i] = Integer.parseInt(snota);
          if(nota[i] < menor)
              menor = nota[i] ;
          suma = suma + nota[i] ;
     }
 
// imprimir datos del arreglo nota[]  
 System.out.print("Notas ingresadas : ");
  for(int i=0; i<nota.length;i++) {
     System.out.print(nota[i]+" ");
 }        
     
 // imprimir el promedio
  int prom = (suma - menor)/(nota.length-1);
  System.out.println("");
  System.out.println("Promedio : "+prom);
        
        
        
        
    }
}
