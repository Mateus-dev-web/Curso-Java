package Encapsulamento;

public class Pessoa {
   private String nome;
   private int idade;
   
   public String getNome() {
	   return nome;
   }
   
   public int getIdade() {
	   return idade;
   }
   
   
   public void setIdade(int novaIdade) {
	   this.idade = novaIdade;
   }
   
   public void setNome(String novoNome) {
	   this.nome = novoNome;

   }
   
}

