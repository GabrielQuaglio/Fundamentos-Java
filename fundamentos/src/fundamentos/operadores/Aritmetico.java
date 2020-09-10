package fundamentos.operadores;

public class Aritmetico {

	public static void main(String[] args) {
		
		
		//OPERADORES- unarios / binarios / ternario
		//um exemplo de operador unario � quando usamos um valor A e adicionamos ao seu lado ++(A++) neste caso o valor de A rebe um imcremento de 1, unario pois tem apenas um operando
		//soma e subtra�ao sao operadores binarios, 3 + 2 pois voc� tem um operador de soma e dois operandos, no caso 3 e 2
		//o operador ternario � um caso especial,� quando voc� t�m- valor ? valor : valor sao dois operadores trabalhando com dois operandos
		
    	//existem tres formas queos operadores podem se relacionar com os operandos - prefix(++a), postfix(a++), infx(3+2) as duas primeiras sao unarios e a terceira binario
		
	   // na sequencia das aulas iremos falar sobre os operadores aritmeticos, relacionais, logicos e de atribui��o - maioria binario, alguns unarios e o ultimo ternario
		
		// 1!- OPERADORES ARITMETICOS(soma,mutiplica�ao,subtra��o,divis�o)
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x+y);// soma
		System.out.println(x-y);//subtr��o
		System.out.println(x*y);//mutiplica��o
		System.out.println(x/y);//divis�o
		
		int a = 8;
	   int b = 3;
	   
	   System.out.println(a+b);// soma
		System.out.println(a-b);//subtr��o
		System.out.println(a*b);//mutiplica��o
		System.out.println(a/b);//divis�o truncada pois nao adota valores decimais
		System.out.println(a/(double)b);
		
		System.out.println(a%b);//operador modulo, � o resto da divis�o
		System.out.println(8%3);
	
		System.out.println(x + y - a * b);
	}                             
}
