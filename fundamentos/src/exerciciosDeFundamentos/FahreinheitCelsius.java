package exerciciosDeFundamentos;

import java.util.Scanner;

public class FahreinheitCelsius {

	public static void main(String[] args) {
		
		//C= (F-32)/1,8
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o valor em fahreinheit: ");
		String fahreinheitS = entrada.next().replace(',', '.');
		entrada.close();
		double fahreinheitD = Double.parseDouble(fahreinheitS);
		double resultado = (fahreinheitD - 32)/1.8;
		System.out.printf("o valor de %s graus fahreinheit equivale a %.2f graus celsius" , fahreinheitS,resultado);
	}
}
