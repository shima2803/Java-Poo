package HashMap;

import java.util.HashMap;

public class ex01 {
	
	public static void main(String[] args) {
		
		HashMap <String, Double> frutas = new HashMap<String,Double>();
		frutas.put("Maça",1.90);
		frutas.put("Laranja", 2.90);
		
		System.out.println(frutas);
		System.out.println(frutas.get("Maça"));
		
	}
}
