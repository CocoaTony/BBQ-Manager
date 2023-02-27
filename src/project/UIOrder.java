package project;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class UIOrder {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIOrder window = new UIOrder();
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
	public UIOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100,1300 , 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon white = new ImageIcon("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\src\\project\\White_full.png");
		
		JButton Backbutton = new JButton("New button");
		Backbutton.setBackground(Color.WHITE);
		Backbutton.setIcon(new ImageIcon(UIOrder.class.getResource("/project/ย้อนกลับ.png")));
		Backbutton.setBounds(10, 11, 118, 51);
		frame.getContentPane().add(Backbutton);
		Backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Backbutton) {
					frame.dispose();
					UI MainUI = new UI();
					MainUI.frame.setVisible(true);
				}
			}
		});
		
		
		JLabel White = new JLabel("");
		White.setIcon(new ImageIcon(white.getImage().getScaledInstance(3,971,Image.SCALE_SMOOTH)));
		White.setBounds(151, 73, 3, 971);
		frame.getContentPane().add(White);
		
		JLabel White1 = new JLabel("");
		White1.setIcon(new ImageIcon(white.getImage().getScaledInstance(1334,3,Image.SCALE_SMOOTH)));
		White1.setBounds(-27, 73, 1334, 3);
		frame.getContentPane().add(White1);
		
		JLabel White2 = new JLabel("");
		White2.setIcon(new ImageIcon(white.getImage().getScaledInstance(1334,3,Image.SCALE_SMOOTH)));
		White2.setBounds(-27, 166, 1334, 3);
		frame.getContentPane().add(White2);
		
		
		
	}
}
