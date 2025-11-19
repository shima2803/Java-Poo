package Lista;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex01 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Lucas");
		nomes.add("Angela");
		nomes.add("Joao");
		
		nomes.remove(1);
		
		System.out.println(nomes);
	
		
		LinkedList<String> nome = new LinkedList<String>();
		nome.add("Joana");
		nome.add("Ana");
		nome.add("Ruan");
		nome.removeFirst();
		
		System.out.println(nome);
		
	}
}