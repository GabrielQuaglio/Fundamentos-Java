package exerciciosDeFundamentos;

import java.util.Scanner;

public class equaçaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o valor de a: ");
		String aS = entrada.next().replace(',', '.');
		
		System.out.print("digite o valor de b: ");
		String bS = entrada.next().replace(',', '.');
		
		System.out.print("digite o valor de c: ");
		String cS = entrada.next().replace(',', '.');
		
		entrada.close();
		
		double aD = Double.parseDouble(aS);
		double bD = Double.parseDouble(bS);
		double cD = Double.parseDouble(cS);
		
		
	double delta = (bD*bD) - 4*aD*cD;
	double x1 = -bD - Math.sqrt(delta)/2*aD;
	double x2 = -bD + Math.sqrt(delta)/2*aD;
	
	double ternariox1 = delta < 0 ? 0:x1;
	double ternariox2 = delta < 0 ? 0:x2;
	
	System.out.printf("A primeira raiz da equação quadrada com a = %s  b = %s  c = %s é %.2f e a segunda é %.2f", aS,bS,cS,ternariox1,ternariox2);
	}
}
