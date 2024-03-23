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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Adminhomepage extends JFrame {

	private static JPanel contentPane;
	static Adminhomepage frame = new Adminhomepage();
					
	public static void Admin_home()
	 {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					
					frame.setVisible(true);
					frame.setTitle("Homepage");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(100, 100, 887, 570);
					contentPane = new JPanel();
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					frame.setContentPane(contentPane);
					contentPane.setLayout(null);

					JButton btnNewButton = new JButton("RegisterTeam ");
					btnNewButton.setForeground(Color.WHITE);
					btnNewButton.setBackground(Color.ORANGE);
					btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							dispose_frame();
							Registerteam.RegisterTeam();
						}
					});
					
					btnNewButton.setBounds(309, 352, 194, 53);
					contentPane.add(btnNewButton);
					
					JButton btnStartauction = new JButton("StartAuction");
					btnStartauction.setForeground(Color.WHITE);
					btnStartauction.setBackground(Color.ORANGE);
					btnStartauction.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							Get_players.get_same_admin();
						}
					});
					btnStartauction.setFont(new Font("Tahoma", Font.BOLD, 20));
					btnStartauction.setBounds(513, 352, 220, 53);
					contentPane.add(btnStartauction);
					
					JButton btnPlayers = new JButton("Players");
					btnPlayers.setForeground(Color.WHITE);
					btnPlayers.setBackground(Color.ORANGE);
					btnPlayers.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose_frame();
							Get_players.get_one();
						}
					});
					btnPlayers.setFont(new Font("Tahoma", Font.BOLD, 20));
					btnPlayers.setBounds(112, 352, 187, 53);
					contentPane.add(btnPlayers);
					
					JLabel lblNewLabel_1 = new JLabel("Welcome Admin, Have a good day ");
					lblNewLabel_1.setBackground(Color.GREEN);
					lblNewLabel_1.setForeground(Color.WHITE);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
					lblNewLabel_1.setBounds(259, 274, 419, 40);
					contentPane.add(lblNewLabel_1);
					
					JButton btnLogout = new JButton("Logout");
					btnLogout.setForeground(Color.WHITE);
					btnLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
					btnLogout.setBackground(Color.ORANGE);
					btnLogout.setBounds(295, 422, 220, 40);
					contentPane.add(btnLogout);
					btnLogout.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							playerlist.dispose_frame();
							Registerteam.dispose_frame();
							dispose_frame();
							popup.popup_close();
							TeamHomepage.dispose_frame();
							Biddingpopup.dispose_frame();
							AuctionDisplayteam.dispose_frame();
							AuctionDisplay.dispose_frame();
							Signup.dispose_frame();
							Login.login();
						
						}
					});

					
					JLabel lblNewLabel = new JLabel("");
					lblNewLabel.setIcon(new ImageIcon(Adminhomepage.class.getResource("/assests/admin.png")));
					lblNewLabel.setBounds(0, 0, 873, 533);
					contentPane.add(lblNewLabel);
			}
		});
	}
	public static void dispose_frame()
	{
		frame.dispose();
	}
}
