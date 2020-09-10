package fundamentos.String;

public class NotaçaoPonto {

	public static void main(String[] args) {
		
	
	String s = "bom dia X";
	
	s = s.replace("X", "senhora");
	s = s.toUpperCase();
	s = s.concat("!!!");
	
	
	System.out.println(s);	
	
	String x = "leo".toUpperCase();
	System.out.println(x);	
		
	String y = "bom dia X"
			.replace("X" , "Gui")
			.toUpperCase()
			.concat("!!!");
		
		System.out.println(y);
		
		// tipos primitivos nao tem operador "." int a = 3 a. isso nao existe
		
	}
	
	
	
	
	
	
}
