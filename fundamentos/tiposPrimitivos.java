package fundamentos;

public class tiposPrimitivos {
	public static void main(String[] args) {
		//info funcionario
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numeros reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_797_991_103.01;
		
		//tipo boleano
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status );
	}

}
