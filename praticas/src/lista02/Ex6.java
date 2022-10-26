package lista02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lista.add(JOptionPane.showInputDialog("Digite a " + (i + 1) + "° palavra:"));
		}
		JOptionPane.showMessageDialog(null, lista);
	}

}
