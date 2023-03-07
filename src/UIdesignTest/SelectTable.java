package UIdesignTest;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import project.UI_select_table;

public class SelectTable{
	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	
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
	 */
	public SelectTable() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 188, 134));
		panel.setBounds(0, 0, 183, 553);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(Main.getButton());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(51, 10, 64, 48);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 208, 169));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(183, 0, 403, 553);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Angsana New", Font.PLAIN, 16));
		textField.setBounds(114, 71, 239, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ชื่อผู้จอง:");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 71, 94, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("เบอร์โทร:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(23, 129, 81, 34);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Angsana New", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(114, 129, 239, 34);
		panel_1.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลา", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00", "21.00", "22.00"}));
		comboBox.setFont(new Font("Angsana New", Font.PLAIN, 16));
		comboBox.setBounds(114, 204, 81, 34);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("เวลา:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(23, 204, 81, 34);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ถึง");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(205, 204, 51, 34);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลา", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00", "21.00", "22.00"}));
		comboBox_1.setFont(new Font("Angsana New", Font.PLAIN, 16));
		comboBox_1.setBounds(272, 204, 81, 34);
		panel_1.add(comboBox_1);
		
		JButton btnNewButton = new JButton("บันทึก");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Angsana New", Font.PLAIN, 10));
		btnNewButton.setBounds(156, 451, 100, 34);
		panel_1.add(btnNewButton);
	}
}
