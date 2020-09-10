package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++;//a=a+1//incremento
		a--;//a=a-1//decremento
		
		++b;//forma pre fixada
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("mini desafio ...");
		System.out.println(++a == b--);//em teoria seria false,porem pela tabela de precedencia o pre fix vem primeiro entao a comparaçao sera realizada depois do incremento e antes do decremento 
		System.out.println(a == b);//prova que daria false
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
