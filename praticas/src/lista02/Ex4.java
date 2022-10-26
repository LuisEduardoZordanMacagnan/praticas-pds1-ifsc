package lista02;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		String ex;
		Integer num;
		for (int i = 0; i < 10; i++) {
			ex = JOptionPane.showInputDialog("Insira "+(i+1)+"° número: ");
			while(ex.isEmpty()) {
				ex = JOptionPane.showInputDialog("Incorreto, insira "+(i+1)+"° número: ");
			}
			num = Integer.valueOf(ex);
			JOptionPane.showMessageDialog(null, num);
		}
	}

}
