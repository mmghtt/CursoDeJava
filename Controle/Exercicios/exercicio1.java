package Controle.Exercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		//1. Criar um programa que receba um número e 
		//verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		if(numero <= 10 && numero >= 0) {
			System.out.printf("%d está entre 0 e 10\n", numero);
		} else {
			System.out.println("Numero fora do range 0 e 10\n");
		}
		if(numero % 2 == 0) {
			System.out.printf("%d é par\n", numero);
		} else {
			System.out.println("Numero ímpar");
		}
		
		entrada.close();
		
	}
}
