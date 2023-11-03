import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's part of the Fibonacci series: ");
        int n = input.nextInt();
        int a = 0, b = 1, c = 0;
        while (c <= n) {
            if (n == a || n == b || n == c) {
                System.out.println(n + " is part of the Fibonacci series");
                return;
            }
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(n + " is not part of the Fibonacci series");
    }
}
