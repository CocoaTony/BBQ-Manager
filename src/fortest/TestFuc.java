package fortest;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestFuc {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("data\\booking.txt"));
		while(scan.hasNext()){
			String line = scan.nextLine();
			String[] ListForLength = line.split(" ");
			System.out.println(Arrays.toString(ListForLength));
		}
		scan.close();
	}
}
