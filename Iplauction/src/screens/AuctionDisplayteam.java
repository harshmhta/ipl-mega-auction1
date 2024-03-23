package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Auctionhandeling.Team_player_handeling;
import Auctionhandeling.unsoldplayerhnadeling;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
public class AuctionDisplayteam extends JFrame {
	static JLabel jLabel = new JLabel();
	static AuctionDisplay frame = new AuctionDisplay();
	static ArrayList<String> list = new ArrayList<String>();
	private static JPanel contentPane;
	static String Team_id = "";
	static String initial_amount ="";
	static String final_amount = "";

	public static  void enter_auction(ArrayList<String> arr, String amount) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Timer timer = new Timer();
				
		list = arr;
		final_amount=amount;
		frame.setVisible(true);
		frame.setTitle("Auction Screen ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 782, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Bid");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
                Biddingpopup.Bid(Team_id); 
			}
		});
		btnNewButton.setBounds(630, 507, 115, 33);
		contentPane.add(btnNewButton);
		
		JButton homeButton = new JButton("Home ");
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		homeButton.setBackground(Color.BLUE);
		homeButton.setBounds(20, 25, 140, 34);
		contentPane.add(homeButton);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dispose_frame();
				timer.cancel();
				Myplayers.backhome();

			}
		});
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(297, 263, 81, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAge.setBounds(295, 295, 155, 42);
		contentPane.add(lblAge);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCountry.setBounds(297, 329, 97, 42);
		contentPane.add(lblCountry);
		
		JLabel lblSpecializatin = new JLabel("Specializatin:");
		lblSpecializatin.setForeground(Color.WHITE);
		lblSpecializatin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSpecializatin.setBounds(33, 353, 155, 42);
		contentPane.add(lblSpecializatin);
		
		JLabel lblBatting = new JLabel("Batting:");
		lblBatting.setForeground(Color.WHITE);
		lblBatting.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBatting.setBounds(33, 382, 155, 42);
		contentPane.add(lblBatting);
		
		JLabel lblBownling = new JLabel("Bowling:");
		lblBownling.setForeground(Color.WHITE);
		lblBownling.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBownling.setBounds(33, 421, 155, 42);
		contentPane.add(lblBownling);
		
		JLabel lblCua = new JLabel("Matches played:");
		lblCua.setForeground(Color.WHITE);
		lblCua.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua.setBounds(515, 382, 155, 42);
		contentPane.add(lblCua);
		
		JLabel lblBaseprice = new JLabel("Baseprice:");
		lblBaseprice.setForeground(Color.WHITE);
		lblBaseprice.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBaseprice.setBounds(515, 421, 155, 42);
		contentPane.add(lblBaseprice);
		
		JLabel lblCua_1 = new JLabel("C/U/A:");
		lblCua_1.setForeground(Color.WHITE);
		lblCua_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_1.setBounds(515, 353, 155, 42);
		contentPane.add(lblCua_1);
		
		JLabel lblNewLabel_1 = new JLabel(arr.get(0).toString());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(370, 271, 242, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCua_2 = new JLabel(arr.get(1).toString());
		lblCua_2.setForeground(Color.WHITE);
		lblCua_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2.setBounds(370, 295, 155, 42);
		contentPane.add(lblCua_2);
		
		JLabel lblCua_2_1 = new JLabel(arr.get(2).toString());
		lblCua_2_1.setForeground(Color.WHITE);
		lblCua_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1.setBounds(380, 329, 155, 42);
		contentPane.add(lblCua_2_1);
		
		JLabel lblCua_2_1_1 = new JLabel(arr.get(3).toString());
		lblCua_2_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1.setBounds(154, 353, 155, 42);
		contentPane.add(lblCua_2_1_1);
		
		JLabel lblCua_2_1_1_1 = new JLabel(arr.get(4).toString());
		lblCua_2_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1.setBounds(154, 382, 155, 42);
		contentPane.add(lblCua_2_1_1_1);
		
		JLabel lblCua_2_1_1_1_1 = new JLabel(arr.get(5).toString());
		lblCua_2_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1.setBounds(135, 421, 280, 42);
		contentPane.add(lblCua_2_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1 = new JLabel(arr.get(7).toString());
		lblCua_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1.setBounds(667, 382, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1_1 = new JLabel(final_amount);
		lblCua_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1.setBounds(641, 421, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1);		
		
		JLabel lblCua_2_1_1_1_1_1_1_1 = new JLabel(arr.get(6).toString());
		lblCua_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1_1.setBounds(590, 353, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1_1);
		
		JLabel timJLabel = new JLabel();
		timJLabel.setForeground(Color.WHITE);
		timJLabel.setBounds(550, 20, 200, 50);
		timJLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(timJLabel);
		timJLabel.setVisible(true);
 
		 
		 timer.scheduleAtFixedRate(new TimerTask() 
		 {
			 int i = 20;
			 public void run() {
				 timJLabel.setText("Time left: " + i);
				 i--;
				 if (i < 0) {
					 timer.cancel();

					 timJLabel.setText("Time Over");
					 try {
						 
						 Thread.sleep(3000);   
					   }
					   catch (InterruptedException ex)
					   {
						   ex.printStackTrace();
					   }

					   if(!final_amount.equals(initial_amount))
					   {
						 Team_player_handeling.addplayer(list);
						 popup.popup_sreen("Congrats,You got the player");
					   }
					   else 
					   {
						 //player remained unsold 
						 popup.popup_sreen("Player Remained Unsold");
						 timJLabel.setText("Player Reamined unsold");
						 unsoldplayerhnadeling.add_unsold(arr);
					   }
					   
						 
				 }
			 }
		 }, 0, 1000);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AuctionDisplay.class.getResource("/assests/images.png")));
		lblNewLabel_2.setBounds(10, 10, 758, 545);
		contentPane.add(lblNewLabel_2);
			}	
		});
	}

		
		public static void dispose_frame()
	{
		frame.dispose();
	}	 
	 public static void set_entering_team_id(String Id)
	 {
		Team_id = Id;

	 }
	 public static void set_initialamount(String amount)
	 {
		initial_amount = amount;
	 }

	 public static void refresh(String amount)
	{
		if(amount.equals(initial_amount))
		{
			popup.popup_sreen("Enter a valid amount");
		}
		else 
		{
		frame.dispose();
		enter_auction(list,amount);
		}
		
	}
	 
	
}
