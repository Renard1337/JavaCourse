package primeiroprojeto;

public class Metodos2 {
	
	public static void main(String[] args) {
		
		int x = 7;
		int y = 8;
		
		//int z = add(x,y); //podemos declarar duas vezes a varíavel "z", pois ela é uma variável local, ou seja, só é contada
						  //dentro do método main, e no outro método é separado.
		
		//System.out.println(z);
		
		System.out.println(add(x,y));//podemos encurtar o código dessa maneira tbm
		
		
	}
	
	
	static int add(int x, int y) {
		
		//int z = x + y;
		
		//return z;
		
		return x+y;//parte da encurtação, tem o mesmo efeito do código acima q está marcado como comentário
		
	}

}
