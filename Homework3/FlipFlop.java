/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static void main(String[] args) {

           int numeroActua;
   System.out.println("ingrese un numero para hacer FlipFlop");
        int numeroActual = Integer.parseInt(args[0].toString()); 
   		
for (int x =0;x<numeroActual+1;x++){
   		
	if(x%3==0&&x%5==0){
		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
					System.out.println("FlipFlop");
	}else{
	if(x%3==0){
	// si el numero es divisible dentro de 3 imprima "Flip"
			System.out.println("Flip");
   		}
      if(x%5==0){
   		// si el numero es divisible dentro de 4 imprima "Flop"
			System.out.println("Flop");
      }
	}
   	if(x%3!=0&&x%5!=0){
            System.out.println(x);
        }	
}
}
}