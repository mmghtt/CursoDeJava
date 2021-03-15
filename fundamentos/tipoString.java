package fundamentos;

public class tipoString {
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));

		String s = "Boa tarde!";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "123");

		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde!"));
		System.out.println(s.equalsIgnoreCase("Boa tarde!"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome);
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha $ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha $ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));
	}

}
