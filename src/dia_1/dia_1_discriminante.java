package dia_1;

import java.util.Scanner;

public class dia_1_discriminante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa para el c�lculo de las ra�ces de ecuaci�n de segundo grado,
		 *  el programa debe diferenciar entre las ra�ces imaginarias, ra�ces distintas, ra�ces iguales.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer valorde a");
        int a=sc.nextInt();
        System.out.println("Introduce el valor de b");
        int b=sc.nextInt();
        System.out.println("Introduce el valor de c");
        int c=sc.nextInt();
  
        double discriminante=Math.pow(b, 2)-(4*a*c);
  
        System.out.println("discriminante"+discriminante);
  
        if (discriminante>0){
           
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
  
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }

	}


