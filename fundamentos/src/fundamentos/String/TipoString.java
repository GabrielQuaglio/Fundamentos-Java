package fundamentos.String;

public class TipoString {

	public static void main(String[] args) {
		// String nao é primitivo por conta disso permite usarmos suas funcionalidades com o "."
		
		System.out.println("ola pessoal".charAt(2)); // .charAT funcionalidade string usada para ecolher um indice da String com um numeral que define qual sera o indice
														
		String g = "boa tarde";// String é um valor imutavel, a partir do momento que atribuimos um valor a ela nao consaeguimos muda-lo apenas modifica-lo						
		System.out.println(g.toUpperCase());

		String s = "boa tarde"; // criaçao de uma String note que o "s" é maisculo e o texto que acompanha a  string esta entre aspas						
		System.out.println(s.concat("!!!"));// .concat uma funcionalidade usada para concatenar = +, note que sempre usamos o "." para chamarmos uma funcionalidade
											
        String e = "boa tarde";
        System.out.println(e.startsWith("boa")); //.startsWith é usada para vermos se uma String inicia com um determinado prefixo
        
        String f = "BOM dia";
        System.out.println(f.toLowerCase().startsWith("bom")); // podemos usar uma funcionalidade para mudar o resultado, neste caso e possivel observar
                                                               // podemos ver tambem que podemos usar uma funcionalidade seguida da outra
        
        String h = "feijoada";
        System.out.println(h.length()); //usada para vermos quantos caracteres possuem uma determinada palavara
        
        String r = "hello world";
        System.out.println(r.endsWith("world")); //.endsWith mesma coisa de .startsWith so que usa um sulfixo
        
        String w = "fuder";
        System.out.println(w.equals("fuder")); //.equals é usada para vermos se um objeto é igual ao outro
        System.out.println(w.equalsIgnoreCase("Fuder"));// mesma funcionalidade do acima porem ignora se modificaçoes ( APENAS letras maisculas ou minusculas)
        
        //existem funcionalidades da String que retornam novas strings(ex: na linha 8,11,14) e alguma que retornam outros valores (ex: na lina 17,20,24,27,30)
        
        var nome = "Pedro";// o var reconhece estas variaveis como uma string, entao é possivel usar as funcionalidades neste caso
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        
        System.out.println("\nNome : " + nome + "\nsobrenome : " + sobrenome + "\nidade : " + idade + "\nsalario : " + salario + "\n\n" );
        // 1: para fazermos todo este processo perdemos muito tempo 2: aprendemos como usar uma quebra de linha "\ntexto"
        
        System.out.printf("o senhor %s %s tem %d anos e ganha R$%.2f", nome , sobrenome , idade , salario );
        // podemos usar o System.out.printf para facilitarmos todo o processo
        // passo passo 1: criaremos o System.out.printf 2: criaremos aspas e escreveremos uma frase substituindo a String pelo cararcter especial de format
        //que sao %s = String, %d = reais, %f = ponto flutuante (reais). 
        
        
        
        String frase = String.format("\no senhor %s %s tem %d anos e ganha R$%.2f", nome , sobrenome , idade , salario);
        System.out.println(frase);
        //neste caso criamos uma string para armazenar o format
        //1: cria a String e a denomina 2: atribuimos a String o String.format(); e escrevemos normalmente como escrevemos na forma anterior
        //depois criamos o Syso e executamos
        
        String p = "frase qualquer";
        System.out.println("\n" + p.contains("qual")); //.contains verifica se na string contem um determinado conjundo de letras
        System.out.println("\n" + p.indexOf("qual")); //.indexOf indica em qual numero um determinado conjunto de letras começa
        System.out.println("\n" + p.substring(6));   //.substring indica oque esta escrito APARTIR de um numero ate o final
        System.out.println("\n" + p.substring(6, 10)); // na mesma fucionalidade da String podemos definir ate onde queremos que ele mostre oque esta escrito, ele exlui o ultimo numero
	}      

}
