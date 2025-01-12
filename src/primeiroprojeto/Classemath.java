package primeiroprojeto;

import java.util.*;

public class Classemath {
	
	public static void main(String[] args) {
		
		//double x = 3.14;
		//double y = -10;
		
		//double z = Math.min(x, y);//Math.min() compara os dois valores e atribui o menor a variável Z
		
		//System.out.println(z);
		
		double x;
		double y;
		double z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado X:");
		x= scan.nextDouble();
		System.out.println("Digite o lado Y:");
		y= scan.nextDouble();
		
		z = Math.sqrt( (x*x) + (y*y) );
		
		System.out.println("A hipotenusa é: "+z);
		
		scan.close();
		
		
		
	}

}
