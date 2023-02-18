package project;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
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

	private JFrame frame;

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
		frame.setBounds(100, 100, 720, 1600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		ImageIcon image = new ImageIcon("icon.png");
		frame.setIconImage(image.getImage());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 158, 147));
		panel.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ลูกชิ้นหมูกระทะ\r\n");
		lblNewLabel.setBounds(0, 41, 704, 135);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("RSU", Font.PLAIN, 93));
		panel.add(lblNewLabel);
		
		JButton Button1 = new JButton("จองโต๊ะ");
		Button1.setBackground(Color.WHITE);
		Button1.setForeground(Color.BLACK);
		Button1.setFont(new Font("RSU", Font.PLAIN, 99));
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button1.setBounds(140, 205, 439, 189);
		panel.add(Button1);
		
		JButton Button2 = new JButton("ออเดอร์");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button2.setForeground(Color.BLACK);
		Button2.setFont(new Font("RSU", Font.PLAIN, 99));
		Button2.setBackground(Color.WHITE);
		Button2.setBounds(140, 440, 439, 189);
		panel.add(Button2);
		
		JButton Button3 = new JButton("เก็บเงิน");
		Button3.setForeground(Color.BLACK);
		Button3.setFont(new Font("RSU", Font.PLAIN, 99));
		Button3.setBackground(Color.WHITE);
		Button3.setBounds(140, 675, 439, 189);
		panel.add(Button3);
	}
}
