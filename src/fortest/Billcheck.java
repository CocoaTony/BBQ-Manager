package fortest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Billcheck {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billcheck window = new Billcheck();
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
	public Billcheck() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException{
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		FileWriterAndRead fuction = new FileWriterAndRead();
		fuction.setName(1, "C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\Bill.txt");
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 66, 106, 429);
		frame.getContentPane().add(scrollPane);
		
		JLabel TableText = new JLabel("Table");
		TableText.setFont(new Font("RSU", Font.PLAIN, 20));
		TableText.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(TableText);
		
		
		if(fuction.checkWaMeTableMai() == true) {
			JLabel lblNewLabel = new JLabel("ไม่มีโต๊ะ");
			lblNewLabel.setFont(new Font("RSU", Font.PLAIN, 20));
			lblNewLabel.setBackground(new Color(255, 255, 255));
			scrollPane.setViewportView(lblNewLabel);
		}else if(fuction.checkWaMeTableMai() == false){
			JList list = new JList<Object>(fuction.getName());
			scrollPane.setViewportView(list);
		}
		
		JButton btnNewButton = new JButton("Check Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(161, 406, 228, 89);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
