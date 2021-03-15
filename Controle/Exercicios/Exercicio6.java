package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
		 * o número armazenado.
		 */
		Scanner scanner = new Scanner(System.in);
		int numeroSorteado = 24;
		int tentativas = 0;
		int numero;
		System.out.println("Tente adivinhar um numero de 1 a 100 \nVocê tem até 10 tentativas\n");

		do {
			tentativas++;
			System.out.printf("Tentativa %d: ", tentativas);
			numero = scanner.nextInt();

			if (numero > numeroSorteado) {
				System.out.printf("\nO numero sorteado eh menor que %d\n\n", numero);
			} else if (numero < numeroSorteado) {
				System.out.printf("\nO numero sorteado eh maior que %d\n\n", numero);
			} else {
				System.out.printf("\nParabéns! Você acertou o numero %d em %d tentativa(s)!\n\n", numeroSorteado, tentativas);
			}
			if(tentativas == 10) {
				System.out.printf("Acabou o numero de tentativas, o numero sorteado era %d\n", numeroSorteado);}

		} while (numero != numeroSorteado && tentativas < 10);
		scanner.close();
	}
}
