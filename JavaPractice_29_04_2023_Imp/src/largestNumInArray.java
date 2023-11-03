import java.util.Arrays;
import java.util.Scanner;

public class largestNumInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int largeNum = largestElementInArray(arr, n);
		System.out.println("The largest Number in Array is: "+largeNum);


	}

	private static int largestElementInArray(int[] arr, int n) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

}
