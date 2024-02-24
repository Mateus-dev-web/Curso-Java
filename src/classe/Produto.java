package classe;

public class Produto {
	
     String nome;
     double preco;
     static double desconto = 0.25;
     
     Produto(){
    	 
     }
     
     Produto(String nomeInicial, double precoInicial){
    	 nome = nomeInicial;
    	 preco = precoInicial;
    	
     }
     
     String precoFormatado() {
    	 return String.format("Média do carrinho = R$%.2f.",desconto);
     }
     
    double precoComDesconto() {
    	return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente) {
      return preco * (1 - desconto);
    }
}
