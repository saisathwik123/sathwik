import java.util.Scanner;

public class factOfNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fact = 1;
		for(int i=2;i<=n;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of a given number is "+fact);

	}

}
