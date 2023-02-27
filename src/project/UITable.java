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
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

import fortest.GUITEST;

public class UITable extends UI_select_table{

	JFrame frame;
	private JTextField name;
	private JTextField phone;
	private JTextField time_start;
	private JTextField time_end;
	private JTextField selected_table;
	
	
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
		frame.setBounds(100, 100, 700, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Backbutton = new JButton("Go back");
		Backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Backbutton) {
					frame.dispose();
					UI MainUI = new UI();
					MainUI.frame.setVisible(true);
				}
			}
			
		});
		Backbutton.setBounds(30, 10, 102, 31);
		
		frame.getContentPane().add(Backbutton);
		
		JLabel lblNewLabel = new JLabel("ชื่อร้าน");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(315, 39, 230, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ชื่อผู้จอง :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(89, 139, 118, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("เบอร์โทร :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(89, 218, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("เวลาที่จอง :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(89, 292, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("โต๊ะ :");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(89, 422, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		name = new JTextField();
		name.setBounds(210, 137, 389, 31);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(210, 215, 389, 31);
		frame.getContentPane().add(phone);
		
		time_start = new JTextField();
		time_start.setColumns(10);
		time_start.setBounds(210, 295, 140, 31);
		frame.getContentPane().add(time_start);
		
		time_end = new JTextField();
		time_end.setColumns(10);
		time_end.setBounds(459, 295, 140, 31);
		frame.getContentPane().add(time_end);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" ถึง");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(386, 298, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JButton save = new JButton("บันทึกผล");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		save.setFont(new Font("Tahoma", Font.PLAIN, 20));
		save.setBounds(315, 601, 115, 66);
		frame.getContentPane().add(save);
		
		JButton btnNewButton = new JButton("เลือกโต๊ะ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					frame.dispose();
					System.out.println(button);
					UI_select_table select = new UI_select_table();
					select.frame.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(335, 416, 109, 31);
		frame.getContentPane().add(btnNewButton);
		
		selected_table = new JTextField(button);
		selected_table.setBounds(210, 419, 115, 24);
		frame.getContentPane().add(selected_table);
		selected_table.setColumns(10);
		
		

	}
}
