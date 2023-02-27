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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class UIOrder {

	JFrame frame;
	
	
	//**Method

//	public static int getcount() throws IOException {
//		Scanner scan = new Scanner(new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt"));
//		int count = 0;
//		while(scan.hasNext()){
//			String line = scan.nextLine();
//			String[] spitLine = line.split(" ");
//			for(int i =0;i<spitLine.length;i++) {
//				if(i%2 == 0) {
//					count +=1;
//				}
//			}
//		}
//		return count;
//	}
//	
//	public static String[] getListFOOD()  throws IOException {
//		// TODO Auto-generated method stub
//		String[] TeenYai = new String[getcount()];
//		Scanner scan = new Scanner(new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt"));
//		
//		int count = -1;
//		while(scan.hasNext()){
//			String line = scan.nextLine();
//			String[] spitLine = line.split(" ");
//			for(int i =0;i<spitLine.length;i++) {
//				if(i==0) {
//					count += 1;
//					TeenYai[count] = spitLine[i];
//				}
//			}
//		}
//		scan.close();
//		return TeenYai;
//	}


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
	 * @throws IOException 
	 */
	public UIOrder() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100,1300 , 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon white = new ImageIcon("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\src\\project\\White_full.png");
		frame.getContentPane().setLayout(null);
		
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
		OrderTEXT.setBounds(144, 88, 767, 68);
		OrderTEXT.setHorizontalAlignment(SwingConstants.CENTER);
		OrderTEXT.setFont(new Font("RSU", Font.BOLD, 80));
		frame.getContentPane().add(OrderTEXT);
		
		//Show table?
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(1041, 73, 214, 96);
		lblNewLabel.setFont(new Font("RSU", Font.PLAIN, 31));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		
		String[] kuy = new String[] {"Table01","Table02","Table03","Table04","Table05"};
		
		//Show table + select********
		JScrollPane TablePane = new JScrollPane();
		TablePane.setBounds(10, 180, 91, 322);
		frame.getContentPane().add(TablePane);
		//List in panel
		JList TableList = new JList(kuy);
		TableList.setFont(new Font("RSU", Font.PLAIN, 15));
		TablePane.setViewportView(TableList);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("หมูกระทะชุดเล็ก 150");
		chckbxNewCheckBox.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(281, 183, 118, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("หมูกระทะชุดที่กลาง 250");
		chckbxNewCheckBox_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(281, 206, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("หมูกระทะชุดใหญ่ 350");
		chckbxNewCheckBox_1_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1.setBounds(281, 229, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("หมูหมัก 99");
		chckbxNewCheckBox_1_1_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1.setBounds(281, 252, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("กุ้ง 59");
		chckbxNewCheckBox_1_1_1_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1.setBounds(281, 275, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1 = new JCheckBox("เบคอน 59");
		chckbxNewCheckBox_1_1_1_1_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1.setBounds(281, 298, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1 = new JCheckBox("หมูสามชั้น 59");
		chckbxNewCheckBox_1_1_1_1_1_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1.setBounds(281, 321, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1 = new JCheckBox("ตับ 39");
		chckbxNewCheckBox_1_1_1_1_1_1_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1.setBounds(281, 344, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_1 = new JCheckBox("เต้าหู้ปลา 39");
		chckbxNewCheckBox_1_1_1_1_1_1_1_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_1.setBounds(281, 367, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_2 = new JCheckBox("ปลาดอลลี่ 39");
		chckbxNewCheckBox_1_1_1_1_1_1_1_2.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_2.setBounds(281, 389, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_3 = new JCheckBox("เห็ดเข็มทอง 39");
		chckbxNewCheckBox_1_1_1_1_1_1_1_3.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_3.setBounds(281, 412, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_3);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_4 = new JCheckBox("ปลาหมึกกรอบ 39");
		chckbxNewCheckBox_1_1_1_1_1_1_1_4.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_4.setBounds(281, 436, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_4);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_5 = new JCheckBox("ไข่ไก่ 10");
		chckbxNewCheckBox_1_1_1_1_1_1_1_5.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_5.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_5.setBounds(281, 458, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_5);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_5_1 = new JCheckBox("หมี่หยก 10");
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_1.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_1.setBounds(281, 481, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_5_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_5_2 = new JCheckBox("มาม่า 10");
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_2.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_2.setBounds(281, 502, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_5_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_5_3 = new JCheckBox("ข้าวสวย 10");
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_3.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_3.setBounds(281, 525, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_5_3);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1_1_5_4 = new JCheckBox("ผัก 10");
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_4.setFont(new Font("RSU", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1_1_1_5_4.setBounds(281, 548, 140, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1_1_5_4);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("หมูหมัก 99");
		editorPane.setBounds(277, 179, 379, 478);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("ยืนยัน");
		btnNewButton.setFont(new Font("RSU", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(680, 616, 91, 41);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("success");
				
			}
			
		});
		
		//List***
		//String[] ListFoodTeen = getListFOOD();
		
		
		
		
	
		
		
		
	
		
		
		
		
		
		
	}
}
