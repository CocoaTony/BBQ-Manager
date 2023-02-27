package fortest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	
	public static int getcount() throws IOException {
		Scanner scan = new Scanner(new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt"));
		int count = 0;
		while(scan.hasNext()){
			String line = scan.nextLine();
			String[] spitLine = line.split(" ");
			for(int i =0;i<spitLine.length;i++) {
				if(i%2 == 0) {
					count +=1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] TeenYai = new String[getcount()];
		Scanner scan = new Scanner(new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt"));
		
		int count = -1;
		while(scan.hasNext()){
			String line = scan.nextLine();
			String[] spitLine = line.split(" ");
			for(int i =0;i<spitLine.length;i++) {
				if(i==0) {
					count += 1;
					TeenYai[count] = spitLine[i];
				}
			}
		}
		scan.close();
		System.out.println(Arrays.toString(TeenYai));
	}

}
