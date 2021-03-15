package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		//5. Refatorar o exercício 04, 
		//utilizando a estrutura switch.
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite um numero para verificar se é primo: ");
		int numero = entrada.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		switch (contadorDeDivisores) {
		case 0:
			System.out.printf("O numero %d é primo", numero);
			break;
			
			default:
				System.out.printf("O numero %d não é primo", numero);
		}
		entrada.close();
	}
}
