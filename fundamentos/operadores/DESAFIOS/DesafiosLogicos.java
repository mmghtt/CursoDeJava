package fundamentos.operadores.DESAFIOS;

public class DesafiosLogicos {
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean condicao1 = trabalho1 && trabalho2;
		System.out.println("Trabalho de quinta e terça deu certo = " + condicao1 + " Então tem TV de 50 polegadas e sorvete");
		
		boolean condicao2 = trabalho1 || trabalho2;
		System.out.println("Trabalho de quinta ou de terça deu certo = " + condicao2 + " Então tem TV de 30 polegadas e sorvete");
		
		System.out.println("Trabalho de quinta e terça não aconteceu = " + !condicao2 + " Então não tem TV nem sorvete");
			
		
	}

}
