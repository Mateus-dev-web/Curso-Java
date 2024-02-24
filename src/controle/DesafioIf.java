package controle;
import java.util.Locale;
public class DesafioIf {
   public static void main(String[] args) {
	Locale.setDefault(new Locale("en","US"));
	
	double nota = 9.3;
	
	if(nota >= 9.0) {
		System.out.println("Quadro de Honra");
		System.out.println("Você é fera!!!");
	}
	
   }
}