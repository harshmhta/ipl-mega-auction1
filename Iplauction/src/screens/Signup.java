package screens;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import databasehandling.*;

public class Signup extends JFrame {

	private static JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JPasswordField passwordField;

	static Signup frame = new Signup();
	public static void Register() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
		frame.setVisible(true);
		frame.setTitle("PLayers Registration");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 809, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton homeButton = new JButton("Login");
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		homeButton.setBackground(Color.BLUE);
		homeButton.setBounds(20, 25, 140, 34);
		contentPane.add(homeButton);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dispose_frame();
				Login.login();
			}
		});


		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 171, 90, 48);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(156, 180, 242, 37);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Age:");

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(156, 227, 242, 37);
		contentPane.add(textField_1);

		

		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 218, 90, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Country:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(10, 265, 90, 48);
		contentPane.add(lblNewLabel_1_1_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(156, 274, 242, 37);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Matches played:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(10, 321, 151, 48);
		contentPane.add(lblNewLabel_1_1_1_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(156, 321, 242, 37);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Specialization:");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2.setBounds(10, 363, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(156, 363, 242, 37);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Batting:");
		lblNewLabel_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1.setBounds(416, 218, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(527, 227, 242, 37);
		contentPane.add(textField_5);
		
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Bowling:");
		lblNewLabel_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1_1.setBounds(416, 171, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(527, 180, 242, 37);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("C/U/A:");
		lblNewLabel_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(416, 274, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(527, 274, 242, 37);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel("Base Price:");
		lblNewLabel_1_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1_1_1_1.setBounds(416, 321, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1_1);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(528, 321, 241, 37);
		contentPane.add(textField_8);

		JLabel lblNewLabel_1_2 = new JLabel("Email:");
		lblNewLabel_1_2.setBackground(Color.GRAY);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 122, 90, 48);
		contentPane.add(lblNewLabel_1_2);

		textField_9 = new JTextField();
		textField_9.setBounds(156, 131, 240, 37);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_1_3 = new JLabel("Password:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(416, 122, 112, 48);
		contentPane.add(lblNewLabel_1_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(527, 133, 242, 37);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(381, 435, 160, 37);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() 
		{														 //button action
			public void actionPerformed(ActionEvent e) 
			{
				//textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7,textField_8,textField_9;
				ArrayList<String> list = new ArrayList<String>();
				String pass = new String(passwordField.getPassword());


							if(textField_9.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_9, "ENTER YOUR Email");
							return;
						}
						if(pass.isEmpty()) {
							JOptionPane.showMessageDialog(passwordField, "ENTER YOUR PASSWORD");
							return;
						}
						

							if(textField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField, "ENTER YOUR NAME");
							return;
						}
						if(textField_2.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_2, "ENTER YOUR COUNTRY");
							return;
						}
					
							if(textField_1.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_1, "ENTER YOUR AGE");
							return;
						}
						if(textField_3.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_3, "ENTER THE MATCHES PLAYED");
							return;
						}
						if(textField_4.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_4, "ENTER THE SPECIALIZATION");
							return;
						}
						if(textField_5.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_5, "ENTER BATTING");
							return;
						}
						if(textField_6.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_6, "ENTER  BOWLING");
							return;
						}
						if(textField_7.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_7, "ENTER C/U/A");
							return;
						}
						if(textField_8.getText().isEmpty()) {
							JOptionPane.showMessageDialog(textField_7, "ENTER BASE PRICE");
							return;
						}
				list.add(textField_9.getText()); //email
				list.add(pass); //password
				list.add(textField.getText()); //Name
				list.add(textField_1.getText()); //age
				list.add(textField_2.getText()); //country 
				list.add(textField_3.getText()); //Matches played
				list.add(textField_4.getText());//Specialization
				list.add(textField_5.getText()); //Batting 
				list.add(textField_6.getText()); //Bowling 
				list.add(textField_7.getText()); //C/U/A
				list.add(textField_8.getText()); //Base price
				userRegister.addplalyer(list);
			}
		});
			


		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/assests/studiu.png")));
		lblNewLabel.setBounds(0, 25, 795, 485);
		contentPane.add(lblNewLabel);
		

		
		}});
	}

	public static void dispose_frame()
	{
		frame.dispose();
	}
	

	
}
