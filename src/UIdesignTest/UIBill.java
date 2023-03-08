package UIdesignTest;

import java.awt.EventQueue;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

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
	 * @throws FileNotFoundException 
	 */
	public UIBill() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {
		FileWriterAndRead file =new FileWriterAndRead();

		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 470, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
//		System.out.println(Main.tableCB);
		
		JLabel nameTBCB = new JLabel("โต๊ะ "+Main.tableCB);
		nameTBCB.setFont(new Font("RSU", Font.PLAIN, 16));
		nameTBCB.setBounds(184, 24, 94, 13);
		frame.getContentPane().add(nameTBCB);

		Object[] namemenu = file.billmenu(Main.tableCB);
		String mn = "";
		
		for (Object o : namemenu) {
			mn = mn+o+"\n";
		}
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("RSU", Font.PLAIN, 16));
		textPane.setText(mn);
		textPane.setBounds(23, 80, 203, 330);
		frame.getContentPane().add(textPane);
		
		Object[] price = file.billprice(Main.tableCB);
		String nprice = "";
		
		for (Object o : price) {
			nprice = nprice+o+"\n";
		}
		
		JTextPane tprice = new JTextPane();
		tprice.setEditable(false);
		tprice.setFont(new Font("RSU", Font.PLAIN, 15));
		tprice.setText(nprice);
		tprice.setBounds(261, 80, 72, 330);
		frame.getContentPane().add(tprice);
		
		Object[] c = file.billcount(Main.tableCB);
		String nc = "";
		
		for (Object o : c) {
			nc += "x"+o+"\n";
		}
		
		JTextPane ctext = new JTextPane();
		ctext.setEditable(false);
		ctext.setFont(new Font("RSU", Font.PLAIN, 15));
		ctext.setText(nc);
		ctext.setBounds(380, 80, 50, 330);
		frame.getContentPane().add(ctext);
		
		JLabel lblNewLabel = new JLabel("ยอดรวม");
		lblNewLabel.setFont(new Font("RSU", Font.PLAIN, 14));
		lblNewLabel.setBounds(162, 433, 64, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel total = new JLabel(Integer.toString(file.priceandcount(Main.tableCB)));
		total.setFont(new Font("RSU", Font.PLAIN, 20));
		total.setBounds(249, 420, 100, 40);
		frame.getContentPane().add(total);
		
//		file.priceandcount(Main.tableCB);
	}
}
