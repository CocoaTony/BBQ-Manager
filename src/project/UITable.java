package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class UITable extends UI_select_table{

	JFrame frame;
	public static String namestr;
	public static String phonenumber;
	public static int t_starto;
	public static int t_enda;
	private JTextField name;
	private JTextField phone;
	private JTextField selected_table;
	
	
	
	public String getNamestr() {
		return namestr;
	}

	public void setNamestr(String namestr) {
		this.namestr = namestr;
	}

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
		Font Thai = new Font("RSU",Font.PLAIN,20);
		UIManager.put("OptionPane.messageFont",Thai);
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 700, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
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
		name.setFont(new Font("RSU",Font.PLAIN,16));
		name.setBounds(210, 137, 389, 31);
		frame.getContentPane().add(name);
		name.setText(namestr);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setText(phonenumber);
		phone.setColumns(10);
		phone.setBounds(210, 215, 389, 31);
		frame.getContentPane().add(phone);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" ถึง");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(386, 298, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		
		
		JComboBox t_start = new JComboBox();
//		t_start.setSelectedIndex(t_starto);
		t_start.setFont(new Font("RSU",Font.PLAIN,14));
		t_start.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลาเริ่มจอง", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		t_start.setSelectedIndex(t_starto);
		t_start.setBounds(209, 292, 116, 34);
		frame.getContentPane().add(t_start);
		
		JComboBox t_end = new JComboBox();
//		t_end.setSelectedIndex(t_enda);
		t_end.setFont(new  Font("RSU",Font.PLAIN, 14));
		t_end.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลาเลิกจอง", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		t_end.setSelectedIndex(t_enda);
		t_end.setBounds(450, 292, 116, 34);
		frame.getContentPane().add(t_end);
		
		JButton btnNewButton = new JButton("เลือกโต๊ะ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					if(t_start.getSelectedIndex() >= t_end.getSelectedIndex()) {
						JOptionPane.showMessageDialog(null,"กรุณาเลือกเวลาเริ่มจองโต๊ะก่อนเวลาเลิกจอง","Invalid Time",JOptionPane.WARNING_MESSAGE);
					}else {
					frame.dispose();
					System.out.println(button);
					namestr = name.getText();
					phonenumber = phone.getText();
					t_starto = t_start.getSelectedIndex();
					t_enda = t_end.getSelectedIndex();
					UI_select_table select = new UI_select_table();
					select.frame.setVisible(true);
					}
				}
			}
		});
		btnNewButton.setBounds(335, 416, 109, 31);
		frame.getContentPane().add(btnNewButton);
		
		selected_table = new JTextField(button);
		selected_table.setEditable(false);
		selected_table.setBounds(210, 419, 115, 24);
		frame.getContentPane().add(selected_table);
		selected_table.setColumns(10);
		
		JButton save = new JButton("บันทึกผล");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกชื่อ","Fill Form",JOptionPane.OK_OPTION);
				}else if(phone.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกเบอร์โทรศัพท์","Fill Form",JOptionPane.OK_OPTION);
				}else if(!phone.getText().matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกเบอร์โทรศัพท์เป็นตัวเลข","Fill Form",JOptionPane.OK_OPTION);
				}else if(t_start.getSelectedIndex() == 0 || t_end.getSelectedIndex() == 0){
					JOptionPane.showMessageDialog(null, "กรุณาเลือกเวลาจอง","Fill Form",JOptionPane.OK_OPTION);
				}else if(selected_table.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณาเลือกโต๊ะที่จะทำการจอง","Fill Form",JOptionPane.OK_OPTION);			
				}				else {
				int confirm = JOptionPane.showConfirmDialog(null, "ต้องการบันทึกข้อมูลหรือไม่?","Confirm", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "บันทึกเสร็จสิ้น", "Success!", JOptionPane.PLAIN_MESSAGE);
				try {
					Booking bk = new Booking(name.getText(), phone.getText(), selected_table.getText() ,(String)t_start.getSelectedItem(), (String)t_end.getSelectedItem());
					bk.writeFile();
					bk.wf();
				} catch (ParseException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}name.setText("");
				phone.setText("");
				selected_table.setText("");
				button = "";
				t_start.setSelectedIndex(0);
				t_end.setSelectedIndex(0);
				}else {
					JOptionPane.showMessageDialog(null, "ยกเลิกการบันทึก", "Save cancel", JOptionPane.PLAIN_MESSAGE);
				}
			}
			}
		});
		save.setFont(new Font("Tahoma", Font.PLAIN, 20));
		save.setBounds(315, 601, 115, 66);
		frame.getContentPane().add(save);
		
		JButton Backbutton = new JButton("Go back");
		Backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Backbutton) {
					namestr = "";
					phonenumber = "";
					button = "";
					t_starto = 0;
					t_enda = 0;
					
					frame.dispose();
					
					UI MainUI = new UI();
					MainUI.frame.setVisible(true);
				}
			}
			
		});
		Backbutton.setBounds(30, 10, 102, 31);
		
		frame.getContentPane().add(Backbutton);
		
		
		

	}
}
