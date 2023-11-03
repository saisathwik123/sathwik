import java.util.Scanner;

public class primeNums {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(findPrimeNums(i)
					) {
				System.out.println("Prime Num "+i);
			}
			else {
				System.out.println("Not a prime num "+i);
			}
		}

	}

	public static boolean findPrimeNums(int n) {
			boolean isPrime = true;
			for(int j=2;j<=Math.sqrt(n);j++)
			{
				if(n%j==0)
				{
					isPrime = false;
					break;	
				}
			}
			return isPrime;

}
}
