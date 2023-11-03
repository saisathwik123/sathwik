import java.util.Scanner;

public class splitAndPrintFirstLetrWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        for (String word : words) {
            System.out.print(word.charAt(0));
        }
    }
}
