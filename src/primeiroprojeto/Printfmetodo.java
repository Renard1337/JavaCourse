package primeiroprojeto;

public class Printfmetodo {
	
	public static void main(String[] args) {
		
		boolean a = true;
		char b = '#';
		int c = 123;
		double d = 123.456;
		String e = "Renard";
		
		
		System.out.printf("O valor da variável é: %b\n", a );//%b para boolean
		System.out.printf("O valor da variável é: %c\n", b );//%c para char
		System.out.printf("O valor da variável é: %d\n", c );//%d para int
		System.out.printf("O valor da variável é: %.3f\n", d );//%f para float e double, o %.(numero)f limita as casas decimais
		System.out.printf("O valor da variável é: %s\n", e );//%s para string
		
		
		
	}
	
	
	

}
