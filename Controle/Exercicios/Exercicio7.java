package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		/*7. Criar um programa que enquanto estiver recebendo 
		 * números positivos, imprime no console a soma dos 
		 * números inseridos, caso receba um número negativo, 
		 * encerre o programa. Tente utilizar a estrutura do 
		 * while.		 */
		

		int contador = 0;
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(numero >= 0) {
			System.out.println("Digite um numero: \n(para finalizar digite um numero negativo) ");
			numero = entrada.nextInt();
			contador = contador + numero;
			System.out.printf("Contador = %d\n",contador);
		}
		entrada.close();
	}
}
