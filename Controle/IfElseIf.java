package Controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("nota inválida");
		} else if(nota >= 8.1) {
			System.out.println("Conceito A");
		} else if(nota >= 6.1) {
			System.out.println("Conceito B");
		} else{
			System.out.println("Conceito C");
		}
		System.out.println("Fim!");
		entrada.close();
	}
}
