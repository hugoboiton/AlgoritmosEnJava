/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/
import java.util.Scanner;
public class rangeSum {   

   public static void main(String[] args) {
 Scanner leer= new Scanner(System.in);
  int a=0 , b=0;   
   System.out.println("ingrese dos numero");
   a=leer.nextInt();
   
   b=leer.nextInt();
         
   for(int x =a+1;x<b;x++){
   
   System.out.println("numero actual es:"+x );
   }
                   	
   
   }
      
   

}