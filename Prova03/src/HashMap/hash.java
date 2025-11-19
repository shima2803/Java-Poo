package HashMap;

import java.util.HashMap;

public class hash {

	public static void main(String[] args) {

		HashMap <String, Integer> id = new HashMap<String,Integer>();
		
		id.put("Lucas", 01);
		id.put("Joao", 02);
		id.put("Pedro", 03);
		
		System.out.println(id);
		System.out.println(id.get("Lucas"));
		System.out.println(id.containsKey("Pedro"));
		System.out.println(id.containsValue(03));
		id.put("Jhon", 83);
		id.replace("Lucas",67);
		System.out.println(id);
	}

}
