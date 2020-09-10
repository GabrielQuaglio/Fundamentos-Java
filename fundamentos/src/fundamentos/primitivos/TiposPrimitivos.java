package fundamentos.primitivos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informaçoes de um funcionario
		// prestar atençao ao uso de ; e de camel case
		// DICA: usamos _ para facilitar a leitura de algun numerais

		// tipos numericos inteiros
		byte anosDeEmpresa = 23; // max de byte é 127 positivo, acima disso da errado
		short numeroDeVoos = 542; // max de short é 32768 positivo, acima disso da errado
		int id = 56789; // max ate 2bi e alguma coisa
		long pontosAcumulados = 3_134_845_223L; // quando voce passa o range do int voce é obrigado a usar o Lao lado do
												// valor

		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipo booleano
		boolean estaDeFerias = false; // true

		// tipo caractere
		char status = 'a'; // para representar ativo// nao podemos usar mais de um simbolo ou letra

		// dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// numero de viagens
		System.out.println(numeroDeVoos / 2.0);

		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		// usando id associando ao salario
		System.out.println(id + " ganha >" + salario);

		// usando ferias
		System.out.println("ferias? " + estaDeFerias);

		// usando char
		System.out.println("status: " + status);

	}

}
