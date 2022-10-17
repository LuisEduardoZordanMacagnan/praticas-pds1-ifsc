package pratica02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * @author LuísEduardo
 * @data 17/10/2022
 */
public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JButton mais;
	private JButton menos;
	private JButton vezes;
	private JButton divisao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(10, 26, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setText("");
		t2.setBounds(10, 62, 86, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		mais = new JButton("+");
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = t1.getText(), n2=t2.getText();
				t1.setText(n1);
				t2.setText(n2);
				if(n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Texto vazio");
				}else {
					Double num1= Double.valueOf(n1);
					Double num2= Double.valueOf(n2);
					JOptionPane.showMessageDialog(mais, (num1+num2));
				}
			}
		});
		mais.setBounds(10, 108, 86, 44);
		contentPane.add(mais);
		
		menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = t1.getText(), n2=t2.getText();
				t1.setText(n1);
				t2.setText(n2);
				if(n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Texto vazio");
				}else {
					Double num1= Double.valueOf(n1);
					Double num2= Double.valueOf(n2);
					JOptionPane.showMessageDialog(menos, (num1-num2));
				}
			}
		});
		menos.setBounds(106, 108, 86, 44);
		contentPane.add(menos);
		
		vezes = new JButton("x");
		vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = t1.getText(), n2=t2.getText();
				t1.setText(n1);
				t2.setText(n2);
				if(n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Texto vazio");
				}else {
					Double num1= Double.valueOf(n1);
					Double num2= Double.valueOf(n2);
					JOptionPane.showMessageDialog(vezes, (num1*num2));
				}
			}
		});
		vezes.setBounds(202, 108, 86, 44);
		contentPane.add(vezes);
		
		divisao = new JButton("%");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = t1.getText(), n2=t2.getText();
				t1.setText(n1);
				t2.setText(n2);
				if(n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Texto vazio");
				}else {
					Double num1= Double.valueOf(n1);
					Double num2= Double.valueOf(n2);
					JOptionPane.showMessageDialog(divisao, (num1/num2));
				}
			}
		});
		divisao.setBounds(298, 108, 86, 44);
		contentPane.add(divisao);
		
	}
}
