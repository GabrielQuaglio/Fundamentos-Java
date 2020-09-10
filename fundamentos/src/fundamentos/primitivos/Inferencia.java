package fundamentos.primitivos;

public class Inferencia {

public static void main(String[] args) {
	
	double a = 4.5;
	
	System.out.println(a);
	
	a =12;
			System.out.println(a);
/*
 *  quando definimos uma variavel com um valor numerico ela sempre deve estar associada com um valor numerico, 
 *  portanto nao podemos altera-la para a = " ..."
 */
	
	var b = 4.5; //quando usamos var, o java vai inferir pelo tipo da variavel que usamos qual é o tipo da variavel, neste caso sera double
	System.out.println(b);
	
	var c = "texto"; // neste caso sera do tipo string
			System.out.println(c);
			
	c = "outro texto";
			System.out.println(c);
	 
 //c =4.5  quando temos uma inferencia nao podemos mudar o tipo da variavel, porque as variaveis em java sempre sao de um determinado tipo
         //portanto nao podemos dizer na linha 20 que c e uma variavel tipo texto(string) e na linha 26 mudarmos seu valor para um numeral

	double f = 5; // declaraçao e inicializaçao
			System.out.println(f);
			
			
double d;   //variavel foi declarada     // uma novidade é que nao prescisamos definir um valor na criaçao da variavel
d = 123.5;  //variavel foi inicializada
System.out.println(d);  // variavel foi usada

//var e   // o caso acima nao é possivel de ser realizado usando var, pois é a partir da inicializaçao que o java consegue inferir qual é o tipo de dado associado a variavel 
 //e = 123.45 

 //!!!!! sempre lembrar que  se definirmos que uma variavel é numerica independente se definimos de forma explicita o tipo (ex: double) ou implicita ( ex: var)  ela sempre sera numerica
 // para o java inferir  qual o tipo da variavel ele vai olhar o valor que foi associado ex: se usarmos o tipo texto ele vai inferir que usamos o tipo string
 
 
}	     
	
	
	
}

