import java.util.Scanner;

public class AdjacentArrayEqualsToNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = s.nextInt();

        // Input validation
        while (n <= 0) {
            System.out.println("Array size should be positive. Enter again: ");
            n = s.nextInt();
        }

        System.out.println("Enter a number to check sum of adjacent elements in an array");
        int key = s.nextInt();

        // Input validation
        while (key < 0) {
            System.out.println("Key should be non-negative. Enter again: ");
            key = s.nextInt();
        }

        int arr[] = new int[n];
        System.out.println("Enter array elements up to size " + n + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        boolean foundPair = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == key) {
                System.out.println(arr[i] + " " + arr[i + 1]);
                foundPair = true;
            }
        }

        if (!foundPair) {
            System.out.println("No adjacent pair found with sum equal to " + key);
        }
    }
}
