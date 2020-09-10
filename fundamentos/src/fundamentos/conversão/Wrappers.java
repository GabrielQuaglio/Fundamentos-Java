package fundamentos.conversão;



public class Wrappers {

	public static void main(String[] args) {

		// byte // a diferença da maioria dos tipos primitivos para suas classes é a
		// colocaçao da letra maiuscula. execeto o int
        
		Byte b = 100;
       
		Short s = 1000;

		Integer i = 10000; // int

		Long l = 10000000L;// nao esquecer de usar L quando for long pois o computador por padrao associa
							// ao int

		Float f = 123.10F;// tambem devemos usar o F pois por padrao o java associa numeros com ponto flutuante a double
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		System.out.println(s);
		System.out.println(i);
		System.out.println(l / 3);

		Boolean bo = Boolean.parseBoolean("true"); // String para boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());// toUperCase nao existe para boolean porem ao covertemos um boolean para String ele passa a ser possivel de ser usado
		
		Character c = '#'; //char
		System.out.println(c.toString());
	}
}
