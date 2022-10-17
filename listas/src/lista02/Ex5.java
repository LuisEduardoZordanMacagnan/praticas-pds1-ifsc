package lista02;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		Integer num[] = new Integer[10];
		String ex;
		Integer maior=Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			ex = JOptionPane.showInputDialog("Insira "+(i+1)+"° número: ");
			while(ex.isEmpty()) {
				ex = JOptionPane.showInputDialog("Incorreto, insira "+(i+1)+"° número: ");
			}
			num[i] = Integer.valueOf(ex);
			if(num[i]>maior) {
				maior=num[i];
			}
			if(num[i]<menor) {
				menor=num[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Maior: "+maior);
		JOptionPane.showMessageDialog(null, "Menor: "+menor);
		
	}

}
