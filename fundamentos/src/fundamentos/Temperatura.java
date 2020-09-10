package fundamentos;

public class Temperatura {

	public static void main(String[] args) {

		// (°F-32) * 5/9 = °C
		// para fazermos diviçao no java temos que tranformar o numero inteiro em um
		// numero real para isso usaremos o ex( 5 para 5.0)
		// 32 chamaremos de ajuste e 5/9 de fator, sao nossas constantes
		// C e F sao nossas variaveis

		double f = 30;
		final double AJUSTE = -32;
		final double FATOR = 5 / 9.0;
		double formula = (f + AJUSTE) * FATOR;

		System.out.println(formula + " C°");
//para mudarmos uma linha de codigo de lugar usamos alt+ stinha pra cima ou pra baixo
		
	
	}

}
