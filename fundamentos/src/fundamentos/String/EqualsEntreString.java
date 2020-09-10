package fundamentos.String;

import java.util.Scanner;

public class EqualsEntreString {
	
	public static void main(String[] args) {
// a moral da aula é para quando formos comparar Syrings ao inves de usarmos == usaremos .EQUALS
	System.out.println("2"=="2");	
	
	String s1 = new String("2");	//um poco forçaçao de barra
	System.out.println("2" == s1);//dessa forma ele nao funciona
	System.out.println("2".equals(s1));//usando a funcionalidade String .equals da certo
	
	Scanner entrada = new Scanner(System.in);
	
	String s2 = entrada.nextLine();//somente o next tira os espaços em branco nao prescisando do .trim ja o nextLine prescisa
	System.out.println("2" == s2);
	System.out.print("2".equals(s2.trim()) );//usando equals e trim para tirarmos o espaço em branco que pode ser "digitado" pelo usario o resultado é true
	
	entrada.close();
	}
}
