package primeiroprojeto;

import java.util.Scanner;



public class Operadoreslogicos2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pressione q ou Q para quitar do jogo:");
		
		String resposta = scan.next();
		
		//if(resposta.equals("q") || resposta.equals("Q")) {
			
			//System.out.println("Você quitou do jogo");
			
		//}
		
		//else {
			
			//System.out.println("Você ainda está jogando o jogo *tec tec*");
			
		//}O seguinte tem o mesmo efeito porém usando o !(NOT)
		
		
		if(!resposta.equals("q") && !resposta.equals("Q")) {
			
			System.out.println("Você ainda está jogando o jogo *tec tec*");
			
		}
		
		else {
			
			System.out.println("Você quitou do jogo");
			
		}
			
		
		scan.close();
		
	}

}
