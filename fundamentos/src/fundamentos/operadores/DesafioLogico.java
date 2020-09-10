package fundamentos.operadores;



public class DesafioLogico {

	public static void main(String[] args) {
		
	//traalho na terça (V ou F)
	//trabalho na quinta-feira (V ou F)
	//se apenas um der certo a tv comprada sera de 32 polegadas
	// se os dois derem certo sera uma de 50 polegas
	// comprando uma de 32 ou de 50 a familia vai tomar sorvete
	//se nenhum der certo,nada vai dar certo
	
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("Ele comprou a tv maior: " + tv50);
		System.out.println("Comprou a tv menor: " + tv32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Ele tomou sorvete: "+ sorvete);
		
		boolean saudavel= !sorvete;//operador unario
		boolean semFome = sorvete;
		System.out.println("A familia esta sem fome: " + semFome);
		System.out.println("A familia esta com fome: " + saudavel);
		//ctrl + alt + a pra editar duas linhas ao mesmo tempo
		
	}
}
