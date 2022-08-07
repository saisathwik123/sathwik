import java.util.Scanner;

public class fibinocciSeries {

    public static void main(String args[])
    {
        int n1=0,n2=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to print fibinocci series upto: ");
        int n = s.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<n;i++)
        {
            int n3= n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
