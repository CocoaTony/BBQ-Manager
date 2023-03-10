package buffetmanage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Close {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Close window = new Close();
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
	public Close() throws FileNotFoundException {
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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ปิดร้าน");
		lblNewLabel.setFont(new Font("RSU", Font.PLAIN, 22));
		lblNewLabel.setBounds(191, 10, 75, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ปิดร้าน");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = JOptionPane.showConfirmDialog(null, "ต้องการปิดร้านแล้วใช่ไหม", "ยืนยัน", JOptionPane.OK_CANCEL_OPTION);
				if (c == JOptionPane.OK_OPTION) {
					frame.dispose();
					Main.frame.dispose();
					file.closeStore();
				}
			}
		});
		btnNewButton.setFont(new Font("RSU", Font.PLAIN, 16));
		btnNewButton.setBounds(180, 190, 102, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ยอดวันนี้");
		lblNewLabel_1.setFont(new Font("RSU", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(79, 98, 63, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("บาท");
		lblNewLabel_2.setFont(new Font("RSU", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(322, 102, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		int total = file.totalPrice();
		String formattedNumber = String.format("%,d", total);
		JLabel lblNewLabel_3 = new JLabel(formattedNumber);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(166, 91, 134, 29);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
