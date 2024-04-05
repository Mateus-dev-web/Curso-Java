package arrays;
import java.util.Scanner;
import java.util.Locale;
public class DesafioCalcularNotasAluno {
     public static void main(String[] args) {
    	 Locale.setDefault(new Locale("en","US"));
    	 Scanner entrada = new Scanner(System.in);
    	 
         System.out.println("Quantas notas ? ");
         int quantNotas = entrada.nextInt();
         double[] notas = new double[quantNotas];
         
         for(int x = 0; x < notas.length; x++) {
        	 System.out.println("Digite a nota: " + (x + 1) + ":");
        	 notas[x] = entrada.nextDouble();
         }
         
       double total = 0;
       for(double notasAluno: notas) {
    	   total += notasAluno;
       }
       double media = total / notas.length;
       System.out.printf("A media e %.1f", media);
		 entrada.close();
	}
}
