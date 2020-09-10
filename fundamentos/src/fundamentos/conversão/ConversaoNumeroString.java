package fundamentos.conversão;

public class ConversaoNumeroString {

	public static void main(String[] args) {
	
		//primeiro definimos uma variavel int com wrapper
	Integer num1 = 10000;
		System.out.println(num1.toString().length()); // fica a mesma coisa porem podemos agora nos aproveitar de certas funcionalidades da String
		// acima usamos o length uma funcionalidade da String usada para contar o caracteres de um numero neste caso
		
		// outra forma de convertemos um valor numerico para a String é usando um valor primitivo e no system.out usarmos o integer
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());// e podemos fazer a mesma coisa do de cima
		
		// nao muito usado, mas podemos tranformar um numero para String concatenando com uma sString vazia DENTRO DE PARENTESES
		System.out.println(("" + num2).length());
		
		
	}
}
