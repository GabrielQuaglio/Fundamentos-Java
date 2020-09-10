package fundamentos.operadores;

public class Aritmetico {

	public static void main(String[] args) {
		
		
		//OPERADORES- unarios / binarios / ternario
		//um exemplo de operador unario é quando usamos um valor A e adicionamos ao seu lado ++(A++) neste caso o valor de A rebe um imcremento de 1, unario pois tem apenas um operando
		//soma e subtraçao sao operadores binarios, 3 + 2 pois você tem um operador de soma e dois operandos, no caso 3 e 2
		//o operador ternario é um caso especial,é quando você têm- valor ? valor : valor sao dois operadores trabalhando com dois operandos
		
    	//existem tres formas queos operadores podem se relacionar com os operandos - prefix(++a), postfix(a++), infx(3+2) as duas primeiras sao unarios e a terceira binario
		
	   // na sequencia das aulas iremos falar sobre os operadores aritmeticos, relacionais, logicos e de atribuição - maioria binario, alguns unarios e o ultimo ternario
		
		// 1!- OPERADORES ARITMETICOS(soma,mutiplicaçao,subtração,divisão)
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x+y);// soma
		System.out.println(x-y);//subtrção
		System.out.println(x*y);//mutiplicação
		System.out.println(x/y);//divisão
		
		int a = 8;
	   int b = 3;
	   
	   System.out.println(a+b);// soma
		System.out.println(a-b);//subtrção
		System.out.println(a*b);//mutiplicação
		System.out.println(a/b);//divisão truncada pois nao adota valores decimais
		System.out.println(a/(double)b);
		
		System.out.println(a%b);//operador modulo, é o resto da divisão
		System.out.println(8%3);
	
		System.out.println(x + y - a * b);
	}                             
}
