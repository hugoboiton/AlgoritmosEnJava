/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/
import java.util.Scanner;
public class oddEven {   

   public static void main(String[] args) {
      
     Scanner numero=new Scanner(System.in);	
     int n=0;
        
 	System.out.println("ingrese un numero para verificar si es par o impar");
        n=numero.nextInt();
   	if (n%2!=0){	
        // si el numero es impar
   			System.out.println("numero es impar");
        }else
   		// si el numero es par
   			System.out.println("numero es par");

   }
}
}