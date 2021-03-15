package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
/* 9. Crie um programa que recebe 10 valores e 
		ao final imprima o maior número.
*/
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int numeroMaior = 0;
		
		for(int i = 0; i < 10; i++){
			contador++;
			System.out.printf("Digite o %d º numero: ", contador);
			int numero = entrada.nextInt();
			
			if(numero > numeroMaior) {
				numeroMaior = numero;
			}
		}
		entrada.close();
		System.out.println("O maior numero é: " + numeroMaior);
	}
}
