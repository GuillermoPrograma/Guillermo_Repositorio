package CalculadoraGuillermo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class CalculadoraGuillermoGarcia {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGuillermoGarcia window = new CalculadoraGuillermoGarcia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraGuillermoGarcia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel TextField = new JLabel("Calculadora");
		TextField.setBounds(93, 0, 242, 28);
		TextField.setFont(new Font("SimSun", Font.BOLD, 24));
		TextField.setForeground(Color.BLUE);
		TextField.setHorizontalAlignment(SwingConstants.CENTER);
		TextField.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblNewLabel = new JLabel("Número1:");
		lblNewLabel.setBounds(126, 58, 67, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		
		JLabel lblNewLabel_1 = new JLabel("Número2:");
		lblNewLabel_1.setBounds(129, 104, 58, 18);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 102, 86, 20);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(199, 69, 86, 20);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(TextField);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(93, 146, 111, 23);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(210, 146, 111, 23);
		btnNewButton_1.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBounds(93, 175, 111, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("/");
		btnNewButton_2_1.setBounds(210, 175, 111, 23);
		btnNewButton_2_1.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(126, 216, 61, 18);
		lblNewLabel_2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 216, 86, 20);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 33, 414, 217);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
	}
}
