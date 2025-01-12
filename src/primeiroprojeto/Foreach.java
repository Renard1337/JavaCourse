package primeiroprojeto;

import java.util.ArrayList;


public class Foreach {
	
	public static void main(String[] args) {
		
		//String[] animais = {"gato", "cachorro", "calopsita", "hamster"};
		
		
		ArrayList<String> animais = new ArrayList<String>();
		
		
		animais.add("gato");
		animais.add("cachorro");
		animais.add("calopsita");
		animais.add("hamster");
		
		
		for(String i : animais) {
			
			System.out.println(i);
			
		}
		
	}

}
