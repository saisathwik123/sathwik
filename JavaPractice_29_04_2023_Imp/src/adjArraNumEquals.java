import java.util.Scanner;

public class adjArraNumEquals {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = s.nextInt();
		System.out.println("Enter a number to check sum of adjacent elements in an array");
		int key = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements upto size "+n);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==key)
				{
					System.out.println(arr[i]+ " " +arr[j]);
					break;
				}
			}
		}
		

		
	}

}
