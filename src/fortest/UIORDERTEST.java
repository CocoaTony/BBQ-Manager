package fortest;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;

import project.UITable;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UIORDERTEST {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIORDERTEST window = new UIORDERTEST();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public UIORDERTEST() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//Import FucList
		FucList_food fuction = new FucList_food();
		
		//test list table
		String[] kuy = new String[] {"Table01","Table02","Table03","Table04","Table05"};
		
		//**Table
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 106, 429);
		frame.getContentPane().add(scrollPane);
		
		JList Tablelist = new JList(kuy);
		scrollPane.setViewportView(Tablelist);
		JLabel TableText = new JLabel("Table");
		TableText.setFont(new Font("Tahoma", Font.BOLD, 19));
		TableText.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(TableText);
		
		
		
		//**Menu
		JScrollPane Menu = new JScrollPane();
		Menu.setBounds(135, 85, 200, 429);
		frame.getContentPane().add(Menu);
		
		JLabel MenuText = new JLabel("Menu");
		MenuText.setHorizontalAlignment(SwingConstants.CENTER);
		MenuText.setFont(new Font("Tahoma", Font.BOLD, 19));
		Menu.setColumnHeaderView(MenuText);
		
		
		JList Menulist = new JList(fuction.getNameFood());
		Menulist.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Menu.setViewportView(Menulist);
		System.out.println(Menulist.getSelectedIndex());
		
		JButton Button = new JButton("ยืนยัน");
		Button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Button.setBounds(350, 491, 89, 23);
		frame.getContentPane().add(Button);
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
			}
		});
		
		
		
		
		
	
	}
}
