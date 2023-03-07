package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fortest.GUITEST;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
public class UI_select_table {
//	private String namemom;
//	
//
//	public String getNamemom() {
//		return namemom;
//	}
//	public void setNamemom(String namemom) {
//		this.namemom = namemom;
//	}

	JFrame frame;
	public static String button;
	public static String tableid;
	
	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
	 */
	
	
//	public UI_select_table(String name, String phone, String table, String time_s, String time_e)
//			throws ParseException {
//		super(name, phone, table, time_s, time_e);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public void readTable(String table,JButton id) throws FileNotFoundException {
		Scanner read = new Scanner(table);
		while(read.hasNext()) {
			String time = read.nextLine();
			String[] time_split = time.split("-");
			for(int i = 0;i < time_split.length ;i++) {
				int list = time.indexOf(i);
			}
		}read.close();
}

	public void getUITable(String value) {
		button=value;
		UITable table = new UITable();
		table.frame.setVisible(true);
		frame.dispose();
		
}
	public void getBack() {
		UITable table1 = new UITable();
		table1.frame.setVisible(true);
		frame.dispose();
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_select_table window = new UI_select_table();
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
	public UI_select_table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("เลือกโต๊ะ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(296, 36, 156, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Backbutton = new JButton("Go back");
		Backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBack();
			}
		});
		Backbutton.setBounds(26, 10, 85, 21);
		frame.getContentPane().add(Backbutton);
		
		JButton table_A01 = new JButton("A01");
//		table_A01.setBackground(new Color(218, 165, 32));
		table_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_A01.getText());
				try {
					readTable("data/tableID/A01", table_A01);
					table_A01.setVisible(false);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table_A01.setBackground(new Color(218, 165, 32));
		table_A01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A01.setBounds(127, 165, 104, 52);
		frame.getContentPane().add(table_A01);
		
		JButton table_A02 = new JButton("A02");
		table_A02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_A02.getText());
			}
		});
		table_A02.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A02.setBackground(new Color(218, 165, 32));
		table_A02.setBounds(127, 228, 104, 52);
		frame.getContentPane().add(table_A02);
		
		JButton table_A03 = new JButton("A03");
		table_A03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_A03.getText());
			}
		});
		table_A03.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A03.setBackground(new Color(218, 165, 32));
		table_A03.setBounds(127, 335, 104, 52);
		frame.getContentPane().add(table_A03);
		
		JButton table_A04 = new JButton("A04");
		table_A04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_A04.getText());
			}
		});
		table_A04.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A04.setBackground(new Color(218, 165, 32));
		table_A04.setBounds(127, 455, 104, 52);
		frame.getContentPane().add(table_A04);
		
		JButton table_A05 = new JButton("A05");
		table_A05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_A05.getText());
			}
		});
		table_A05.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A05.setBackground(new Color(218, 165, 32));
		table_A05.setBounds(127, 576, 104, 52);
		frame.getContentPane().add(table_A05);
		
		JButton table_A06 = new JButton("A06");
		table_A06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_A06.getText());
			}
		});
		table_A06.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A06.setBackground(new Color(218, 165, 32));
		table_A06.setBounds(127, 695, 104, 52);
		frame.getContentPane().add(table_A06);
		
		JButton table_B01 = new JButton("B01");
		table_B01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_B01.getText());
			}
		});
		table_B01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B01.setBackground(new Color(218, 165, 32));
		table_B01.setBounds(318, 127, 104, 52);
		frame.getContentPane().add(table_B01);
		
		JButton table_B02 = new JButton("B02");
		table_B02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_B02.getText());
			}
		});
		table_B02.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B02.setBackground(new Color(218, 165, 32));
		table_B02.setBounds(318, 228, 104, 52);
		frame.getContentPane().add(table_B02);
		
		JButton table_B03 = new JButton("B03");
		table_B03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_B03.getText());
			}
		});
		table_B03.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B03.setBackground(new Color(218, 165, 32));
		table_B03.setBounds(318, 335, 104, 52);
		frame.getContentPane().add(table_B03);
		
		JButton table_B04 = new JButton("B04");
		table_B04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_B04.getText());
			}
		});
		table_B04.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B04.setBackground(new Color(218, 165, 32));
		table_B04.setBounds(318, 455, 104, 52);
		frame.getContentPane().add(table_B04);
		
		JButton table_B05 = new JButton("B05");
		table_B05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_B05.getText());
			}
		});
		table_B05.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B05.setBackground(new Color(218, 165, 32));
		table_B05.setBounds(318, 576, 104, 52);
		frame.getContentPane().add(table_B05);
		
		JButton table_B06 = new JButton("B06");
		table_B06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUITable(table_B06.getText());
			}
		});
		table_B06.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B06.setBackground(new Color(218, 165, 32));
		table_B06.setBounds(318, 695, 104, 52);
		frame.getContentPane().add(table_B06);
		
		JButton table_A01_1 = new JButton("A01");
		table_A01_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		table_A01_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A01_1.setBackground(new Color(192, 192, 192));
		table_A01_1.setBounds(127, 127, 104, 52);
		frame.getContentPane().add(table_A01_1);
		frame.setBounds(100, 100, 700, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
