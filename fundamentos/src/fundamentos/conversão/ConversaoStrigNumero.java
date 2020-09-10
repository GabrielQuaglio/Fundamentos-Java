package fundamentos.conversão;



import javax.swing.JOptionPane;

public class ConversaoStrigNumero {

	public static void main(String[] args) {
		
		//criaremos uma String que vai receber uma classe visual para ao inves de pegarmos a informaçao do terminal iremos usar uma janela visual
		String valor1 = JOptionPane.showInputDialog( // tem que ser imputado uma String
				"digite o primeiro número");
		
		String valor2 = JOptionPane.showInputDialog(
				"digite o segundo número:");
		
		
		System.out.println(valor1 + valor2); //como sao Strings neste caso ele ira concatenar e nao somar
		
		double numero1 = Double.parseDouble(valor1); //String para double usamos .parseDouble para int .parseInt e assim por diante
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("a soma é " + soma);
		System.out.println("a média é " + soma/2);
		
		
		
	}
}
