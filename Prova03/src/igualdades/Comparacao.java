package igualdades;

public class Comparacao {
	public static void main(String[] args) {
		
		String nome1 = "Lucas";
		String nome2 = "Lucas";
		String nome3 = new String("Lucas");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		System.out.println(nome2.equals(nome3));
		
	}
}
