import java.util.Arrays;
import java.util.Scanner;

public class movePositiveElemntsInAnArray {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements upto size " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        for(int a : arr)
        {
            System.out.println(a);
        }
    }

}
