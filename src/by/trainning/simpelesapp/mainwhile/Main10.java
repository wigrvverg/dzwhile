package by.trainning.simpelesapp.mainwhile;

public class Main10 {

	public static void main(String[] args) {
		int x = 55;
		int b = 1;
		int a = 0;
		int sum = 0;
		while (sum < x) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);

		}

	}

}
