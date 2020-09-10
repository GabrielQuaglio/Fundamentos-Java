package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		// neste desafio usaremos potencia, para usa-la usaremos a classe math.pow(valor da variavel, sera elevado a ...) o resultado sera um double
		// criaremos uma formula printada no celular
		//faremos atraves de passos, fazendo de dentro pra fora, parece ser mais facil
		
double a = 6*(3+2);
double aa = Math.pow(a, 2);
double div = 3*2;    
double fima = aa/div;


double b = (1-5)*(2-7);
double bb = Math.pow(b, 2);
double divb = 2;
double divdivb = Math.pow(divb, 2);
double fimb = bb/divdivb;


double semifinal = fima -fimb;
double semifinalnal = Math.pow(semifinal, 3);
double divfinal = Math.pow(10, 3);
double resultado = semifinalnal/divfinal;
System.out.printf("que desafio facíl. o rsultado é %.0f", resultado );//%S string %d inteiro %f reais
	}
}
