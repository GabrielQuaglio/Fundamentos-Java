package fundamentos.convers�o;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		// apartir do Scanner, pegaremos 3 Strings usando nextLine elas irao receber os tres ultimos salarios de uma pessoa , onde iremos calcular a media salarial da pessoa
		// nesse salario o funcionario pode ter a flexibilidade de separar as casa decimais usando virgula ou ponto
		//String para numerico soma os tres e mostra a media
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("digite o  salario do antepen�ltimo m�s: ");
	String mes1  =	entrada.nextLine().replace(",", ".");// aqui esta a resposta para aceitar virgulas
	System.out.print("digitte o salario do pen�ltimo m�s: ");
	String mes2 = entrada.nextLine().replace(",", ".");
	System.out.print("dgite o salalario do ultimo m�s: ");
	String mes3 = entrada.nextLine().replace(",", ".");
	
	entrada.close();
	
	double antesalario = Double.parseDouble(mes1);
	double penusalario = Double.parseDouble(mes2);
	double ultsalario = Double.parseDouble(mes3);
	
	System.out.println("A soma dos tr�s salarios � " + (antesalario + penusalario + ultsalario));
	System.out.println("A m�dia dos tr�s salarios � " + (antesalario + penusalario + ultsalario)/3);
	}
}
