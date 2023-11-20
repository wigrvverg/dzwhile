package by.trainning.simpelesapp.mainwhile;

import java.util.Scanner;
public class Main11 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
			System.out.print("какое число возвести в степень>");
			int a = scanner.nextInt();
			System.out.print("в какую степень возвести>");
			int b = scanner.nextInt();
			int res=0;
			while(b>res) {
				res=(int) Math.pow(a, b);
				System.out.println(res);
			}

}}
