package by.trainning.simpelesapp.mainwhile;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">");
		int a = scanner.nextInt();
		int b=1;
		while(b<10) {
			b++;
			
			
			System.out.println(a*b);
			
		}
	}

}
