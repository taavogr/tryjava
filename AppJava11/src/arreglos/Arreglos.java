package arreglos;

public class Arreglos {
    public static void main(String[] args) {
 // declaracion de arreglos
 // existen dos formas :
        
 /* 1era. forma : Es cuando se 
     conoce los datos que almace-
     nara el arreglo.
     2da. forma : Es cuando se 
     desconoce los datos que 
     almacenara el arreglo.   
 */
  // Ejercicios de la 1era. forma
 /* Las notas del curso Java Fun-
     damentos han sido : 14,16,17,
     15,18,13. Almacenarlas en un
     arreglo.
 */       
 int notas[] = {14,16,17,15,18,13};  
 
 // imprimir la longitud o tamaño
 // del arreglo notas[].
 System.out.println("Longitud de notas[] : "+notas.length);
// imprimir los datos del arreglo
 // notas[]
 for(int i=0; i<notas.length;i++) {
     System.out.print(notas[i]+" ");
 }     
// imprimir por consola la suma y 
// el promedio de notas.
 int prom, suma = 0;
 for(int i=0; i<notas.length;i++) {
     suma = suma + notas[i];
 }
 prom = suma/notas.length;
 System.out.println(""); // salto de linea
 System.out.println("");
 System.out.println("Suma Notas : "+suma);
 System.out.println("Promedio Notas : "+prom);
 
 // imprimir por consola la mayor y
 // la menor nota
 int mayor = notas[0];
 int menor = notas[0];
 for(int i=0; i<notas.length;i++) {
     if(notas[i] > mayor)
        mayor = notas[i];
     if(notas[i] < menor)
        menor = notas[i];
 }
 System.out.println(""); // salto de linea
 System.out.println("");
 System.out.println("Mayor Nota : "+mayor);
 System.out.println("Menor Nota : "+menor);
 
 // imprimir las notas impares
 // del arreglo
 System.out.println(""); // salto de linea
 System.out.print("Notas impares : ");    
 for(int i=0; i<notas.length;i++) {
     if(notas[i]%2 != 0)
        System.out.print(notas[i]+" ");    
 }
 
 // imprimir el nro. de notas pares
 // que hay en el arreglo notas[]
 int cont = 0;
 for(int i=0; i<notas.length;i++) {
     if(notas[i]%2 == 0)
        cont++;
 }
 System.out.println(""); // salto de linea
 System.out.println("Nro. notas pares : " +cont);
      
    }
    
}
