package buffetmanage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.LayeredHighlighter.LayerPainter;

import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Main   {

	static JFrame frame;
	public static String button;
	private JTextField Result;
	private ArrayList<String> menuorder = new ArrayList();
	private String nonn = "";
	public String[] table;
	buffetmanage.FileWriterAndRead gg;
	public static String tableCB;


	
	public Main(String button) {
		super();
		this.button = button;
	}
	
	
	
	
	public static String getButton() {
		return button;
	}




	public  void setButton(String button) {
		this.button = button;
	}
	public void TableSelected(String button) throws FileNotFoundException {
		setButton(button);
		SelectTable Table = new SelectTable();
		Table.frame.setVisible(true);
	}
	
	public String[] jjj(String[] list) {
		return list;
	}
	
	
	 private class MyListListener implements ListSelectionListener{
	        @Override
	        public void valueChanged(ListSelectionEvent e) {
	            if (!e.getValueIsAdjusting()) {
	                JList<String> lst = (JList<String>) e.getSource();
	                String selection = lst.getSelectedValue();
	                tableCB = lst.getSelectedValue();
	                if (selection != null) {
//	                    JOptionPane.showMessageDialog(null, selection, "Selected Item",
//	                            JOptionPane.INFORMATION_MESSAGE);
	                	UIBill ui;
						try {
							ui = new UIBill();
							ui.frame.setVisible(true);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	
	                	
	        
	                }
	            }
	        }
	    }


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
		Font font = new Font("RSU", Font.PLAIN, 16);
		UIManager.put("OptionPane.messageFont", font);
		
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
		
		//Content here
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(207, 0, 677, 561);
		bg.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel Mainpanel = new JPanel();
		Mainpanel.setBackground(Color.WHITE);
		layeredPane.add(Mainpanel, "name_347667449376200");
		//Checkbill
		
		
		JPanel CheckBillpanel = new JPanel();
		layeredPane.add(CheckBillpanel, "name_346658630833800");
		CheckBillpanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 224));
		panel.setBounds(10, 10, 657, 328);
		CheckBillpanel.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 200, 308);
		panel.add(scrollPane_1);
		
		JLabel TableTextbill = new JLabel("Table");
		TableTextbill.setBackground(new Color(255, 255, 224));
		TableTextbill.setFont(new Font("RSU", Font.BOLD, 19));
		TableTextbill.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane_1.setColumnHeaderView(TableTextbill);
		
		buffetmanage.FileWriterAndRead tbcb = new buffetmanage.FileWriterAndRead();
		String[] tablecb =  tbcb.readBill();
