package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Auctionhandeling.Get_players;
import Auctionhandeling.Team_player_handeling;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TeamHomepage extends JFrame {

	private static JPanel contentPane;
	static String ID=" ";

	static TeamHomepage frame = new TeamHomepage();
	public static void Team_home() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
		frame.setVisible(true);
		frame.setTitle("TeamHomepage");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 924, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//team manager will enter the auction after clicking this button.
		JButton enter_auction = new JButton("Enter Auction");
		enter_auction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				AuctionDisplayteam.set_entering_team_id(ID);
				Get_players.get_same_team("abc");
			}
		});
		enter_auction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		enter_auction.setBackground(Color.ORANGE);
		enter_auction.setBounds(367, 401, 220, 38);
		contentPane.add(enter_auction);
		
		//Team manager will see the players of his team after clicking this button.
		JButton my_players = new JButton("My_Players");
		my_players.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
			{
				dispose_frame();
				Team_player_handeling.getplayer();
			}
		});
		my_players.setFont(new Font("Tahoma", Font.PLAIN, 20));
		my_players.setBackground(Color.ORANGE);
		my_players.setBounds(626, 401, 220, 38);
		contentPane.add(my_players);
		
		//This will be displayed on the team manager's home page
		JLabel new_label_1 = new JLabel("Welcome "+ ID +", All the best!");
		new_label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		new_label_1.setForeground(Color.WHITE);
		new_label_1.setBackground(Color.WHITE);
		new_label_1.setBounds(310, 242, 317, 55);
		contentPane.add(new_label_1);

		//team manager will logout after clicking this button.
		JButton logout_button = new JButton("Logout");
					logout_button.setForeground(Color.BLACK);
					logout_button.setFont(new Font("Tahoma", Font.BOLD, 20));
					logout_button.setBackground(Color.ORANGE);
					logout_button.setBounds(106, 401, 220, 38);
					contentPane.add(logout_button);
					logout_button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							playerlist.dispose_frame();
							Registerteam.dispose_frame();
							Adminhomepage.dispose_frame();
							popup.popup_close();
							dispose_frame();
							Biddingpopup.dispose_frame();
							AuctionDisplayteam.dispose_frame();
							Signup.dispose_frame();
							Login.login();
						
						}
					});
		
					//background image for the team manager's home page.
		JLabel image_label = new JLabel("");
		image_label.setIcon(new ImageIcon(TeamHomepage.class.getResource("/assests/admin.png")));
		image_label.setBounds(10, 10, 900, 536);
		contentPane.add(image_label);
				
			}
		});
	}

	public static void dispose_frame()
	{
		frame.dispose();
	}
	public static void set_teamid( String id)
	{
		ID=id;
		
	}
	
}
