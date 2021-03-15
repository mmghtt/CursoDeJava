package fundamentos.EXERCICIOS;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*Criar um programa que leia o peso e a 
		 * altura do usuário e imprima no console o IMC.*/
		//imc = peso / altura²
		
		System.out.println("Digite seu peso: ");
		Scanner entrada = new Scanner(System.in);
		float peso = entrada.nextFloat();
		peso = peso * 10000;
		
		System.out.println("Digite sua altura: ");
		Scanner entrada2 = new Scanner(System.in);
		float altura = entrada2.nextFloat();
		
		double IMC = peso / Math.pow(altura, 2);
		System.out.printf("%.2f ", IMC);
		
		
	}

}
