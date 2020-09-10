package exerciciosDeFundamentos;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		// peso divido pela altura ao quadrado
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite seu peso: ");
		String pesoS = entrada.next().replace(',', '.');
		System.out.print("digite sua altura: ");
		String alturaS = entrada.next().replace(',', '.');
		entrada.close();
		double pesoD = Double.parseDouble(pesoS);
		double alturaD = Double.parseDouble(alturaS);
		double alturaConta = Math.pow(alturaD, 2);		
		double resultado = pesoD/alturaConta;
		System.out.printf("seu Imc com o peso de %s e altura de %s é %.2f", pesoS,alturaS,resultado);
		
	}
}
