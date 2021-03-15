package fundamentos.EXERCICIOS;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*Criar um programa que resolve equações do segundo grau 
		 * (ax2 + bx + c = 0) 
		 * utilizando a fórmula de Bhaskara. 
		 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta*/
		
		System.out.println("Digite o valor de a: ");
		Scanner entrada = new Scanner(System.in);
		float a = entrada.nextFloat();
		
		System.out.println("Digite o valor de b: ");
		Scanner entrada2 = new Scanner(System.in);
		float b = entrada2.nextFloat();
		
		System.out.println("Digite o valor de c: ");
		Scanner entrada3 = new Scanner(System.in);
		float c = entrada3.nextFloat();
		
		System.out.println("Digite o valor de x: ");
		Scanner entrada4 = new Scanner(System.in);
		float x = entrada4.nextFloat();
		
		float resultado = (float) (a * (Math.pow(x, 2)) + b*x + c);
		
		System.out.printf("O resultado é: %.2f ", resultado);
	}
}
