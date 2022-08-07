import java.util.Scanner;

public class checkPrimeOrNot {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        int n = s.nextInt();
        boolean flag = false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("The number is prime "+n);
        }
        else
        {
            System.out.println("The given number is not a prime "+n);
        }
    }
}
