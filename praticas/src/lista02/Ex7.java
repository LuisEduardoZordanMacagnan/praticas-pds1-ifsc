package lista02;

import javax.swing.JOptionPane;

public class Ex7 {
	
	static Double MF (Double n1, Double n2, Double n3) {
		return (n1+n2+n3)/3;
	}

	public static void main(String[] args) {
		String ex = JOptionPane.showInputDialog("Digite a 1° nota");
		while(ex.isEmpty()) {
			ex = JOptionPane.showInputDialog("Incorreto, digite a 1° nota");
		}
		Double n1 = Double.valueOf(ex);
		ex = JOptionPane.showInputDialog("Digite a 2° nota");
		while(ex.isEmpty()) {
			ex = JOptionPane.showInputDialog("Incorreto, digite a 2° nota");
		}
		Double n2 = Double.valueOf(ex);
		ex = JOptionPane.showInputDialog("Digite a 3° nota");
		while(ex.isEmpty()) {
			ex = JOptionPane.showInputDialog("Incorreto, digite a 3° nota");
		}
		Double n3 = Double.valueOf(ex);
		Double media = Ex7.MF(n1, n2, n3);
		if(media>6) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		}else {
			if(media>4) {
				JOptionPane.showMessageDialog(null, "Recuperação!");
			}else {
				JOptionPane.showMessageDialog(null, "Reprovado!");
			}
		}
	}

}
