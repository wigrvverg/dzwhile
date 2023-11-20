package by.trainning.simpelesapp.mainwhile;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tc = 0;
		int tf = ((tc * 9) / 5) + 32;
		while (tc < tf) {
			System.out.print(">");
			tc = scanner.nextInt();
			tf = ((tc * 9) / 5) + 32;
			System.out.println(tf);

		}

	}

}
