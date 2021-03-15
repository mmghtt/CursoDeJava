package fundamentos.DESAFIOS;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("infomre o primeiro salário: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("\ninfomre o segundo salário: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("\ninfomre o terceiro salário: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario01 = Double.parseDouble(valor1);
		double salario02 = Double.parseDouble(valor2);
		double salario03 = Double.parseDouble(valor3);
		
		double media = (salario01 + salario02 + salario03 / 3);
		System.out.println(" média dos salários é: " + media);
		entrada.close();
	}
}
