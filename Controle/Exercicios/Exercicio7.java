package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		/*7. Criar um programa que enquanto estiver recebendo 
		 * n�meros positivos, imprime no console a soma dos 
		 * n�meros inseridos, caso receba um n�mero negativo, 
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
