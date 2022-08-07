import java.util.Scanner;

public class missingNumberInAnArray {
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
        int missElement = checkMissingElementsInAnArray(arr);
        System.out.println(missElement);
    }

    private static int checkMissingElementsInAnArray(int[] arr) {
        int n = arr.length;
        int total = ((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
        {
            total-=arr[i];
        }
        return total;
    }

}
