package classe;

public class ValorVxReferencia {
   public static void main(String[] args) {
	double a = 2;
	double b = a; // atribuição por valor(Tipo primitivo)
	
	a++;
	b--;
	System.out.println(a + " " + b);
	
   Data d1 = new Data(1,7,2022);
   Data d2 = d1; // atribuição por referência (objeto)
   
   d1.dia = 31;
   d2.mes = 12;
   
   d1.ano = 2025;
   
   System.out.println(d1.obeterDataFormatada());
   System.out.println(d2.obeterDataFormatada());
   
   voltarDataParaValorPadrão(d1);
   
   System.out.println(d1.obeterDataFormatada());
   System.out.println(d2.obeterDataFormatada());
   
   
   int c = 6;
   alterarPrimitivo(c);
   System.out.println(c);
   }
   static void voltarDataParaValorPadrão(Data d) {
	   d.dia = 1;
	   d.mes = 1;
	   d.ano = 1970;
   }
   static void alterarPrimitivo (int a) {
	   a++;
   }
}