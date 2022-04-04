package dia_1;

import java.util.Scanner;

public class dia_1_promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa para calcular el promedio de tres notas, e indique si el
		 * promedio es menor de 10 que muestre reprobado, si es mayor que 10 pero menor
		 * que 15 aprobado, y mayor de 15 eximido.
		 * 
		 */

		double nota1, nota2, nota3, promedio;

		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese la primer nota:");
		nota1 = teclado.nextDouble();

		System.out.println("ingrese la segunda nota:");
		nota2 = teclado.nextDouble();

		System.out.println("ingrese la tercer nota:");
		nota3 = teclado.nextDouble();

		promedio = (nota1 + nota2 + nota3) / 3;

		System.out.println("promedio es de :" + promedio);

		if (promedio <= 10) {
			System.out.println("reprobado");

		} else if (promedio >= 10 && promedio <= 15) {
			System.out.println("aprobado");
		} else {
			System.out.println("eximido");
		}

	}
}
