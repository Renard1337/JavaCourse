package primeiroprojeto;

import javax.swing.JOptionPane;


public class JavaGUI {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Escreva seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
		
		JOptionPane.showMessageDialog(null, "Seu nome é: " + nome+".\nVoce tem: "+idade+" anos de idade.\nE: "+altura+" cm de altura.");
		
		
		
			
	}

}
