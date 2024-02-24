package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
	  // (ºF - 32 ) X 5/9.0 = ºC
		
	
	 final int a = 32;
	 final double c = 5/9.0;
	 double f = 150;
	 double soma = f - a;
	 double celsius = soma * c;
	 System.out.println("ºC " + celsius);
	 
	}

}
