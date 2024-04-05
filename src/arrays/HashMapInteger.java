package arrays;
import java.util.HashMap;
public class HashMapInteger {
  public static void main(String[]args) {
	  HashMap<String,Integer> nomeIdade = new HashMap<String,Integer>();
	  nomeIdade.put("Mateus", 29);
	  nomeIdade.put("Marcos", 30);
	  
	  for(String y : nomeIdade.keySet()) {
		  System.out.println("Nome: " + y + " idade: " + nomeIdade.get(y) + " Anos");
	  }
  }
}
