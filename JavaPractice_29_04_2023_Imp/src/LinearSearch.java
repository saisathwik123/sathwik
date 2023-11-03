import java.util.Scanner;

public class LinearSearch {

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
		int index = linearSearch(arr, srch);
		if(index==-1)
		{
			System.out.println("Not found");
		}
		System.out.println("Found at "+index);

	}
	
	public static int linearSearch(int[] arr, int target) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == target) {
	            return i; // return the index of the target if found
	        }
	    }
	    return -1; // return -1 if the target is not found in the array
	}


}
