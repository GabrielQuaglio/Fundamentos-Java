package exerciciosDeFundamentos;

import java.util.Scanner;

public class CelsiusFahreinheit {

	public static void main(String[] args) {
		
		//formula: F = C * 1,8+32
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a temperatura em celsius: ");
		String celsiusS = entrada.next().replace(',', '.');
			entrada.close();
		double celsiusD = Double.parseDouble(celsiusS);
			final double COMPLEMENTO1 = 1.8;
			final double COMPLEMENTO2 = 32;
		double resultado = (celsiusD * COMPLEMENTO1) + COMPLEMENTO2;
		System.out.printf("o valor de %s graus celsius equivale a %.2f graus fahreinheit",celsiusS,resultado);
		
	}
}
