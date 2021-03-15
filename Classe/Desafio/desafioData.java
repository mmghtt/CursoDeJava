package Classe.Desafio;

public class desafioData {
	int dia;
	int mes;
	int ano;
	
	desafioData () {
		/*dia = 1;
		mes = 1;
		ano = 1970;*/
		this(1, 1, 1970);
	}
	
	desafioData(int diaInicial, int mesInicial, int anoInicial) {
		this.dia = dia;
		this.mes = mes ;
		this.ano = ano ;
	}

	String dataformatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
	
}
