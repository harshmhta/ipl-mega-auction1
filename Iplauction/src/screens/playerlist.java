package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Auctionhandeling.Get_players;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;


public class playerlist extends JFrame {


	private static JPanel contentPane;
	static playerlist frame = new playerlist();

	
	public static void player_list(ArrayList<String> arr) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
		
		frame.setVisible(true);;
		frame.setVisible(true);
		frame.setTitle("Player List");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 782, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton homeButton = new JButton("Home ");
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
		
		JButton btnNewButton = new JButton("Next Player");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Get_players.get_one();
			}
		});
		btnNewButton.setBounds(630, 507, 115, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name:"); // 0 is name
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(33, 140, 81, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAge.setBounds(33, 192, 155, 42);
		contentPane.add(lblAge);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCountry.setBounds(33, 244, 97, 42);
		contentPane.add(lblCountry);
		
		JLabel lblSpecializatin = new JLabel("Specializatin:");
		lblSpecializatin.setForeground(Color.WHITE);
		lblSpecializatin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSpecializatin.setBounds(33, 296, 155, 42);
		contentPane.add(lblSpecializatin);
		
		JLabel lblBatting = new JLabel("Batting:");
		lblBatting.setForeground(Color.WHITE);
		lblBatting.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBatting.setBounds(33, 348, 155, 42);
		contentPane.add(lblBatting);
		
		JLabel lblBownling = new JLabel("Bowling:");
		lblBownling.setForeground(Color.WHITE);
		lblBownling.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBownling.setBounds(33, 400, 155, 42);
		contentPane.add(lblBownling);
		
		JLabel lblCua = new JLabel("Matches played:");
		lblCua.setForeground(Color.WHITE);
		lblCua.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua.setBounds(488, 192, 155, 42);
		contentPane.add(lblCua);
		
		JLabel lblBaseprice = new JLabel("Baseprice:");
		lblBaseprice.setForeground(Color.WHITE);
		lblBaseprice.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBaseprice.setBounds(488, 254, 155, 42);
		contentPane.add(lblBaseprice);
		
		JLabel lblCua_1 = new JLabel("C/U/A:");
		lblCua_1.setForeground(Color.WHITE);
		lblCua_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_1.setBounds(488, 140, 155, 42);
		contentPane.add(lblCua_1);
		
		JLabel lblNewLabel_1 = new JLabel(arr.get(0).toString());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(124, 153, 242, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCua_2 = new JLabel(arr.get(1).toString());
		lblCua_2.setForeground(Color.WHITE);
		lblCua_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2.setBounds(134, 192, 155, 42);
		contentPane.add(lblCua_2);
		
		JLabel lblCua_2_1 = new JLabel(arr.get(2).toString());
		lblCua_2_1.setForeground(Color.WHITE);
		lblCua_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1.setBounds(134, 254, 155, 42);
		contentPane.add(lblCua_2_1);
		
		JLabel lblCua_2_1_1 = new JLabel(arr.get(3).toString());
		lblCua_2_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1.setBounds(154, 296, 155, 42);
		contentPane.add(lblCua_2_1_1);
		
		JLabel lblCua_2_1_1_1 = new JLabel(arr.get(4).toString());
		lblCua_2_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1.setBounds(154, 348, 155, 42);
		contentPane.add(lblCua_2_1_1_1);
		
		JLabel lblCua_2_1_1_1_1 = new JLabel(arr.get(5).toString());
		lblCua_2_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1.setBounds(124, 400, 280, 42);
		contentPane.add(lblCua_2_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1 = new JLabel(arr.get(7).toString()); //capped uncaped 
		lblCua_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1.setBounds(641, 192, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1_1 = new JLabel(arr.get(8).toString());  //base price of the player
		lblCua_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1.setBounds(605, 254, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1_1_1 = new JLabel(arr.get(6).toString());
		lblCua_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1_1.setBounds(590, 140, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1_1);
		
		JButton btnDeletePlayer = new JButton("Delete Player");
		btnDeletePlayer.setForeground(Color.WHITE);
		btnDeletePlayer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDeletePlayer.setBackground(Color.RED);
		btnDeletePlayer.setBounds(373, 507, 135, 33);
		contentPane.add(btnDeletePlayer);
		btnDeletePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Get_players.delete_this();
			}
		});


		JButton btnPreviousPlayer = new JButton("Previous Player");
		btnPreviousPlayer.setForeground(Color.WHITE);
		btnPreviousPlayer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPreviousPlayer.setBackground(Color.GREEN);
		btnPreviousPlayer.setBounds(52, 507, 167, 33);
		contentPane.add(btnPreviousPlayer);
		btnPreviousPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				frame.dispose();
				Get_players.get_previous();
			}
			});
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(playerlist.class.getResource("/assests/Auctiondisplay.png")));
		lblNewLabel_2.setBounds(10, -2, 927, 572);
		contentPane.add(lblNewLabel_2);		
				
			}
		});
	}
	public static void dispose_frame()
	{
		frame.dispose();
	}

	
}
