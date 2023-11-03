import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		if(n<2)
		{
			System.out.println("Enter a number greater than 1");
		}
		for(int i=2;i<=n;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			System.out.println("Prime Numbers" +i);
		}
		

	}

}
