package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {

	//operadores relacionais em sua maioria s�o de compara��o e binarios
		
		int a = 97;
	    int b = 97;
		
		System.out.println(b == a);
		
		System.out.println(3>4); // 3 � maior que 4,false
		System.out.println(3>=4);// 3 � maior ou igual a 4,false (primeiro escrevemos o maior e menor depois o =)
		System.out.println(3< 7);// 3 � menor que 7,true
		System.out.println(3<=7);// 3 � menor ou igual a 7,false
		System.out.println(3!=7); // 3 � diferente de 7,true
		
		double media = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = media>=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("tem desconto? " + temDesconto);
	}
}
