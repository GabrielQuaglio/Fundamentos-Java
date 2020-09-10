package fundamentos.String;

import java.util.Scanner;// java.lang e o mais usado e o segundo e o java.util

public class Console {

	public static void main(String[] args) {
		
	System.out.print("bom"); // sem o ln oque for imprimido fica na mesma linha
	System.out.print(" dia\n");
		
	System.out.println("bom ");//neste caso ele cria a linha apos o seu uso	// acima usaremos usaremos o "\n" para executar uma quebra de linha// nao havia antes
	System.out.println("dia");    // "\n sempre entre aspas apos a string
		
	System.out.printf("mega sena: %d %d %d %d %d \n", 1,2,3,4,5); //%S string %d inteiro %f reais// com o f podemos formatar o texto// o printf tambem n tem quebra de linha
	System.out.printf("salario: %.1f \n", 1234.5678);// o ".1" delimita que queremos ver apenas um numro apos a virgula
		
	Scanner entrada = new Scanner(System.in); //queremods pegar informaçoes do teclado a partr do console// System.in quer dizer que criamos uma entrada// entrada por padrao é o teclado e a saida é o console
	System.out.print("digite o seu nome: ");  // quando dizemos que faremos um Scanner quremos dizer que ele vai monitorar tudo que a gente digitar// nao se importar muto agora com a sintaxe
	var nome = entrada.nextLine(); //neste caso o programa espera o usuario digitar uma informaçao// com a string criada ele armazenara oque o usuario digitou// acima o System .out.print foi usado para mostrar ao usuario oque queremos que ele digite
	
	System.out.print("digite o seu sobrenome: ");
	var sobrenome = entrada.nextLine();	
	
	
	System.out.print("digite a sua idade: ");
	var idade = entrada.nextInt();
	
	System.out.printf("Seu nome é %s %S, sua idade é de %d anos", nome,sobrenome,idade);
		
	entrada.close();	
		
	final double ANOATUAL = 2020;
	double formula = ANOATUAL - idade;
	System.out.printf("Você %s %S nasceu no ano de %.0f" ,nome,sobrenome,formula );
		
	}	
	
}
