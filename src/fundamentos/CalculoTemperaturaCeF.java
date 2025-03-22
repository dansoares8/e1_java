package fundamentos;

public class CalculoTemperaturaCeF {

	
	public static void main(String[] args) {
		
		System.out.println("Convertendo a temperatura de Celsius para Fahrenheit:");
		
		double celsius = 36.5;		
		double CparaF = (celsius * 9.0 / 5.0 ) + 32;
		
		System.out.println(celsius + "º celsius, quando convertido para Fahrenheit se torna: " + CparaF + "º");
		
		System.out.println("");
		
		System.out.println("Convertendo a temperatura de Fahrenheit para Celsius:");
		double fahrenheit = 93.6;
		
		double FparaC = (fahrenheit - 32) * 5.0 / 9.0;
		
		System.out.println(fahrenheit + "º Fahrenheit, quando convertido para Celsius se torna: " + FparaC + "º");
	}
}
