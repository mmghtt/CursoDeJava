package fundamentos.EXERCICIOS;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*Criar um programa que leia um valor e 
		  apresente os resultados ao quadrado e ao cubo do valor. */
		
		System.out.println("Escreva um valor: ");
		Scanner entrada = new Scanner(System.in);
		float valor = entrada.nextFloat();
		
		float valorQuad = (float) Math.pow(valor, 2);
		float valorCubo = (float) Math.pow(valor, 3);
		
		System.out.printf("Valor ao quadrado: %.2f \n", valorQuad);
		System.out.printf("Valor ao cubo: %.2f", valorCubo);
		
	}
}
