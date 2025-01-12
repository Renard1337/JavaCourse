package primeiroprojeto;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> comida = new ArrayList<String>();
		
		comida.add("Maçã");
		comida.add("Franguinho");
		comida.add("X-burguer");
		
		comida.set(1, "Peixinho");
		comida.remove(0);
		comida.clear();
		
		for(int i = 0; i<comida.size(); i++) {
			
			System.out.println(comida.get(i));
			
		}
		
		
	}

}
