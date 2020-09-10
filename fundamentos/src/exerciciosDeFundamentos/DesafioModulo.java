package exerciciosDeFundamentos;

import java.util.Scanner;



public class DesafioModulo {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("digite o primeiro número: ");
	double valor1 = entrada.nextDouble();
	System.out.print("digite o segundo número: ");
	double valor2 = entrada.nextDouble();
   System.out.print("digite o operador a ser usado na operação: ");
	String operador = entrada.next();
	
	 //logica//nosso fucking erro foi usar == ao inves de usar .equals que se usa em uma String, nao esquecer mais pqp
	double s = operador.equals("+") ? valor1 + valor2 : operador.equals("-") ? valor1 - valor2: operador.equals("*") ? valor1/valor2 : operador .equals("/") ? valor1/valor2 : 0;
	
	System.out.printf("o resultado é %.2f", s);
	
	entrada.close();
	}
}
//pqpqpqpqpqpqpqp nao esquecer de usar equals na String mds