package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Godan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Seo o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			/*default:
				System.out.println("Não sei nada");*/
		}
	}
}
