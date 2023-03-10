package UIdesignTest;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;

public class SelectTable{
	JFrame frame;
	private JTextField nameBK;
	private JTextField phoneBK;
	
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectTable window = new SelectTable();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public SelectTable() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {
		FileWriterAndRead file = new FileWriterAndRead();
		Font font = new Font("RSU", Font.PLAIN, 16);
		UIManager.put("OptionPane.messageFont", font);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 188, 134));
		panel.setBounds(0, 0, 161, 553);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel(Main.getButton());
		lblNewLabel.setFont(new Font("RSU", Font.PLAIN, 28));
		panel.add(lblNewLabel);
		
		String[] tbID = file.readTable();
		
		Object[] r = file.readF(Main.getButton());
		for (Object t : r) {
			JLabel time = new JLabel((String) t);
			panel.add(time);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(160, 0, 426, 553);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		nameBK = new JTextField();
		nameBK.setFont(new Font("RSU", Font.PLAIN, 16));
		nameBK.setBounds(114, 71, 239, 34);
		panel_1.add(nameBK);
		nameBK.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ชื่อผู้จอง:");
		lblNewLabel_1.setFont(new Font("RSU", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 71, 94, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("เบอร์โทร:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("RSU", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(23, 129, 81, 34);
		panel_1.add(lblNewLabel_1_1);
		
		phoneBK = new JTextField();
		phoneBK.setFont(new Font("RSU", Font.PLAIN, 16));
		phoneBK.setColumns(10);
		phoneBK.setBounds(114, 129, 239, 34);
		panel_1.add(phoneBK);
		
		JComboBox timeS = new JComboBox();
		timeS.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลา", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		timeS.setFont(new Font("RSU", Font.PLAIN, 16));
		timeS.setBounds(114, 204, 81, 34);
		panel_1.add(timeS);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("เวลา:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("RSU", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(23, 204, 81, 34);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ถึง");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("RSU", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(205, 204, 51, 34);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JComboBox timeE = new JComboBox();
		timeE.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลา", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		timeE.setFont(new Font("RSU", Font.PLAIN, 16));
		timeE.setBounds(272, 204, 81, 34);
		panel_1.add(timeE);
		
		JButton btnNewButton = new JButton("บันทึก");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nameBK.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกชื่อ","Fill Form",JOptionPane.OK_OPTION);
				}else if(phoneBK.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกเบอร์โทรศัพท์","Fill Form",JOptionPane.OK_OPTION);
				}else if(!phoneBK.getText().matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกเบอร์โทรศัพท์เป็นตัวเลข","Fill Form",JOptionPane.OK_OPTION);
				}else if(timeS.getSelectedIndex() == 0 || timeE.getSelectedIndex() == 0){
					JOptionPane.showMessageDialog(null, "กรุณาเลือกเวลาจอง","Fill Form",JOptionPane.OK_OPTION);
				}else if(Main.getButton().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณาเลือกโต๊ะที่จะทำการจอง","Fill Form",JOptionPane.OK_OPTION);
				}else if(timeS.getSelectedIndex() >= timeE.getSelectedIndex()){
					JOptionPane.showMessageDialog(null, "กรุณาเลือกเวลาเริ่มจองก่อนเวลาเลิกจอง","Fill Form",JOptionPane.OK_OPTION);
			}else {
				int confirm = JOptionPane.showConfirmDialog(null, "ต้องการบันทึกข้อมูลหรือไม่?","Confirm", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "บันทึกเสร็จสิ้น", "Success!", JOptionPane.PLAIN_MESSAGE);
					FileWriterAndRead bk = new FileWriterAndRead();
					bk.setNumID();
					bk.setTableID(Main.getButton());
					bk.setNameBK(nameBK.getText());
					bk.setPhone(phoneBK.getText());
					frame.dispose();
					try {
						bk.setTime_s((String)timeS.getSelectedItem());
						bk.setTime_e((String)timeE.getSelectedItem());
						bk.BKFile();
						bk.wfbk();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				}
			}
		});
		btnNewButton.setFont(new Font("RSU", Font.PLAIN, 10));
		btnNewButton.setBounds(156, 451, 100, 34);
		panel_1.add(btnNewButton);
		
		JButton Close = new JButton("Close");
		Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if(e1.getSource() == Close) {
					frame.dispose();
					
				}
			}
		});
		Close.setBounds(312, 10, 81, 21);
		panel_1.add(Close);
	}
}
