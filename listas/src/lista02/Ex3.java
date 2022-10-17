package lista02;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		String ex = JOptionPane.showInputDialog("Insira preço de cada litro:");
		while(ex.isEmpty()) {
			ex = JOptionPane.showInputDialog("Incorreto, insira preço de cada litro:");
		}
		Double precoLitro = Double.valueOf(ex);
		ex = JOptionPane.showInputDialog("Insira quantidade de litros:");
		while(ex.isEmpty()) {
			ex = JOptionPane.showInputDialog("Incorreto, insira quantidade de litros:");
		}
		Integer quantidadeLitro = Integer.valueOf(ex);
		JOptionPane.showMessageDialog(null, "O total a ser pago é: R$"+(precoLitro*quantidadeLitro));
	}

}
