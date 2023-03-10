package fortest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public void deleteFilebooking02(int index) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("data/booking2.txt"));
		int count = 0;
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> d = new ArrayList<String>();
		ArrayList<String> f = new ArrayList<String>();
		ArrayList<String> g = new ArrayList<String>();
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] group = line.split(" ");
			for(int i =0;i<1;i++) {
				a.add(group[i]);
				b.add(group[i+1]);
				c.add(group[i+2]);
				d.add(group[i+3]);
				f.add(group[i+4]);
				g.add(group[i+5]);
			}
		}
		scan.close();
		a.remove(index);
		b.remove(index);
		c.remove(index);
		d.remove(index);
		f.remove(index);
		g.remove(index);
		
		try {
			FileWriter writer = new FileWriter("data/booking2.txt");
			for(int i = 0;i<a.size();i++) {
				System.out.println(i);
				writer.write(a.get(i)+" ");
				writer.write(b.get(i)+" ");
				writer.write(c.get(i)+" ");
				writer.write(d.get(i)+" ");
				writer.write(f.get(i)+" ");
				writer.write(g.get(i)+"\n");
			}
			writer.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//System.out.println(a+""+b+""+c+""+d+""+f+""+g);
		
	}

}
