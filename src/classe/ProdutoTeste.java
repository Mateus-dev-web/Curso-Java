package classe;
import java.util.Locale;
public class ProdutoTeste {
	
    public static void main(String[] args) {
      Locale.setDefault(new Locale ("en", "US"));
      
      Produto p1 = new Produto("Notebook",4356.89);
     
      
      var p2 = new Produto("Caneta Preta",12.56);
      
      Produto.desconto = 0.29;
      
      double precoFinal1 = p1.precoComDesconto();
      double precoFinal2 = p2.precoComDesconto(0.1);
      double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
      
      String f = p1.precoFormatado();
      
      System.out.println(f);
      System.out.println(mediaCarrinho);
     
	}
}
