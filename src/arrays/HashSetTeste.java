package arrays;
import java.util.HashSet;
public class HashSetTeste {
  public static void main(String[]args) {
	  HashSet<String> caros = new HashSet<String>();
	  
	  caros.add("Gol");
	  caros.add("Golf");
	  caros.add("Celta");
	  System.out.println(caros);
	  for(String i : caros) {
		  System.out.println(i);
	  }
  }
}
