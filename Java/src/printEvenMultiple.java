import java.util.Scanner;

public class printEvenMultiple {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number upto: ");
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                for(int j=i;j>=1;j--)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
