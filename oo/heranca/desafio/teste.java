package oo.heranca.desafio;

public class teste {
	
	public static void main(String[] args) {
		carro c1 = new civic();
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		carro c2 = new ferrari(400);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		
		
	}
}
