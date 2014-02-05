/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/
import java.util.Scanner;

public class productToNumber {   

   public static void main(String[] args) {
   		 Scanner numero=new Scanner(System.in);	
     int resultado = 1;
     int n=0,m,x;
     String f="";
     System.out.println("ingrese un numero");
   	n=numero.nextInt();
        x=1;
        do{
            resultado= resultado*x;
          if(x==1){
              f="1";
          }else{
            f=f+"x"+x;
         
          }
             x++;
        }while(x<=n);


   		System.out.println("el producto es:"+f+" ="+resultado);
		}

}