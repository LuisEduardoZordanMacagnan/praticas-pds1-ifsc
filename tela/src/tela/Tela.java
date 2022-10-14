package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextPane tpTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> cbOpcoes = new JComboBox<>();
		cbOpcoes.setBounds(83, 40, 192, 22);
		String[] vetorPlanetas = {"Mercurio", "Venus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno"};
		for (int i = 0; i < vetorPlanetas.length; i++) {
			cbOpcoes.addItem(vetorPlanetas[i]);
		}
		contentPane.add(cbOpcoes);
		
		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(26, 44, 63, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 414, 167);
		contentPane.add(scrollPane);
		
		
		JTextPane tpTexto = new JTextPane();
		scrollPane.setViewportView(tpTexto);
		
		JButton btnAdicionar = new JButton("ADICIONAR:");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpTexto.setText(tpTexto.getText()+cbOpcoes.getSelectedItem()+", ");
			}
		});
		btnAdicionar.setBounds(297, 40, 100, 23);
		contentPane.add(btnAdicionar);
	}
}
