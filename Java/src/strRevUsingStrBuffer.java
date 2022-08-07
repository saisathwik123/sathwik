import java.util.Scanner;

public class strRevUsingStrBuffer {
    public static void main(String args[])
    {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter a String to reverse: ");
        String str = s.nextLine();
        StringBuilder strRev = new StringBuilder(str);
        System.out.println(strRev.reverse().toString());
    }
}
