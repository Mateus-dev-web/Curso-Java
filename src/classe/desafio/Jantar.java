package classe.desafio;

public class Jantar {
  public static void main(String[] args) {
	Comida c1 = new Comida("Arroz", 0.223);
	Comida c2 = new Comida("Feijão", 0.300);
	
	Pessoa p1 = new Pessoa("Mateus",70.0);
	Pessoa p2 = new Pessoa("Lucas",57.0);
	
	System.out.println(p1.apresentar());
	System.out.println(p2.apresentar());
	p1.comer(c1);
	p2.comer(c2);
	System.out.println(p1.apresentar());
	
	
   }
}
