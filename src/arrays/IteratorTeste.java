package arrays;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorTeste {
	public static void main(String[]args) {
ArrayList<String> caros = new ArrayList<String>();
     caros.add("Fiat");
     caros.add("Golf");
     caros.add("Celta");
     caros.add("Gol");
     
     Iterator<String> item = caros.iterator();
     System.out.println(item.next());
     
     while(item.hasNext()) {
    	 System.out.println(item.next());
     }
	}
}
