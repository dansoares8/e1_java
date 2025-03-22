package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		//declarando variáveis:
		double raio = 3.4;
		final double PI = 3.1415;
		double area = PI * raio * raio;
		
		//imprimindo algo na tela:
		System.out.println("O valor da Circunferência da Área é: " + area);
		
		raio = 10; 
		area = PI * raio * raio;
		System.out.println("O valor da Circunferência da Área é: " + area + " Metros Quadrados.");
	}
}
