package fundamentos.EXERCICIOS;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*Criar um programa que leia a temperatura em Fahrenheit 
		  e converta para Celsius. */
		
		//c = f - 32/ 1,8
		
		System.out.println("Escreva uma temperatura em graus Celsius: ");
		Scanner entrada = new Scanner(System.in);
		Double fahrenheit = entrada.nextDouble();
		
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println(celsius);
		
		entrada.close();
	}
}
