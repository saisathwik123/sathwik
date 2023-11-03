import java.util.Arrays;
import java.util.Scanner;

public class arraySumEqualToMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements upto size "+n);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		boolean flag = checkArrayElemSumEqualToMaxElement(arr);
		System.out.println(flag);
	}

	private static boolean checkArrayElemSumEqualToMaxElement(int[] arr) {
	
		Arrays.sort(arr);
		int sum = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			sum = sum + arr[i];
		}
		if(arr[arr.length-1]==sum)
		{
			return true;
		}
		
		return false;
	}

}
