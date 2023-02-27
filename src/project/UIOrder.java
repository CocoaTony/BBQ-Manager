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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
		frame.setBounds(100, 100,1300 , 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon white = new ImageIcon("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\src\\project\\White_full.png");
		frame.getContentPane().setLayout(null);
		
		JButton Backbutton = new JButton("New button");
		Backbutton.setBounds(10, 11, 118, 51);
		Backbutton.setBackground(Color.WHITE);
		Backbutton.setIcon(new ImageIcon(UIOrder.class.getResource("/project/ย้อนกลับ.png")));
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
		
		//LINE*********
		
		JLabel White = new JLabel("");
		White.setBounds(110, 73, 3, 971);
		White.setIcon(new ImageIcon(white.getImage().getScaledInstance(3,971,Image.SCALE_SMOOTH)));
		frame.getContentPane().add(White);
		
		JLabel White1 = new JLabel("");
		White1.setBounds(-384, 73, 1334, 3);
		White1.setIcon(new ImageIcon(white.getImage().getScaledInstance(1334,3,Image.SCALE_SMOOTH)));
		frame.getContentPane().add(White1);
		
		JLabel White2 = new JLabel("");
		White2.setBounds(-384, 166, 1334, 3);
		White2.setIcon(new ImageIcon(white.getImage().getScaledInstance(1334,3,Image.SCALE_SMOOTH)));
		frame.getContentPane().add(White2);
		
		JLabel White3 = new JLabel("");
		White3.setBounds(947, 73, 3, 971);
		White3.setIcon(new ImageIcon(white.getImage().getScaledInstance(3,971,Image.SCALE_SMOOTH)));
		frame.getContentPane().add(White3);
		
		
		//TEXT*********
		
		JLabel TableTEXT = new JLabel("โต๊ะ");
		TableTEXT.setBounds(0, 87, 113, 68);
		TableTEXT.setHorizontalAlignment(SwingConstants.CENTER);
		TableTEXT.setFont(new Font("RSU", Font.BOLD, 47));
		frame.getContentPane().add(TableTEXT);
		
		JLabel OrderTEXT = new JLabel("ORDER");
		OrderTEXT.setHorizontalAlignment(SwingConstants.CENTER);
		OrderTEXT.setFont(new Font("RSU", Font.BOLD, 80));
		OrderTEXT.setBounds(155, 87, 767, 68);
		frame.getContentPane().add(OrderTEXT);
		
		
		String[] kuy = new String[] {"H","World","A","B","C"};
		
		//Show table + select********
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 180, 91, 322);
		frame.getContentPane().add(scrollPane);
		JList list = new JList(kuy);
		scrollPane.setViewportView(list);
		
	
		
		
		
	
		
		
		
		
		
		
	}
}
