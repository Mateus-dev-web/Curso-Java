package arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ArraysInter {
  public static void main(String[]args) {
	  ArrayList<Integer>num = new ArrayList<Integer>();
	  num.add(10);
	  num.add(34);
	  num.add(7);
	  num.add(3);
	Collections.sort(num);
	  for(int i = 0; i < num.size(); i++) {
		  System.out.println(num.get(i));
	  }
  }
}
