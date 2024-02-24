package fundamentos;
import java.util.Scanner;
import java.util.Locale;
public class DesafioConversao {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro Sálario:");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite seu segundo Sálario:");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite seu terceiro Sálario:");
		String salario3 = entrada.next().replace(",", ".");
		
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.printf("Sálario 1 = %f\nSálario 2 = %f\nSálario 3 = %f\nA média é: %f ",s1,s2,s3,media);
		
		entrada.close();
	}

}
