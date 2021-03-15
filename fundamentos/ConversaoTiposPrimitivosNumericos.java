package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1.12345888888; //implicita
		System.out.println(a);
		
		float b = (float) 1.12345; //explicita (CAST)
		System.out.println(b); 
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);	
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
