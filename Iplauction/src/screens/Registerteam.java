package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import databasehandling.userdata;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Registerteam extends JFrame {

	private static JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JPasswordField passwordField;
	static Registerteam frame = new Registerteam();
	
	 public static void RegisterTeam() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
		
		frame.setVisible(true);
		frame.setTitle("RegisterTeam");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 878, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton homeButton = new JButton("Home");
					homeButton.setForeground(Color.WHITE);
					homeButton.setFont(new Font("Tahoma", Font.BOLD, 17));
					homeButton.setBackground(Color.BLACK);
					homeButton.setBounds(20, 25, 140, 34);
					contentPane.add(homeButton);
					homeButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							dispose_frame();
							Adminhomepage.Admin_home();
						}
					});

		JLabel lblNewLabel = new JLabel("TeamName:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 160, 131, 27);
		contentPane.add(lblNewLabel);

		
		textField = new JTextField();
		textField.setBounds(174, 157, 248, 40);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblManagername = new JLabel("ManagerName:");
		lblManagername.setForeground(Color.WHITE);
		lblManagername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblManagername.setBounds(10, 210, 150, 27);
		contentPane.add(lblManagername);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 207, 248, 40);
		contentPane.add(textField_1);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(460, 160, 131, 27);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(566, 157, 248, 40);
		contentPane.add(textField_2);

		JLabel lblTeamid = new JLabel("TeamID:");
		lblTeamid.setForeground(Color.WHITE);
		lblTeamid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeamid.setBounds(10, 260, 131, 27);
		contentPane.add(lblTeamid);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 257, 248, 40);
		contentPane.add(textField_3);

		JLabel lblAvaliabeAmount = new JLabel("AvaliabeAmount:");
		lblAvaliabeAmount.setForeground(Color.WHITE);
		lblAvaliabeAmount.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAvaliabeAmount.setBounds(10, 310, 168, 27);
		contentPane.add(lblAvaliabeAmount);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 307, 248, 40);
		contentPane.add(textField_4);
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(460, 210, 131, 27);
		contentPane.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(566, 207, 248, 40);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("AddTeam");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(374, 424, 217, 40);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> list = new ArrayList<String>();
				String pass = new String(passwordField.getPassword());

				if(pass.isEmpty()) {
					JOptionPane.showMessageDialog(passwordField, "ENTER YOUR PASSWORD");
					return;
				}
				
					if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(textField, "ENTER TEAM NAME");
					return;
				}
				if(textField_2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(textField_2, "ENTER  EMAIL");
					return;
				}
			
					if(textField_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(textField_1, "ENTER TEAM MANAGER NAME");
					return;
				}
				if(textField_3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(textField_3, "ENTER THE TEAM ID");
					return;
				}
				if(textField_4.getText().isEmpty()) {
					JOptionPane.showMessageDialog(textField_4, "ENTER THE AVALIABLE AMOUNT");
					return;
				}

				list.add(textField_2.getText());//email
				list.add(pass); //password 
				list.add(textField.getText()); //team name 
				list.add(textField_1.getText()); //team manager name
				list.add(textField_3.getText());//teamid
				list.add(textField_4.getText()); //avaliable amount 
				userdata.addTeam(list);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Registerteam.class.getResource("/assests/studiu.png")));
		lblNewLabel_1.setBounds(0, 10, 864, 538);
		contentPane.add(lblNewLabel_1);
			}
		});
	}

	public static void dispose_frame()
	{
		frame.dispose();
	}


}
