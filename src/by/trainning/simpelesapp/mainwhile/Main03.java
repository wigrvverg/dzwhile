package by.trainning.simpelesapp.mainwhile;
import java.util.Scanner;
public class Main03 {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print(">");
	int n=scanner.nextInt();
	int sum=0;
	int a=0;
	while(a<n) {
		a++;
		sum+=a;
		
	}
	System.out.println(sum);

	}

}