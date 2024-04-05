package arrays;
import java.util.HashSet;
public class HashSetInteger {
  public static void main(String[]args) {
	  HashSet<Integer> num = new HashSet<Integer>();
	  num.add(2);
	  num.add(3);
	  num.add(7);
	  num.add(9);
	  num.add(1);
	  
	  for(int i = 1; i <= 10; i++) {
		  if(num.contains(i)) {
			  System.out.println(i + " Foi encontrado no conjunto");
		  }else {
			  System.out.println(i + " Não foi encontrado no conjunto");
		  }
	  }
  }
}
