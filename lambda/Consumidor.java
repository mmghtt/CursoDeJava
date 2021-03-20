package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 12.34, 0.09);
		Produto p3 = new Produto("Caderno", 12.34, 0.09);
		Produto p4= new Produto("Borracha", 7.80, 0.09);
		Produto p5 = new Produto("L�pis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p3, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}

}
