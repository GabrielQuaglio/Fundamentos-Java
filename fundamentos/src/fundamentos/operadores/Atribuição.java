package fundamentos.operadores;

public class Atribui��o {

	public static void main(String[] args) {

	int a = 3;
	int b = a;
	int c = a + b;	
		
	c += b;// c= c + b;
	c -= a;// c = c - a;
	c *= b;// c = c * b
	c /= a;// c = c / a;
	c %= 2;// c = % 2; para descobrirmos se o numero � par ou impar, se der 0 � par se der 1 � impar
	System.out.println(c);  
	 
	}
}
