package arreglos;
import javax.swing.*;


public class Arreglos3 {
    public static void main(String[] args) {
     String nombre[] = new String[4];
     int edad[] = new int[4];
     String snombre, sedad;
     for(int i=0; i<nombre.length;i++){
          snombre = JOptionPane.showInputDialog(
                  "Ingrese Nombre "+(i+1));
          sedad = JOptionPane.showInputDialog(
                  "Ingrese Edad "+(i+1));
          nombre[i] = snombre;
          edad[i] = Integer.parseInt(sedad);          
      }
 
// imprimir datos de nombres y edades
 System.out.println("Datos ingresados : ");
  for(int i=0; i<nombre.length;i++) {
     System.out.println(nombre[i]+"\t"+edad[i]);
 }        
     
 // buscando el indice de la persona mayor
  int mayor = edad[0];
  int indice = 0;
   for(int i=0; i<edad.length;i++) {
       if(edad[i] > mayor) {
           mayor = edad[i];
           indice = i;
       }
   }
   String cadena = nombre[indice] +"  "+
                              String.valueOf(mayor);
    JOptionPane.showMessageDialog(null, 
                                     "Datos del Mayor : "+ cadena);
    }
}
