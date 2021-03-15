package Controle.Exercicios;

import java.util.Scanner;

public class Exercicios4 {
	public static void main(String[] args) {
		/*4. Criar um programa que receba 
		 * um número e diga se ele é um número primo.
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = entrada.nextInt();
		int contador = 0;
		
		for(int i =1; i <= numero; i++) {
			if(numero%i == 0) {
				contador++;
			}
		}
		
			if(contador == 2) {
			System.out.printf("%d é numero primo", numero);
		}else {
			System.out.printf("%d não é numero primo", numero);
		}
		entrada.close();
	}
}
