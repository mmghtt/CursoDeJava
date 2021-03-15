package Classe.Desafio;

public class desafioDataTeste {
	public static void main(String[] args) {
		
		desafioData data1 = new desafioData();
		//data1.ano = 2021;

		/*data1.dia = 25;
		data1.mes = 04;
		data1.ano = 1996;*/

		desafioData data2 = new desafioData(19, 9, 1989);

		/*data2.dia = 19;
		data2.mes = 9;
		data2.ano = 1989;*/

		String dataFormatada1 = data1.dataformatada();
		System.out.println(dataFormatada1);
		System.out.println(data2.dataformatada());

		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}

}
