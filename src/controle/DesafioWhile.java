package controle;
import java.util.Scanner;
import java.util.Locale;
public class DesafioWhile {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 pra sair) ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
			total += nota;
			quantidadeNotas++;
			}else if(nota != -1) {                     
				System.out.println("Nota invalida!!!");
			}
		}
		
		double media = total / quantidadeNotas;
		System.out.println("Média = " + media);
		entrada.close();
	}

}
