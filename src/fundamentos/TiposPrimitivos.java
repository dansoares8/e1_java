package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//informações do funcionário
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_134_845_223L;
		
		//tipos numéricos reais:
		float salario = 11_445.44F;
			/*colocando um literal dentro de um float, não double, deve colocar o F no final, 
			que obrigará o sistema a declarar como float, mesmo que esteja como float.
			O java não analisa o valor, ele analisa o tipo de dado.
			*/
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano:
		boolean estaDeFerias = false; //ou true, em java não é possível colocar zero ou um no lugar de true ou false.
		char status = 'A'; //ativo. O char só aceita uma única letra.
		
		//Calcular os Dias de empresa desse funcionário:
		System.out.println("O funcionário possui: " + anosDeEmpresa * 365 + " dias na empresa");
		
		//Número de viagens:
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real:
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
		
		/* quando você declara uma variável e não a usa, ela fica com um sinal de alerta no seu código, informando que ela precisa ser usada.
		 */
	}

}
