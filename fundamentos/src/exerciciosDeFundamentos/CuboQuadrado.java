package exerciciosDeFundamentos;

import java.util.Scanner;

public class CuboQuadrado {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("digite o valor desejado: ");
	String valorS = entrada.next().replace(',', '.');
	entrada.close();
	double valorD = Double.parseDouble(valorS);
	double valorD2 = Math.pow(valorD, 2);
	double valorD3 = Math.pow(valorD, 3);
	System.out.printf("o valor de %s , elevado ao quadrado é %.2f e ao cubo %.2f ", valorS,valorD2,valorD3);
			
	
}	
	}

