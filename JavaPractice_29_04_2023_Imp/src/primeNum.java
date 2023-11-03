import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive number greater than 1");
		int n = s.nextInt();
		boolean isPrime = true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Prime Num "+n);
		}
		else
		{
			System.out.println("Not a Prime Num "+n);
		}
	}

}
