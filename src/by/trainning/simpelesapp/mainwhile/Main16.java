package by.trainning.simpelesapp.mainwhile;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">");
		int a = scanner.nextInt();

		while (a!= 1) {
			if (a%2==0) {
				a = a/2;
			}
			else  {
				a = (3 * a) + 1;
			}
			
		}
		System.out.println(a);
		

	}

}
