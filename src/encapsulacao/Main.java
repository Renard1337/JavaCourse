package encapsulacao;

public class Main {
	
	public static void main(String[] args) {
		
		
		Carro carro = new Carro("FIAT","UNO",2016);
		
		carro.setAno(2022);
		carro.setModelo("Siena");
		
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getAno());
		
		
		
	}
	
	
	
	
	
}
