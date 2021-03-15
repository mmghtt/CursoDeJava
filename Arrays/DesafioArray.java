package Arrays;

import java.util.Arrays;
import java.util.Scanner;
/*pedir uma qtd de notas, pedir o 
valor dessa qtd de nossas, somar as notas e tirar a média*/

public class DesafioArray {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma qtd de notas: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];

		
		for (int i = 0; i < qtdNotas; i++) {
			Scanner entrada2 = new Scanner(System.in);
			System.out.printf("Digite a %dª nota: ", i+1);
			notas[i] = entrada2.nextDouble();
			
		}
		System.out.println(Arrays.toString(notas));
		
		double soma = 0;
		for (double nota : notas) {
			soma = soma + nota;
		}
		double media = soma/qtdNotas;
		
		System.out.println("A média é: " + media);		
		
	}
}
