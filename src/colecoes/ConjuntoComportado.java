package colecoes;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		SortedSet <String> lista = new TreeSet<>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Lucas");
		lista.add("Marcos");
		lista.add("Pedro");
		
		for(String candidato : lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
     System.out.println(nums.size());
     for(int x : nums) {
    	 System.out.println(x);
     }
	}

}
