package herancaJava;

public class Carro extends Veiculo{
   private String modelo = "GTI";
   public static void main(String[] args) {
	   Carro obj = new Carro();
	   
	   obj.Barulho();
	   System.out.println(obj.marca + " " + obj.modelo);
   }
}
