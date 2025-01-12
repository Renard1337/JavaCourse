package primeiroprojeto;

public class Switches {
	
	public static void main(String[] args) {
		
		String dia = "Lanchinho";
		
		switch(dia) {
		
			case "Domingo": System.out.println("Hoje é domingo!");
			break;
			case "Segunda": System.out.println("Hoje é segunda!");
			break;
			case "Terça": System.out.println("Hoje é Terça!");
			break;
			case "Quarta": System.out.println("Hoje é Quarta!");
			break;
			case "Quinta": System.out.println("Hoje é quinta!");
			break;
			case "Sexta": System.out.println("Hoje é sexta!");
			break;
			case "Sabado": System.out.println("Hoje é sabado!");
			break;
			default: System.out.println("Isso não é um dia da semana.");
		
		}

		
	}
	
}
