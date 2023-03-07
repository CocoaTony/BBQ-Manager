package UIdesignTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.LayeredHighlighter.LayerPainter;

import fortest.FileWriterAndRead;

import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;

public class Main   {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel bg = new JPanel();
		bg.setBackground(new Color(255, 255, 255));
		bg.setBounds(0, 0, 884, 561);
		frame.getContentPane().add(bg);
		bg.setLayout(null);
		
		
		//Menu panel***
		
		JPanel Menupanel = new JPanel();
		Menupanel.setBackground(new Color(255, 205, 138));
		Menupanel.setBounds(0, 0, 208, 561);
		bg.add(Menupanel);
		Menupanel.setLayout(null);
		
		//Menu panel***
		
		//Content here
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(207, 0, 677, 561);
		bg.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel Mainpanel = new JPanel();
		Mainpanel.setBackground(Color.WHITE);
		layeredPane.add(Mainpanel, "name_347667449376200");
		
		JPanel CheckBillpanel = new JPanel();
		layeredPane.add(CheckBillpanel, "name_346658630833800");
		
		JPanel Tablepanel = new JPanel();
		layeredPane.add(Tablepanel, "name_346662239729800");
		
			//Order
		
		FileWriterAndRead fuction = new FileWriterAndRead();
		fuction.setName(1, "data\\food.txt");
		
		
		JPanel Orderpanel = new JPanel();
		Orderpanel.setBackground(Color.WHITE);
		layeredPane.add(Orderpanel, "name_346664563806300");
		Orderpanel.setLayout(null);
		
		String[] table = new String[] {"Table01","Table02","Table03","Table04","Table05"};
		JComboBox TablecomboBox = new JComboBox(table);
		TablecomboBox.setModel(new DefaultComboBoxModel());
		TablecomboBox.setBounds(83, 25, 195, 22);
		Orderpanel.add(TablecomboBox);
		
		JLabel TableText = new JLabel("โตํะ");
		TableText.setHorizontalAlignment(SwingConstants.CENTER);
		TableText.setFont(new Font("RSU", Font.PLAIN, 13));
		TableText.setBounds(27, 29, 46, 14);
		Orderpanel.add(TableText);
		
		JComboBox MenuList = new JComboBox();
		MenuList.setBounds(377, 26, 195, 22);
		Orderpanel.add(MenuList);
		
		JLabel FoodMenuText = new JLabel("ชุด");
		FoodMenuText.setHorizontalAlignment(SwingConstants.CENTER);
		FoodMenuText.setFont(new Font("RSU", Font.PLAIN, 13));
		FoodMenuText.setBounds(321, 30, 46, 14);
		Orderpanel.add(FoodMenuText);
		
		
		
		
			//Order
		//Content here
		
		

		
		JButton Main = new JButton("หน้าหลัก");
		Main.setFont(new Font("RSU", Font.BOLD, 20));
		Main.setBackground(Color.ORANGE);
		Main.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Mainpanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		Main.setForeground(Color.WHITE);
		Main.setBounds(0, 138, 208, 52);
		Menupanel.add(Main);
		
		JButton Checkbill = new JButton("เข็คบิล");
		Checkbill.setForeground(new Color(255, 255, 255));
		Checkbill.setFont(new Font("RSU", Font.BOLD, 20));
		Checkbill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(CheckBillpanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		Checkbill.setBackground(Color.ORANGE);
		Checkbill.setBounds(0, 188, 208, 52);
		Menupanel.add(Checkbill);
		
		JButton Table = new JButton("จองโต๊ะ");
		Table.setForeground(new Color(255, 255, 255));
		Table.setFont(new Font("RSU", Font.BOLD, 20));
		Table.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Tablepanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		Table.setBackground(Color.ORANGE);
		Table.setBounds(0, 240, 208, 52);
		Menupanel.add(Table);
		
		JButton order = new JButton("ออเดอร์");
		order.setForeground(new Color(255, 255, 255));
		order.setFont(new Font("RSU", Font.BOLD, 20));
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Orderpanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		order.setBackground(Color.ORANGE);
		order.setBounds(0, 291, 208, 52);
		Menupanel.add(order);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("RSU", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 32, 208, 32);
		Menupanel.add(lblNewLabel);
		
		
		

	}
}
