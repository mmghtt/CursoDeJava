package Controle.Exercicios;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		//2. Criar um programa informa se o 
		//ano atual é um ano bissexto;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();
		
		boolean anoDivisivel = ano / 100 == 0;
		
		if(ano % 4 == 0 && !anoDivisivel) {
			System.out.printf("%d é um ano bissexto\n", ano);
		} else {
			System.out.println("Não é um ano bissexto");
		}
		entrada.close();
	}
}
