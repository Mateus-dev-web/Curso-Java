package colecoes;

import java.util.ArrayList;

public class Lista {
   public static void main(String[] args) {
	  ArrayList<Usuario> lista = new ArrayList<>();
	  
	  Usuario u1 = new Usuario("Joselia");
	  lista.add(u1);
	  lista.add(new Usuario("Luciana"));
	  lista.add(new Usuario("Pedro"));
	  lista.add(new Usuario("Carlos"));
	  lista.add(new Usuario("Paulo"));
	  lista.add(new Usuario("João"));
	  System.out.println(lista.get(3));
	  for(Usuario u  : lista) {
		  System.out.println(u);
	  }
   }
}
