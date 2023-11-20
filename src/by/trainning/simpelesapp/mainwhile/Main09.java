package by.trainning.simpelesapp.mainwhile;

import java.util.Random;

public class Main09 {

	public static void main(String[] args) {
		Random random = new Random();
		 int length = 10;
	        int[] arr = new int[length];
	        int i=0;

		while(i<=arr.length) {
			i++;
			arr[i]=random.nextInt(100);
			System.out.print(arr[i]+" " );
			
		}
	}

}