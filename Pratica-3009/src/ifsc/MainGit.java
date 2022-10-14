package ifsc;

import javax.swing.JOptionPane;

/**
 * 
 * @author LuísEduardoZordanMacagnan
 * @date 30/09/2022
 * @version 1.0
 *
 */
public class MainGit {

	public static void main(String[] args) {
		Double[] vetor = new Double[5];
		for (int i = 0; i < vetor.length; i++) {
			String teste = JOptionPane.showInputDialog("Insira o "+(i+1)+"° número");
			if(teste.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Valor vazio");
				i--;
			}else {
				vetor[i]=Double.valueOf(teste);
			}
		}
	}
	/**
	 * 
	 * Pega um vetor e multiplica todos os seus elementos e retorna o novo vetor
	 * 
	 * @param vetor
	 * @return vetor
	 */
	public Double[] multiplicaVetor(Double[] vetor) {
		Double[] novoVetor = new Double[vetor.length];
		for (int i = 0; i < novoVetor.length; i++) {
			novoVetor[i]=vetor[i]*vetor[i];
		}
		return novoVetor;
	}

}
