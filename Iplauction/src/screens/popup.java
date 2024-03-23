package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class popup extends JFrame {

	private static JPanel contentPane;

	static JFrame frame = new JFrame();

	public static void popup_sreen(String message) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					
				frame.setVisible(true);
				frame.setTitle("Alert");
				frame.setIconImage(Toolkit.getDefaultToolkit().getImage(popup.class.getResource("/assests/admin.png")));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setBounds(100, 100, 584, 274);
				contentPane = new JPanel();
			    contentPane.setBackground(Color.LIGHT_GRAY);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame.setContentPane(contentPane);
				contentPane.setLayout(null);
		
				JButton btnNewButton = new JButton("OK");
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frame.dispose();
			
			}
			
		});
				btnNewButton.setBounds(211, 160, 127, 33);
				contentPane.add(btnNewButton);
		
				JLabel lblNewLabel = new JLabel(message);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setForeground(Color.BLACK);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel.setBounds(91, 39, 414, 61);
				contentPane.add(lblNewLabel);

			}
		});
	}
	public static void popup_close()
	{
		
		frame.dispose();
	}


}
