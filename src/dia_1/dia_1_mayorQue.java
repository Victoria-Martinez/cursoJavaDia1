package dia_1;

public class dia_1_mayorQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Realizar un programa que indique el mayor de tres valores numéricos.
		int numeros[] = { 2, 100, 80 };
		int mayor = numeros[0];

		for (int x = 1; x < numeros.length; x++) {
			int numeroActual = numeros[x];
			if (numeroActual > mayor) {
				mayor = numeroActual;
			}
		}
		System.out.printf("El numero mayor de los tres es: " +  mayor);

	}
}
