import java.util.Arrays;
import java.util.Scanner;

public class arraySumEqualToMaxSum {
    public static void  main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        boolean value = verifyAllArrayEleSumEqualToMax(arr,n);
        System.out.println(value);
    }

    private static boolean verifyAllArrayEleSumEqualToMax(int[] arr, int n) {
        Arrays.sort(arr);
        int sum =0;
        for(int i=0;i<arr.length-1;i++)
        {
            sum += arr[i];
        }
        if(sum==arr[arr.length-1])
        {
            return true;
        }
            return false;
    }


}
