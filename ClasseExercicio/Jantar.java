package ClasseExercicio;

public class Jantar {
	public static void main(String[] args) {
		DesafioComida c1 = new DesafioComida("Arroz", 0.180);
		DesafioComida c2 = new DesafioComida("Feij�o", 0.300);
		
		Pessoa p = new Pessoa("Jo�o", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
	}
}
