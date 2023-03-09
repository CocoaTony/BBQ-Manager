package fortest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteFIle {
	
	public static void deletefilebooking() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("data/bill.txt"));
		ArrayList <String>number_table = new ArrayList<String>();
		ArrayList <String>name_food = new ArrayList<String>();
		ArrayList <String>price = new ArrayList<String>();
		int check = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] arr01 = line.split(" ");
			if(check == 0) {
				check +=1;
				continue;
			}else {
				for(int i=0;i<1;i++) {
					number_table.add(arr01[i]);
					name_food.add(arr01[i+1]);
					price.add(arr01[i+2]);
					
				}
				
			}
		}
		scan.close();
		System.out.println(number_table);
		System.out.println(name_food);
		System.out.println(price);
	}

}
