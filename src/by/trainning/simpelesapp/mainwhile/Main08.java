package by.trainning.simpelesapp.mainwhile;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">");
		int a = scanner.nextInt();
		int r=0;
		while(0<a) {
			
			a=a/10;
			r++;
			
		}
		System.out.println(r);
	}

}
