/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/
import java.util.Scanner;
public class whileValue {   

   public static void main(String[] args) {
   		Scanner leer= new Scanner(System.in);
  int n=0;	
  int valorActual = 0;
   		System.out.println("ingrese un numereo");
              n=leer.nextInt();
              while(valorActual!=n){
                  
                  //si valor actual < args[0]
   			System.out.println("el valor actual es: "+valorActual);
                        valorActual++;
              }
      
   }

}