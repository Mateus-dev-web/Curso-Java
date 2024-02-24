package classe;

public class DataTeste {
   public static void main(String[] args) {
	Data d1 = new Data();

	
	Data d2 = new Data(17,9,1994);
	
	
	String dataFormatada1 = d1.obeterDataFormatada();
	String dataFormatada2 = d2.obeterDataFormatada();
	
    System.out.println(dataFormatada1);
    System.out.println(dataFormatada2);
    d1.imprimirDataFormatada();
   }
}
