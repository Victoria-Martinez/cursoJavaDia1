package dia_1;

import java.util.Scanner;

public class dia_1_capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una aplicaci�n que pida un n�mero por teclado y despu�s comprobaremos si
		 * el n�mero introducido es capic�a, es decir, que se lee igual sin importar la
		 * direcci�n. Por ejemplo, si introducimos 30303 es capic�a, si introducimos
		 * 30430 no es capicua. Piensa c�mo puedes dar la vuelta al n�mero. Una forma de
		 * pasar un n�mero a un array es esta
		 * Character.getNumericValue(cadena.charAt(posicion)).
		 */

		long numero = 34443L;
		long falta, numeroInvertido, resto;

		while (numero <= 0)
			;
		falta = numero;
		numeroInvertido = 0;
		resto = 0;

		while (falta != 0) {
			resto = falta % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			falta = falta / 10;
		}

		if (numeroInvertido == numero)
			System.out.println("\nEl numero es capicua\n");
		else
			System.out.println("\nEl numero no es capicua\n");

	}

}
