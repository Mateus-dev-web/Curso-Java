package fundamentos;
import java.util.Scanner;
public class Console {

	public static void main(String[] args) {
		
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Digite o seu Nome: ");
      String nome = entrada.nextLine();
      

      System.out.print("Digite o seu Sobrenome: ");
      String sobrenome = entrada.nextLine();
      
      System.out.print("Digite o sua idade: ");
      int idade = entrada.nextInt();
      
      System.out.println("Nome: " + nome + " " + sobrenome);
      System.out.printf("%s %s tem %d anos",nome,sobrenome,idade);
      entrada.close();
	}

}
