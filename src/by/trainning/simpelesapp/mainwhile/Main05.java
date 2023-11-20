package by.trainning.simpelesapp.mainwhile;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">");
		int a = scanner.nextInt();
		int a1 = 0;
		while (a != 0) {
			a1 = a1 * 10 + a % 10;
			a /= 10;
		}
		System.out.println(a1);
	}
}
