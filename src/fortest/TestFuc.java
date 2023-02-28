package fortest;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestFuc {

	public static void main(String[] args) throws IOException{
		FucList_food a = new FucList_food();
		for(int i = 0 ; i<a.count();i++) {
			System.out.println("Menu= "+a.getNameFood(i)+"\n"+"ราคา = "+a.getPrice(i)+"\n"+a.getQuantity(i));
		}
	
	}
}
