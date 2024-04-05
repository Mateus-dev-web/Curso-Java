package Encapsulamento;

public class MostraPessoa {
  public static void main(String[] args) {
	  Pessoa obj = new Pessoa();
	  var obj2 = new Pessoa();
	  obj.setNome("Mateus");
	  obj2.setIdade(19);
	  System.out.println(obj.getNome());
	  System.out.println(obj2.getIdade() + " Anos");
  }
}