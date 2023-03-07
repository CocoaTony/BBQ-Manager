package fortest;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class UIORDERTEST {

	private JFrame frame;
	private JTextField textField;
	private JTextField Menuselect;

	/**
	 * Launch the application.
	 * @return 
	 * @throws FileNotFoundException 
	 */

	
	
	public static void readtable(String data) throws FileNotFoundException {
	Scanner kaka = new Scanner(new File(data));
	try {
		kaka = new Scanner(new File("data/tableID"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	while(kaka.hasNext()) {
		String line = kaka.nextLine();
		String[] kuy = new String[] {line};
	}kaka.close();
	}
	
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
		FileWriterAndRead fuction = new FileWriterAndRead();
		fuction.setName(1, "data\\food.txt");
		
		//test list table
		File file = new File("data/tableID");
		String[] kuy = new String[] {"A01","A02","A03"};
		
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
		
		
		
		//**Table
		
		
		
		//**Menu
		
		
		
		JScrollPane Menu = new JScrollPane();
		Menu.setBounds(135, 85, 200, 247);
		frame.getContentPane().add(Menu);
		
		JLabel MenuText = new JLabel("Menu");
		MenuText.setHorizontalAlignment(SwingConstants.CENTER);
		MenuText.setFont(new Font("Tahoma", Font.BOLD, 19));
		Menu.setColumnHeaderView(MenuText);
		
		
		JList Menulist = new JList(fuction.getName());
		Menulist.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Menu.setViewportView(Menulist);
		
		//**Menu
		
		//**Oreder
		JScrollPane OrderForSoft = new JScrollPane();
		OrderForSoft.setBounds(350, 85, 139, 247);
		frame.getContentPane().add(OrderForSoft);
		
		JLabel LabelOrderForSoft = new JLabel("");
		LabelOrderForSoft.setFont(new Font("Tahoma", Font.BOLD, 19));
		LabelOrderForSoft.setHorizontalAlignment(SwingConstants.CENTER);
		OrderForSoft.setColumnHeaderView(LabelOrderForSoft);
		
		Menuselect = new JTextField();
		Menuselect.setFont(new Font("RSU", Font.PLAIN, 13));
		OrderForSoft.setViewportView(Menuselect);
		Menuselect.setEditable(false);
		Menuselect.setColumns(10);;
		//**Order
		
		//จำนวนที่ต้องการ*****
		int[] result = new int[] {1};
		
		
		JLabel Result = new JLabel(String.valueOf(result[0]));
		Result.setBounds(233, 342, 45, 13);
		frame.getContentPane().add(Result);
		
		JButton AddButton = new JButton("เพิ่ม");
		AddButton.setFont(new Font("RSU", Font.PLAIN, 11));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int add_result = result[0]+1;
				result[0] = add_result;
				Result.setText(String.valueOf(result[0]));
			}
		});
		AddButton.setBounds(144, 365, 89, 23);
		frame.getContentPane().add(AddButton);
		
		
		
		JButton SubtractionButton = new JButton("ลด");
		SubtractionButton.setFont(new Font("RSU", Font.PLAIN, 11));
		SubtractionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int add_result = result[0]-1;
				if(add_result == 0) {
					result[0] = 1;
				}else {
					result[0] = add_result;
				}
				Result.setText(String.valueOf(result[0]));
				
			}
		});
		SubtractionButton.setBounds(243, 366, 89, 23);
		frame.getContentPane().add(SubtractionButton);
		
		JButton Confirm = new JButton("ยืนยัน");
		Confirm.setFont(new Font("RSU", Font.PLAIN, 11));
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(Tablelist.isSelectionEmpty() || Menulist.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null,"Please select all information.","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					LabelOrderForSoft.setText((String)Tablelist.getSelectedValue());
					FileWriterAndRead fuction02 = new FileWriterAndRead();
					try {
						fuction02.setPrice(2,"data\\food.txt");
						
						int[] save = fuction02.getPrice();
						fuction02.WriteFileMenu((String)Tablelist.getSelectedValue(),(String)Menulist.getSelectedValue(), save[Menulist.getSelectedIndex()]*result[0]);
						Menuselect.setText(Menulist.getSelectedValue()+"        "+"x"+Integer.toString(result[0]));
						
						
					} catch (IOException e1) {
						
					}
				}
				
			}
		});
		Confirm.setBounds(189, 399, 89, 23);
		frame.getContentPane().add(Confirm);
		//จำนวนที่ต้องการ*****
		
		//ListMenu ที่สั่ง
		

		
		
		
		
		
		
		
	
	}
}
