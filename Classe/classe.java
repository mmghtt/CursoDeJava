package Classe;

public class classe {
	String nome;
	double preco;
	double desconto;
	
	
	classe(String nomeInicial, double precoInicial, 
			double descontoInicial) {
		desconto = descontoInicial;
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	classe() {
		
	}


	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
