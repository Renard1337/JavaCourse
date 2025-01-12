package primeiroprojeto;

public class Metodooverload {
	
	
	public static void main(String[] args) {
		
		//métodos overloaded são métodos que compartilham o mesmo nome, mas tem parâmetros diferentes.
		// (nome do método) + parâmetros = assinatura do método
		
		
		double x = adicionar(1.5,2.5,3.5,4.5);
		
		System.out.println(x);
		
	}
	
	
	static int adicionar(int x, int y) {
		
		System.out.println("Essse é o método overload #1");
		
		return x + y;
		
		
	}
	
	static int adicionar(int x, int y, int z) {
		
		System.out.println("Essse é o método overload #2");
		
		return x+y+z;
		
		
	}
	
	static int adicionar(int x, int y, int z, int k) {
		
		System.out.println("Essse é o método overload #3");
		
		return x+y+z+k;
		
		
	}
	
	static double adicionar(double x, double y) {
		
		System.out.println("Essse é o método overload #4");
		
		return x + y;
		
		
	}
	
	static double adicionar(double x, double y, double z) {
		
		System.out.println("Essse é o método overload #5");
		
		return x+y+z;
		
		
	}
	
	static double adicionar(double x, double y, double z, double k) {
		
		System.out.println("Essse é o método overload #6");
		
		return x+y+z+k;
		
		
	}
	

}
