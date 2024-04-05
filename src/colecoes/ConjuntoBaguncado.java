package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
     @SuppressWarnings("unchecked")
	public static void main(String[] args) {
    	 @SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
    	 
    	 conjunto.add(1.2); // double -> Double
    	 conjunto.add(true); // boolean -> Boolean
    	 conjunto.add("Teste");// String 
    	 conjunto.add(1); // Integer
    	 conjunto.add('x'); // Character
    	 
    	 System.out.println("Tamanho é " + conjunto.size());
    	 conjunto.add("Teste");
    	 System.out.println("Tamanho é " + conjunto.size());
    	 
    	 System.out.println(conjunto.remove("Teste"));
    	 System.out.println(conjunto.remove('x'));
    	 System.out.println(conjunto.contains(1));
    	 
    	 @SuppressWarnings("rawtypes")
		Set nums = new HashSet();
    	 
    	 nums.add(1);
    	 nums.add(2);
    	 nums.add(3);
    	 
    	 System.out.println(conjunto);
    	 System.out.println(nums);
    	 
    	// conjunto.addAll(nums); // união entre dois conjuntos 
    	 System.out.println(conjunto);
    	 
    	conjunto.retainAll(nums); // pega só os intens em comun
    	System.out.println(conjunto);
    	
    	conjunto.clear();
    	System.out.println(conjunto);
     }
}
