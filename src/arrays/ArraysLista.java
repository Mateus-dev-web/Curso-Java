package arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ArraysLista {
   public static void main(String[]args) {
	   ArrayList<String> caros = new ArrayList<String>();
	   caros.add("volvo");
	   caros.add("Bmw");
	   caros.add("Ford");
	   caros.add("Gol");
	   
   Collections.sort(caros);
	   for(String y : caros) {
		   System.out.println(y);
	   }
   }
}
