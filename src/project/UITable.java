package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class UITable {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITable window = new UITable();
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
	public UITable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 1200, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon backicon = new ImageIcon("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\src\\ย้อนกลับ.png");
		
		JButton BackMainUI = new JButton("");
		BackMainUI.setBackground(Color.WHITE);
		BackMainUI.setIcon(new ImageIcon(backicon.getImage().getScaledInstance(89, 52, Image.SCALE_SMOOTH)));
		BackMainUI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BackMainUI.setBounds(10, 75, 71, 52);
		frame.getContentPane().add(BackMainUI);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\src\\project\\White_full.png"));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 62, 704, 81);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
