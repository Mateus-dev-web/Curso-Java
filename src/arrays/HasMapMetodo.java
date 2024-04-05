package arrays;
import java.util.HashMap;
public class HasMapMetodo {
  public static void main(String[]args) {
	  HashMap<String,String> paisCidade = new HashMap<String,String>();
	  paisCidade.put("Brasil","Brasilia");
	  paisCidade.put("Inglaterra", "Londres");
	  System.out.println(paisCidade);
	 
	  
	  for(String i : paisCidade.keySet()) {
		  System.out.println(i);
	  }
	  
	  for(String i : paisCidade.values()) {
		  System.out.println(i + "\n");
	  }
	  
	  for(String y : paisCidade.keySet()) {
		  System.out.println("Pais " + y + " Cidade " + paisCidade.get(y));
	  }
  }
}
