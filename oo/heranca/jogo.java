package oo.heranca;

public class jogo {
	public static void main(String[] args) {
		jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		jogador heroi = new Heroi(10, 11);

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Herói tem => " + heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);


		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Herói tem => " + heroi.vida);
	}
}
