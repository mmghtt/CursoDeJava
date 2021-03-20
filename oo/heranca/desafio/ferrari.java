package oo.heranca.desafio;

public class ferrari extends carro {
	
	ferrari(){
		this(315);
	}
	
	ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
	@Override
	void acelerar() {
		super.acelerar();
	}
}
