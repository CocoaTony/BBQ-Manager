package fortest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GKGKGKGK {
	JFrame frame;
	public static String button;
	/**
	 * Launch the application.
	 */
	public void getTable(String value) {
			button=value;
			GUITEST a = new GUITEST();
			a.frame.setVisible(true);
			frame.dispose();	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GKGKGKGK window = new GKGKGKGK();
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
	public GKGKGKGK() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton01 = new JButton("Table1");
		btnNewButton01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTable(btnNewButton01.getText());
			}
		});
		btnNewButton01.setBounds(85, 70, 85, 21);
		frame.getContentPane().add(btnNewButton01);
		
		JButton btnNewButton = new JButton("Table2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTable(btnNewButton.getText());
			}
		});
		btnNewButton.setBounds(85, 128, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}

}
