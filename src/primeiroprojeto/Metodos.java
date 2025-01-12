package primeiroprojeto;

public class Metodos {
	
	public static void main(String[] args) {
		
		//um método é um bloco de código que é executado quando chamado.
		
		String nome = "Renard";
		int idade = 24;
		
		
		
		ola(nome,idade);
		
		
		
	}
	
	static void ola(String nome, int idade) {
		
		System.out.println("Olá "+nome+"!");
		System.out.println("Você tem: "+idade+" anos de idade!");
		
	}
	

}
