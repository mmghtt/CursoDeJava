package Classe;

public class ClasseTeste {
	public static void main(String[] args) {
		
		int a = 3;
		
		classe p1 = new classe("Notebook", 4356.89, 0.25);
		
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new classe();
	
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precofinal1 = p1.precoComDesconto(0);
		double precofinal2 = p2.precoComDesconto(0.1);
		double mediacarrinho = (precofinal1 + precofinal2) / 2;
		
		System.out.printf("Média do carrinho é: R$ %.2f.", mediacarrinho);
		//System.out.println(precofinal2);
		
		System.out.println();
	}
}
