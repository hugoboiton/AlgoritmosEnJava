/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
 
  int a=0 , b=0;   
   System.out.println("ingrese dos numero");
   a=Integer.parseInt(args[0].toString()); 
   b=Integer.parseInt(args[1].toString()); 
         
   for(int x =a+1;x<b;x++){
   
   System.out.println("numero actual es:"+x );
   }
                   	
   
   }
      
   

}