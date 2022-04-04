package dia_1;

import java.util.Scanner;

public class dia_1_imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso, altura, imc;

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese su peso:");
		peso = teclado.nextDouble();

		System.out.println("ingrese su altura: ");
		altura = teclado.nextDouble();

		imc = peso / (altura * altura);
		System.out.println("el imc es de : " + imc);

		if (imc < 20) {
			System.out.println("mal estado ");
		} else if (imc >= 20 && imc <= 22) {
			System.out.println("bajo peso");

		} else if (imc >= 22 && imc <= 25) {
			System.out.println("peso normal");

		} else if (imc >= 25 && imc <= 30) {
			System.out.println("sobrepeso");

		} else if (imc >= 30 && imc <= 40) {
			System.out.println("sobrepeso cronico");

		} else {
			System.out.println("hospitalizado");
		}

	}
}
