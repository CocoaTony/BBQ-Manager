package project;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		ImageIcon image = new ImageIcon("icon.png");
		frame.setIconImage(image.getImage());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton Button1 = new JButton("จองโต๊ะ");
		Button1.setBackground(Color.WHITE);
		Button1.setForeground(Color.BLACK);
		Button1.setFont(new Font("RSU", Font.PLAIN, 99));
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Button1) {
					frame.dispose();
					UITable Table = new UITable();
					Table.frame.setVisible(true);
					
				}
			}
		});
		Button1.setBounds(792, 428, 350, 129);
		panel.add(Button1);
		
		JButton Button2 = new JButton("ออเดอร์");
		Button2.setForeground(Color.BLACK);
		Button2.setFont(new Font("RSU", Font.PLAIN, 99));
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Button2) {
					frame.dispose();
					UIOrder OrdermenuFrame = new UIOrder();
					OrdermenuFrame.frame.setVisible(true);
				}
			}
		});
		Button2.setBackground(Color.WHITE);
		Button2.setBounds(792, 598, 350, 129);
		panel.add(Button2);
		
		JButton Button3 = new JButton("เช็คบิล");
		Button3.setForeground(Color.BLACK);
		Button3.setFont(new Font("RSU", Font.PLAIN, 99));
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Button3) {
					frame.dispose();
					UICheckbill CheckBill = new UICheckbill();
					CheckBill.frame.setVisible(true);
				}
			}
		});
		Button3.setBackground(Color.WHITE);
		Button3.setBounds(792, 253, 350, 129);
		panel.add(Button3);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon MainPic = new ImageIcon("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\src\\project\\Pog.jpg");
		lblNewLabel.setIcon(new ImageIcon(MainPic.getImage().getScaledInstance(709, 811, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 709, 811);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("RSU", Font.BOLD | Font.ITALIC, 79));
		lblNewLabel_1.setBounds(719, 0, 475, 259);
		panel.add(lblNewLabel_1);
	}
}
