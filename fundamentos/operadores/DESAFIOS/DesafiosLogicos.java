package fundamentos.operadores.DESAFIOS;

public class DesafiosLogicos {
	public static void main(String[] args) {
		//Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean condicao1 = trabalho1 && trabalho2;
		System.out.println("Trabalho de quinta e ter�a deu certo = " + condicao1 + " Ent�o tem TV de 50 polegadas e sorvete");
		
		boolean condicao2 = trabalho1 || trabalho2;
		System.out.println("Trabalho de quinta ou de ter�a deu certo = " + condicao2 + " Ent�o tem TV de 30 polegadas e sorvete");
		
		System.out.println("Trabalho de quinta e ter�a n�o aconteceu = " + !condicao2 + " Ent�o n�o tem TV nem sorvete");
			
		
	}

}
