package Classe.Desafio;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		desafioData data1 = new desafioData(25, 04, 1996);
		desafioData data2 = data1;
		
		data1.ano = 1989;
		
		System.out.println(data1.dataformatada());
		System.out.println(data2.dataformatada());
		
		voltarDataParaValorPadrao(data1);
		
		System.out.println(data1.dataformatada());
		System.out.println(data2.dataformatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(desafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1979;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
