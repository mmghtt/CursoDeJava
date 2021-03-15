package Controle.desafio;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// usu�rio digita uma nota >=0 ou <= 10
		// armazenar var total
		// vai armazenando a nota no total
		// outra var para definir quantas notas v�lidas foi tc
		// total, qtd notas digitadas e m�dia
		// para mostrar o resultado = usu�rio digita -1

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
		System.out.println("A qtd de notas �: \n" + qtd + "\nA soma das notas �: \n" + total + "\nE a m�dia �: \n" + media);
		
		entrada.close();
	}
}
