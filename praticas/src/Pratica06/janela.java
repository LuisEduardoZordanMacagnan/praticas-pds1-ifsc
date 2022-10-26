package Pratica06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static String texto(JTextArea textArea, JTextField txtNome, JTextField txtCpf, JComboBox<String> cbPronomes) {
		return textArea.getText()+cbPronomes.getSelectedItem()+txtNome.getText()+" cujo CPF é "+txtCpf.getText()+"\n";
	}
	
	/**
	 * Create the frame.
	 */
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pronome:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox<String> cbPronomes = new JComboBox<>();
		cbPronomes.setBounds(66, 7, 240, 22);
		contentPane.add(cbPronomes);
		String[] vetorPronomes = {"Sr. ", "Sra. ", "Lorde do Universo "};
		for (int i = 0; i < vetorPronomes.length; i++) {
			cbPronomes.addItem(vetorPronomes[i]);
		}
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 33, 240, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(66, 58, 240, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 414, 164);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnAdcionar = new JButton("ADCIONAR:");
		btnAdcionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtNome.getText().isEmpty() || !txtCpf.getText().isEmpty()) {
					textArea.setText(texto(textArea, txtNome, txtCpf, cbPronomes));
				}else {
					JOptionPane.showMessageDialog(btnAdcionar, "Valores vazios");
				}
			}
		});
		btnAdcionar.setBounds(316, 7, 108, 32);
		contentPane.add(btnAdcionar);
		
		JButton btnLimpar = new JButton("LIMPAR:");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnLimpar.setBounds(316, 48, 108, 32);
		contentPane.add(btnLimpar);
	}
}
