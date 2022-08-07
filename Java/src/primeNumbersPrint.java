import java.util.Scanner;

public class primeNumbersPrint {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number upto prime numbers want to print: ");
        int n = s.nextInt();
        if(n<2)
        {
            System.out.println("Enter a number greater than 1");
        }
        for(int i=2;i<=n;i++)
        {
            boolean flag = false;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
               System.out.println("prime Number" +i+ " ");
            }
            else {
                System.out.println("Not a prime Number" +i+ " ");
            }
        }

    }
}
