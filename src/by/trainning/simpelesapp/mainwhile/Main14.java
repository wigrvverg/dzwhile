package by.trainning.simpelesapp.mainwhile;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">");
		int a = scanner.nextInt();
		int sum=0;
		while(a>0) {
			int d=a%10;
			sum+=d;
			a/=10;
	
}
		System.out.println(sum);

	}

}
