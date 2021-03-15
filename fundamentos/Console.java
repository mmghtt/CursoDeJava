package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("Dia\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d\n", 
				1, 2, 3, 4, 5);			
		System.out.printf("Salário: %.1f\n", 1234.4678);
		System.out.printf("Nome: %s", "João\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: \n");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: \n");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o sua idade: \n");
		int idade = entrada.nextInt();
		
		entrada.nextDouble();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();
		
		
	}
}
