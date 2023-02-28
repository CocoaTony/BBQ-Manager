package fortest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestFuc {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count1 = 0 ;
		int check = 0;
		Scanner scan = new Scanner(new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt"));
		while(scan.hasNext()){
			scan.nextLine();
			if(check == 0) {
				check +=1;
				continue;
			}else {
				count1 += 1;
			}
		}
		scan.close();
		System.out.println(count1);
	}
	
}
