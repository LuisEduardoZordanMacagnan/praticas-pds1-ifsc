package lista02;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Insira nome:");
		while(nome.isEmpty()) {
			nome = JOptionPane.showInputDialog("Incorreto, insira novamente:");
		}
		String ex = JOptionPane.showInputDialog("Insira idade:");
		while(ex.isEmpty()) {
			ex = JOptionPane.showInputDialog("Incorreto, insira novamente:");
		}
		Integer idade = Integer.valueOf(ex);
		JOptionPane.showMessageDialog(null, nome);
		JOptionPane.showMessageDialog(null, idade);
	}

}
