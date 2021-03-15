package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*3. Criar um programa que receba duas notas parciais, 
		calcular a média final. Se a nota do aluno for maior ou igual 
		a 7.0 imprime no console "Aprovado", se a nota for menor que 
		7.0 e maior do que 4.0 imprime no console "Recuperação",
		caso contrário imprime no console "Reprovado". */
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite a primeira nota: ");
			double nota1 = entrada.nextDouble();
			
			try (Scanner entrada2 = new Scanner(System.in)) {
				System.out.println("Digite a segunda nota: ");
				double nota2 = entrada2.nextDouble();
				
				double media = (nota1 + nota2)/2;
				System.out.println("Média: " + media);
				
				if(media <= 10.0 && media >= 7.0) {
					System.out.println("Aprovado");
				} else if(media < 7.0 && media >= 4.0) {
					System.out.println("Recuperação");
				}else if(media < 4.0) {
					System.out.println("Reprovado");
				}else {
					System.out.println("Nota inválida");
				}
			}
		}
		
	}
}
