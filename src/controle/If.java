package controle;
import java.util.Scanner;
import java.util.Locale;
public class If {
    public static void main(String[] args) {
    	Locale.setDefault(new Locale("en","US"));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
	    boolean aprovado = media <= 10 && media >= 7.0;
		if(aprovado) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
	    boolean recuperacao =	media < 7 && media >= 4.5;
		if(recuperacao) {
			System.out.println("Recuperação");
		}
		
		
	    boolean reprovado   =  media < 4.5 && media >= 0;
		if(reprovado) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
