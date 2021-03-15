package fundamentos.DESAFIOS;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		/*int a = 3 * 4 - 10;
		int b = (int)Math.pow(a, 3);
		double c = (int)Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);*/
		
		int a = 3 + 2;
		int b = 6 * a;
		double c = (int)Math.pow(b, 2);
		double d = (int)2 * 3;
		double e = (int)c / d;
		
		float f = 1 - 5;
		float g = 2 - 7;
		float h = f * g;
		float i = h / 2;
		float j = (int)Math.pow(i, 2);
		
		double k = (int)e - j;
		double l = (int)Math.pow(k, 3);
		
		double m = l / (int)Math.pow(10, 3);
		System.out.println(m);
		
	}

}
