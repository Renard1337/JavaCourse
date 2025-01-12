package primeiroprojeto;

import java.util.*;

public class Arraylist2d {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> compraslista = new ArrayList();
		
		
		ArrayList<String> padarialista = new ArrayList();
		
		padarialista.add("Pão");
		padarialista.add("Presunto");
		padarialista.add("Mussarela");
		
		ArrayList<String> quitandalista = new ArrayList();
		
		quitandalista.add("Tomate");
		quitandalista.add("Alface");
		quitandalista.add("Cenoura");
		
		ArrayList<String> bebidaslista = new ArrayList();
		
		//bebidaslista.add("Coca");
		bebidaslista.add("Leite");
		bebidaslista.add("Suco");
		
		compraslista.add(padarialista);
		compraslista.add(quitandalista);
		compraslista.add(bebidaslista);
		
		System.out.println(compraslista.get(2).get(0));
		
		
		
		
	}

}
