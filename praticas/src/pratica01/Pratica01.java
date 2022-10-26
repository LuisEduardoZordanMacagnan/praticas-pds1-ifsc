package pratica01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * @author LuísEduardo
 * @data 17/10/2022
 */
public class Pratica01 extends JFrame {

	private JPanel contentPane;
	private JTextField n1;
	private JTextField n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pratica01 frame = new Pratica01();
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
	public Pratica01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		n1 = new JTextField();
		n1.setBounds(122, 33, 86, 20);
		contentPane.add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setBounds(122, 64, 86, 20);
		contentPane.add(n2);
		n2.setColumns(10);
		
		JButton butao = new JButton("Somar");
		butao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				if(num1.isEmpty() || num2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Erro! Caixa em branco");
				}else {
					Double v1 = Double.valueOf(num1);
					Double v2 = Double.valueOf(num2);
					JOptionPane.showMessageDialog(butao, (v1+v2));
				}
			}
		});
		butao.setBounds(119, 137, 89, 23);
		contentPane.add(butao);
		
		JLabel lblNewLabel = new JLabel("Número 1:");
		lblNewLabel.setBounds(55, 36, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 2:");
		lblNewLabel_1.setBounds(55, 67, 68, 14);
		contentPane.add(lblNewLabel_1);
	}
}
