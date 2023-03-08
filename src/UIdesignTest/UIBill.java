package UIdesignTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UIBill {
	
	JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIBill window = new UIBill();
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
	public UIBill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		System.out.println(Main.tableCB);
		
		JLabel nameTBCB = new JLabel(Main.tableCB);
		nameTBCB.setBounds(184, 24, 45, 13);
		frame.getContentPane().add(nameTBCB);
	}
}
