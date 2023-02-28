package fortest;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	 */
	public UIORDERTEST() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		
		JList Menulist = new JList();
		Menu.setViewportView(Menulist);
		
		//JButton Button = new JButton("Get value");
		//Button.setBounds(125, 491, 89, 23);
		//frame.getContentPane().add(Button);
		//Button.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//		String a = (String) list.getSelectedValue();
		//		JOptionPane.showMessageDialog(null, a);
						
		//	}
	//	});
		
		
		
		
		
	
	}
}
