package exerciciosDeFundamentos;

import java.util.Scanner;

public class areaTriangulo {
	public static void main(String[] args) {

		Scanner entrada =  new Scanner(System.in);
		System.out.print("digite o valor da base do tri�ngulo: ");
		String baseS = entrada.next().replace(',', '.');
		System.out.print("digite o valor da altura de um tri�ngulo: ");
		String alturaS = entrada.next().replace(',', '.');
		entrada.close();
		double baseD = Double.parseDouble(baseS);
		double alturaD = Double.parseDouble(alturaS);
		double resultado = (baseD * alturaD) /2;
		System.out.printf("O tri�ngulo de base %S e altura %s tem area de %.2f", baseS,alturaS,resultado);
		
	}
}
