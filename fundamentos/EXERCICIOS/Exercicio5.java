package fundamentos.EXERCICIOS;

import java.util.Scanner;

public class Exercicio5 {
		public static void main(String[] args) {
			/*Criar um programa que leia o valor da base e 
			 * da altura de um triângulo e calcule a área. */
			//triangulo = b*h/2
			
			System.out.println("Digite a base de um triângulo: ");
			Scanner entrada = new Scanner(System.in);
			int base = entrada.nextInt();
			
			System.out.println("Digite a altura de um triângulho: ");
			Scanner entrada2 = new Scanner(System.in);
			int altura = entrada.nextInt();
			
			int area = base * altura / 2;
			System.out.print("A base do triângulho é " + area);
		}
}
