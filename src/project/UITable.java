package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

import fortest.GUITEST;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class UITable extends UI_select_table{

	JFrame frame;
	private JTextField name;
	private JTextField phone;
	private JTextField selected_table;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String filename;
		String dir = "tableID";
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
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" ถึง");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(386, 298, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JButton save = new JButton("บันทึกผล");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.getText();
				phone.getText();
				File flie = new File(dir);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลาเริ่มจอง", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00", "21.00", "22.00"}));
		comboBox.setBounds(209, 292, 116, 34);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลาเริ่มจอง", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00", "21.00", "22.00"}));
		comboBox_1.setBounds(450, 292, 116, 34);
		frame.getContentPane().add(comboBox_1);
		
		

	}
}
