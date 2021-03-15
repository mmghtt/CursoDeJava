package fundamentos.EXERCICIOS;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*Criar um programa que leia a temperatura em Celsius 
		 * e converta para Fahrenheit. */
		//F=1,8C+32
		
		System.out.println("Escreva uma temperatura em graus Celsius: ");
		Scanner entrada = new Scanner(System.in);
		Double celsius = entrada.nextDouble();
		
		double fahrenheit = 1.8*celsius+32;
		System.out.println(fahrenheit);
		
		entrada.close();
	}

}
