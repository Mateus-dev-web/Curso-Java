package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		 // Trabalho na terça (v ou F) 2 V TV 50PG sovete
		// Trabalho na quinta (v ou F) 1 V TV 32PG sovete
	   // Nenhum trabalho deu certo ficar em casa
		
	  boolean trabalho1 = true;
	  boolean trabalho2 = true;
	
	  
	  boolean Compratv50 = trabalho1 && trabalho2;
	  boolean Compratv32 = trabalho1 ^ trabalho2;
	  boolean tomouSorvete = trabalho1 || trabalho2;
	  boolean ficarEmCasa = !trabalho1 && !trabalho2;

	
	 
	 System.out.println("Comprou tv 50 é tomar sorvete ? " + Compratv50);
	 System.out.println("Comprou tv 32 é tomar sorvete ? " + Compratv32);
	 System.out.println("O trabalho não deu certo Ficar em casa ? " + ficarEmCasa);
	 System.out.println("Ta cheio ? " + tomouSorvete);
	 System.out.println("Ta mais saúdavel ? " + !tomouSorvete );
	  
	}

}
