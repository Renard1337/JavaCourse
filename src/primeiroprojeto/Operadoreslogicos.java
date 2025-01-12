package primeiroprojeto;

public class Operadoreslogicos {
	
	public static void main(String[] args) {
		
		//operadores lógicos
		// $$ = (AND) ou (E)
		// || = (OR) ou (OU)
		// ! = (NOT) ou (NÃO)
		
		int temp = 25;
		
		if(temp>= 30) {
			
			System.out.println("Está calor lá fora");
			
		}
		
		else if(temp >= 25 && temp <= 29) {
			
			System.out.println("Está quente lá fora");
		}
		
		else if(temp >= 20 && temp <= 24) {
			
			System.out.println("Está fresco lá fora");
		}
		
		else {
			
			System.out.println("Está frio lá fora");
			
		}
		
	}

}
