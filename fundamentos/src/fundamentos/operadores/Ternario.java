package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media1 = 7.6;
		
		String resultadofinal = media1 >= 7.0 ? "aprovado" : "recuperaçao";//operador ? separa a expressao dos valores que serao atribuidos e o : que separa o valor quando verdadeiro e quando falso
		
		System.out.println(resultadofinal);
		
		double media = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = media>=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
	System.out.println("tem desconto?" + resultado);
	}
}
