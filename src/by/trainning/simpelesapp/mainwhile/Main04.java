package by.trainning.simpelesapp.mainwhile;

import java.util.Random;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(10);

		System.out.println("загаданное число " + x);
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.print("введите число > ");
			a = scanner.nextInt();

		} while (x != a);

	}

}
