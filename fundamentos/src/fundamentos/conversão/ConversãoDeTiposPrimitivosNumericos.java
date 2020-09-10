package fundamentos.conversão;

public class ConversãoDeTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		// so pra anotar informaçoes
		//byte-short-int-long
		//convertendo de byte pra short,short para int,int para long,nao ha risco de perdermos informaçao, porque tudo que cabe dentro do tipo abaixo cabe do tipo acima
		//neste caso a conversao é feita de forma implicita pois o java sabe que não tem problema fazer conver~sao do menor pro maior
		//long-int-short-byte, ha risco de perda de informaçao pois nem tudo que cabe no tipo acima cabe no tipo abaixo
		//neste caso a conversão tem que ser feita de forma explicita
		
		//int-float nao tem problema, neste caso o 3 se torna 3.0 sem perda de dados, uma conversao implicita
		//float-int pode existir problema, por exemplo voce tem um valor 3.2 e converte para um inteiro ele acaba perdendo  a casa decimal(3), uma conversao expicita
		
		//a regra geral é tamanhos se cabe de um tipo pro outro ele converte de forma implicita e quando vai de um tipo maior para um tipo menor vai dar problema
		// o java analisa tipo nao numero entao se no tipo long tiver um valor 1 e quisermos converter pra int ete processo tera que ser feito de forma explicita
		
		//pratica
		double a = 1; // conversão impicita feita pois 1 é inteiro e foi passado para os reais
		System.out.println(a);
		
		float b = 1.0F; // conversao explicita feita de um numero associado naturalmente ao double para float de forma mais simples e a soluçao padrão
		System.out.println(b);
		
		float c =(float) 1.0; // podemos fazer dessa forma tambem usando o cast, colocando entre parentese antes do numero para o tipo que queremos converter, neste caso sem perda de informaçao
		System.out.println(c);
		
		float d = (float) 1.123456788888; //neste caso existe perda de informaçao porem como nós fizemos a conversão de forma expicta nos estamos cientes de que pode haver perda de informaçao
		System.out.println(d);
		
		int e = 4; // embora o 4 caiba dentro do byte o java nao analisa valor e sim tipo
		byte f = (byte) e; // para dar certo podemos usar o cast, uma conversão explicita que nao perdd informaçao pois 4 cabe em byte
		System.out.println(f);
		
		int h = 130;
		byte i = (byte)h; //neste caso que usamos cast ha perda de informaçao pois 130 nao cabe em byte, alem de ser um jeito bem louco, porem como fizemos de forma explicita informamos que temos consiencia do qeu estamos fazendo ao java
		System.out.println(i);
		
		double j = 1.9999999; // da mesma forma acima o 1 cabe em int porem ele aqui é um real(1.0) e como o java analisa tipos prescisamos fazer a forma explicita
		int k = (int)j; // usando o cast ira haver perda de informaçao pois no int nao existe casa decimal
		System.out.println(k);
	}
}
