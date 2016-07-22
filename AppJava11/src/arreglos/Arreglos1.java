package arreglos;
import javax.swing.*;

public class Arreglos1 {
  public static void main(String[] args) {
 // 2da. forma declaracion de arreglos
 
// el usuario ingresara 4 edades y
 // estos deben almacenarse en un
 // arreglo
     int edad[] = new int[4];    
     String sedad = null;
     for(int i=0; i<edad.length;i++){
          sedad = JOptionPane.showInputDialog("Ingrese Edad "+(i+1));
          edad[i] = Integer.parseInt(sedad);
     }
 // imprimir datos del arreglo edad[]  
  for(int i=0; i<edad.length;i++) {
     System.out.print(edad[i]+" ");
 }        
 
  // solicitar apellido y peso de 3
  // personas e ingresarllos en
  // arreglos
  String ape[] = new String[3];
  double peso[] = new double[3];
  String sape = null, speso=null;  
  for(int i=0; i<ape.length;i++){
    sape = JOptionPane.showInputDialog("Ingrese Apellido "+(i+1));
    speso = JOptionPane.showInputDialog("Ingrese Peso "+(i+1));   
    ape[i] = sape;
    peso[i] = Double.parseDouble(speso);
   }
  // imprimir datos de ape[] y peso[]
 System.out.println(""); // salto de linea  
 System.out.println(""); // salto de linea 
 for(int i=0; i<ape.length;i++) {
     System.out.println(ape[i]+"    "+peso[i]);
 }    
  
  
  
  
  
      
      
      
   }      
}
