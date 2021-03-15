package ClasseExercicio;

public class Jantar {
	public static void main(String[] args) {
		DesafioComida c1 = new DesafioComida("Arroz", 0.180);
		DesafioComida c2 = new DesafioComida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("João", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
	}
}
