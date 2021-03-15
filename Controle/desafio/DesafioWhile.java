package Controle.desafio;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// usuário digita uma nota >=0 ou <= 10
		// armazenar var total
		// vai armazenando a nota no total
		// outra var para definir quantas notas válidas foi tc
		// total, qtd notas digitadas e média
		// para mostrar o resultado = usuário digita -1

		Scanner entrada = new Scanner(System.in);

		int nota = 0;
		int qtd = 0;
		int total = 0;

		do {
			System.out.println("Digite uma nota: ");
			System.out.println("Digita  -1 para sair e ver o resultado");
			nota = entrada.nextInt();
			
			if (nota <= 10 && nota >= 0) {
				total = total + nota;
				qtd++;
			}
		} while (!(nota == -1));
		
		int media = total / qtd;		
		System.out.println("A qtd de notas é: \n" + qtd + "\nA soma das notas é: \n" + total + "\nE a média é: \n" + media);
		
		entrada.close();
	}
}
