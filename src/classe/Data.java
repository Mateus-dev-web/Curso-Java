package classe;

public class Data {
 int dia;
 int mes;
 int ano;
 
 
 Data(){
 dia = 1;
 mes = 1;
 ano = 1970;
 }
 
 Data(int d , int m, int a){
	 dia = d;
	 mes = m;
	 ano = a;
 }
 String obeterDataFormatada() {
	return String.format("%d/%d/%d",dia,mes,ano);
 }
 
 
 void imprimirDataFormatada() {
	 System.out.printf(obeterDataFormatada() );
 }
}
