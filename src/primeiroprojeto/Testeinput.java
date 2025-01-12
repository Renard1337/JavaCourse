package primeiroprojeto;

import java.util.Scanner;

public class Testeinput {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scan.nextLine();
		System.out.println("Qual sua idade?");
		int idade = scan.nextInt();
		scan.nextLine();
		System.out.println("Qual sua comida favorita?");
		String comida= scan.nextLine();
		
		System.out.println("Olá " +nome);
		System.out.println("Você tem " +idade+" anos de idade");
		System.out.println("Você gosta de" + comida);
		
		scan.close();
		
	}

}
