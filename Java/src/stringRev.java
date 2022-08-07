import java.util.Scanner;

public class stringRev {
    public static void main(String args[])
    {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter a String to reverse: ");
        String rev = s.nextLine();
        char arr[] = rev.toCharArray();
        for(int i=arr.length-1;i>=0;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
