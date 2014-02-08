/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      
   	
     int n;
        
 	System.out.println("ingrese un numero para verificar si es par o impar");
        n=Integer.parseInt(args[0].toString()); 
   	if (n%2!=0){	
        // si el numero es impar
   			System.out.println("numero es impar");
        }else
   		// si el numero es par
   			System.out.println("numero es par");

   }
}
}