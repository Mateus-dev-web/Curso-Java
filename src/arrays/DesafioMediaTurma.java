package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class DesafioMediaTurma {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Quantos alunos ?");
	  int quantAluno =  sc.nextInt();
	  
	  System.out.println("Quantas notas cada aluno ?");
	  int quantNotas = sc.nextInt();
	  
	  double[][] alunoNotas = new double[quantAluno][quantNotas];
	  
	  double total = 0;
	  for(int a = 0; a < alunoNotas.length; a++) {
		  for(int n = 0; n < alunoNotas[a].length; n++) {
			  System.out.printf("Digite a nota %d do aluno %d: ", 
					  n + 1 ,  a + 1);
			  alunoNotas[a][n] = sc.nextDouble();
			  total += alunoNotas[a][n];
		  }
	  }
	  
	  
	  double media = total / (quantAluno * quantNotas);
	  System.out.printf("A média é %.1f\n",media);

	  for(double[] nota: alunoNotas) {
		  System.out.println(Arrays.toString(nota));
	  }
	  sc.close();
	  
  }
}
