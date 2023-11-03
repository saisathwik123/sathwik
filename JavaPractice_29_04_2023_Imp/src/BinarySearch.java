import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a num to find in an array");
		int srch = s.nextInt();
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		int index = binarySearch(arr,srch);
		 if (index == -1) {
	            System.out.println("Element not found");
	        } else {
	            System.out.println("Element found at index " + index);
	        }
	}

	private static int binarySearch(int[] arr, int srch) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right)
		{
			int mid = left + (right-left)/2;
			if(arr[mid]==srch)
			{
				return mid;
			}
			else if(arr[mid]<srch){
				left = mid+1;
			}
			else {
				right = mid -1;
			}
		}
		return -1;
	}

}
