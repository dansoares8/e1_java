package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		// double a = 2.3;
		String s = "Bom dia X";
		
		s = s.toUpperCase();
		
		s = s.replace("X", "Senhora");
		
		System.out.println(s);
		
		System.out.println("Daniel".toUpperCase());
		
		String y = "Bom dia X".replace("X", "Daniel").toUpperCase().concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador:
		int a = 3;
		System.out.println(a);
	}

}
