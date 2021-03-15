package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
	public static void main(String[] args) {
		
		Set <String> lista = new HashSet <String>();
		//TreeSet <String> lista = new TreeSet <String>();
		lista.add("Eu");
		lista.add("birinha");
		lista.add("Maria");
		lista.add("Clara");
		
		for(String nois: lista) {
			System.out.println(nois);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
