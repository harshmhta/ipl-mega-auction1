package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Auctionhandeling.Get_players;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Playerhome extends JFrame
{
    private static JPanel contentPane;
    String Email;
   public Playerhome(String Email)
   {
    this.Email=Email;

   }


	static TeamHomepage frame = new TeamHomepage();
	public void Player_home() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
		
		frame.setVisible(true);
		frame.setTitle("player homepage");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 924, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Myprofile");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
            {
                dispose_frame();
                Get_players.getmyprofile(Email);
			}
		});
		btnNewButton.setBounds(106, 401, 220, 38);
		contentPane.add(btnNewButton);
		
		JButton btnEnterAuction = new JButton("See Auction");
		btnEnterAuction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
            {
                Get_players.seeAuction(Email);
			}
		});
		btnEnterAuction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnterAuction.setBackground(Color.ORANGE);
		btnEnterAuction.setBounds(367, 401, 220, 38);
		contentPane.add(btnEnterAuction);
		
		JButton btnMyplayers = new JButton("Logout");
		btnMyplayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnMyplayers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMyplayers.setBackground(Color.ORANGE);
		btnMyplayers.setBounds(626, 401, 220, 38);
		contentPane.add(btnMyplayers);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome player, Best of luck");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(310, 242, 317, 55);
		contentPane.add(lblNewLabel_1);

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TeamHomepage.class.getResource("/assests/admin.png")));
		lblNewLabel.setBounds(10, 10, 900, 536);
		contentPane.add(lblNewLabel);
				
			}
		});
	}

	public static void dispose_frame()
	{
		frame.dispose();
	}

    
}
