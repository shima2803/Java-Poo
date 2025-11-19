package Lista;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array {

	public static void main(String[] args) {

		//Array tem tamanho limitado 
		
		// String [] nomes = {"Joao", "lucas"};
		String[] nomes = new String[2];
		nomes[0] = "Lucas";
		nomes[1] = "Joao";
		
		System.out.println("Array:");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	
		// ArayList
		
		ArrayList <String> teste = new ArrayList <String>();
		teste.add("Lucas");
		teste.add("Joao");
		teste.add("Pedro");
		
		System.out.println("ArrayList:");
		
		teste.remove(0);
		
		for (int i = 0; i < teste.size(); i++) {
			System.out.println(teste.get(i));
		}
		
		teste.clear(); //limpar arrayList
		
		
		//linkeList
		System.out.println("LinkedList");
		
		 LinkedList<String> cars = new LinkedList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		  
		    cars.addFirst("Ferrari");
		    cars.addLast("Pejo");
		    cars.removeFirst();
		   // cars.remove(2);
		   // cars.add(2, "ferrarisa");
		    
		    System.out.println(cars);
		    
	}
}
