package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
	//tabela verdade  do(e) &&
	// voce so vai para o shopping se tiver dinheiro e se tiver sol
	//                                          V  &  V = V
	//	                                        V  &  F = F
	//                                          F  %  V = F
	//	                                        F  %  F = F  // ou seja se tiver UM resultado F na tabela verdade(e) & a expressão sera falsa
	// tabela verdade do(ou) ||	
	// voce vai pro shooping se tiver dinheiro ou se o sol tiver brilhando
    //                                 V || V = V
	//	                               V || F = V
	//	                               F || V = V
	//                                 F || F = F  // neste caso se tivermos um V na tabela verdade(ou) || o resultado sera verdadeiro
	//tabela verdade(ou exclusivo) ^
	//voce vai comprar ou o civic ou o celta (voce nao vai deixar de comprar,e tbm nao vai comprar os dois)
	//                      V ^ V = F
	//                      V ^ F = V
	//                      F ^ V = V
	//                      F ^ F = F // neste caso dois V ou dois F dao falso apenas os intercalados dao V
	//negaçao(not) ! antes de uma variavel true ela se torna falsa e ao contrario tambem
		
		boolean condiçao1 = true;
		boolean condiçao2 = 3 > 7;
		
		System.out.println(condiçao1 && !condiçao2);
		System.out.println(condiçao1 || condiçao2);
		System.out.println(condiçao1 ^ condiçao2);
		System.out.println(!condiçao2);
		
	}
}