//		String[] x = new String[] {"A1","A2","B1","B2"};
		JList list = new JList(tablecb);
		list.addListSelectionListener(new MyListListener()); 
		scrollPane_1.setViewportView(list);
		
		
		
		//Checkbill
		
		
		///tableSelected///
		
		JPanel Tablepanel = new JPanel();
		Tablepanel.setBackground(new Color(250, 250, 210));
		layeredPane.add(Tablepanel, "name_346662239729800");
		Tablepanel.setLayout(null);
		
		JButton btnNewButton = new JButton("A01");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(159, 64, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A01");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
		});
		btnNewButton.setBounds(70, 50, 75, 75);
		Tablepanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("A02");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(159, 64, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A02");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(215, 50, 75, 75);
		Tablepanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("A03");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(159, 64, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A03");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(375, 50, 75, 75);
		Tablepanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("A04");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(159, 64, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A04");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(520, 50, 75, 75);
		Tablepanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("A05");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(159, 64, 30));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A05");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(70, 195, 75, 75);
		Tablepanel.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("A06");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(159, 64, 30));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A06");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setBounds(215, 195, 75, 75);
		Tablepanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("A07");
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBackground(new Color(159, 64, 30));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A07");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_1.setBounds(375, 195, 75, 75);
		Tablepanel.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("A08");
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.setBackground(new Color(159, 64, 30));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("A08");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3_1.setBounds(520, 195, 75, 75);
		Tablepanel.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("B01");
		btnNewButton_4_1.setForeground(new Color(255, 255, 255));
		btnNewButton_4_1.setBackground(new Color(159, 64, 30));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TableSelected("B01");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4_1.setBounds(70, 340, 75, 75);
		Tablepanel.add(btnNewButton_4_1);
			//Tableseleced**
		
		
			//Order
		
		buffetmanage.FileWriterAndRead fuc01 = new buffetmanage.FileWriterAndRead();
	
		JPanel Orderpanel = new JPanel();
		Orderpanel.setBackground(Color.WHITE);
		layeredPane.add(Orderpanel, "name_346664563806300");
		Orderpanel.setLayout(null);
	

		this.table = fuc01.getList(4,"data/booking2.txt");
		System.out.println(table.length);
		JComboBox TablecomboBox = new JComboBox();
		TablecomboBox.setFont(new Font("RSU", Font.PLAIN, 14));
		TablecomboBox.setModel(new DefaultComboBoxModel(table));
		TablecomboBox.setBounds(83, 25, 195, 22);
		Orderpanel.add(TablecomboBox);
		
		JLabel TableText = new JLabel("โตํะ");
		TableText.setHorizontalAlignment(SwingConstants.CENTER);
		TableText.setFont(new Font("RSU", Font.PLAIN, 13));
		TableText.setBounds(27, 29, 46, 14);
		Orderpanel.add(TableText);
		
		String[]Menu = fuc01.getList(1,"data/food.txt");
		JComboBox MenuList = new JComboBox();
		MenuList.setFont(new Font("RSU", Font.PLAIN, 14));
		MenuList.setModel(new DefaultComboBoxModel(Menu));
		MenuList.setBounds(377, 26, 195, 22);
		Orderpanel.add(MenuList);
		
		JLabel FoodMenuText = new JLabel("ชุด");
		FoodMenuText.setHorizontalAlignment(SwingConstants.CENTER);
		FoodMenuText.setFont(new Font("RSU", Font.PLAIN, 13));
		FoodMenuText.setBounds(321, 30, 46, 14);
		Orderpanel.add(FoodMenuText);
		
			//**Panel + -
		JPanel Add_Negetive = new JPanel();
		Add_Negetive.setBounds(83, 77, 195, 31);
		Orderpanel.add(Add_Negetive);
		Add_Negetive.setLayout(null);
		
		int[] result = new int[] {1};
		
		JButton AddButton = new JButton("เพิ่ม");
		AddButton.setFont(new Font("RSU", Font.BOLD, 10));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int add_result = result[0]+1;
				result[0] = add_result;
				Result.setText(Integer.toString(result[0]));
			}
		});
		AddButton.setBounds(0, 0, 65, 31);
		Add_Negetive.add(AddButton);
		
		JButton NegetiveButton = new JButton("ลด");
		NegetiveButton.setFont(new Font("RSU", Font.BOLD, 10));
		NegetiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int add_result = result[0]-1;
				if(add_result <= 0) {
					result[0] = 1;
				}else {
					result[0] = add_result;
					
				}
				Result.setText(Integer.toString(result[0]));
			}
		});
		NegetiveButton.setBounds(130, 0, 65, 31);
		Add_Negetive.add(NegetiveButton);
		
		Result = new JTextField(Integer.toString(result[0]));
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setFont(new Font("RSU", Font.BOLD, 14));
		Result.setBounds(63, 0, 70, 31);
		Add_Negetive.add(Result);
		Result.setEditable(false);
		Result.setColumns(10);
		
		JLabel Humanmuch = new JLabel("คน");
		Humanmuch.setFont(new Font("RSU", Font.PLAIN, 13));
		Humanmuch.setHorizontalAlignment(SwingConstants.CENTER);
		Humanmuch.setBounds(27, 87, 45, 13);
		Orderpanel.add(Humanmuch);
		
		
		JPanel List = new JPanel();
		List.setBounds(10, 171, 657, 380);
		Orderpanel.add(List);
		List.setLayout(null);
		
		JLabel ListText = new JLabel("List");
		ListText.setBackground(Color.WHITE);
		ListText.setFont(new Font("RSU", Font.BOLD, 21));
		ListText.setHorizontalAlignment(SwingConstants.CENTER);
		ListText.setBounds(278, 0, 111, 45);
		List.add(ListText);
		
		JPanel Line = new JPanel();
		Line.setBackground(Color.ORANGE);
		Line.setBounds(0, 0, 657, 45);
		List.add(Line);
		
		JPanel Line2 = new JPanel();
		Line2.setBackground(Color.ORANGE);
		Line2.setBounds(0, 43, 10, 337);
		List.add(Line2);
		
		JPanel Line3 = new JPanel();
		Line3.setBackground(Color.ORANGE);
		Line3.setBounds(647, 43, 10, 337);
		List.add(Line3);
		
		JPanel Line4 = new JPanel();
		Line4.setBackground(Color.ORANGE);
		Line4.setBounds(0, 370, 647, 10);
		List.add(Line4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 637, 327);
		List.add(scrollPane);
		
		JLabel Labelorder = new JLabel("");
		Labelorder.setFont(new Font("RSU", Font.BOLD, 15));
		Labelorder.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(Labelorder);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("RSU", Font.BOLD, 16));
		scrollPane.setViewportView(textPane);
		textPane.setEditable(false);
		
		JButton Addlist = new JButton("เพิ่มรายการ");
		Addlist.setFont(new Font("RSU", Font.PLAIN, 13));
		Addlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Addlist) {
					if(table.length == 0) {
						JOptionPane.showMessageDialog(null, "Plase add table","Waring", JOptionPane.WARNING_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Order add!!");
						Labelorder.setText((String) TablecomboBox.getSelectedItem());
						textPane.setText("\t\t\t"+(String)MenuList.getSelectedItem()+"\t\t"+"x"+result[0]+"\t\t\t");
						buffetmanage.FileWriterAndRead od = new buffetmanage.FileWriterAndRead();
						try {
							ReadFile rf = new ReadFile();
							od.order((String)TablecomboBox.getSelectedItem(),(String)MenuList.getSelectedItem(),rf.priceFood((String)MenuList.getSelectedItem()),Result.getText());
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						try {
							fuc01.deleteFilebooking02(TablecomboBox.getSelectedIndex()+1);
							table = fuc01.getList(4,"data/booking2.txt");
							TablecomboBox.setModel(new DefaultComboBoxModel(table));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						}
					}
				}

			});
			Addlist.setBounds(301, 129, 85, 21);
			Orderpanel.add(Addlist);

		
		
			//Panel + -
		
		
		
		//Menu panel***

		
		
		
		
			//Order
		//Content here
		
		
		JPanel Menupanel = new JPanel();
		Menupanel.setBounds(0, 0, 208, 561);
		bg.add(Menupanel);
		Menupanel.setBackground(new Color(222, 184, 135));
		Menupanel.setLayout(null);
		
		

		
		JButton Main = new JButton("หน้าหลัก");
		Main.setFont(new Font("RSU", Font.BOLD, 20));
		Main.setBackground(new Color(238, 232, 170));
		Main.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Mainpanel);
				layeredPane.repaint();
				layeredPane.validate();
				
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
				layeredPane.validate();
		
				
				
				
				
				
			}
		});
		Checkbill.setBackground(new Color(238, 232, 170));
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
				layeredPane.validate();
				
				
			}
		});
		Table.setBackground(new Color(238, 232, 170));
		Table.setBounds(0, 240, 208, 52);
		Menupanel.add(Table);
		
		JButton order = new JButton("ออเดอร์");
		order.setForeground(new Color(255, 255, 255));
		order.setFont(new Font("RSU", Font.BOLD, 20));
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				try {
					table = fuc01.getList(4,"data/booking2.txt");
					TablecomboBox.setModel(new DefaultComboBoxModel(table));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				layeredPane.add(Orderpanel);
				layeredPane.repaint();
				layeredPane.validate();
				Orderpanel.validate();
			}
		});
		order.setBackground(new Color(238, 232, 170));
		order.setBounds(0, 291, 208, 52);
		Menupanel.add(order);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("RSU", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 32, 208, 32);
		Menupanel.add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("รีเฟรช");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main wd;
				try {
					wd = new Main();
					wd.frame.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setFont(new Font("RSU", Font.PLAIN, 12));
		btnNewButton_5.setBounds(60, 430, 85, 21);
		Menupanel.add(btnNewButton_5);
		
		
		

	}
}
