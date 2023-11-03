
public class RemoveDuplicateNumbersInArray {
	public static void main(String[] args) {
	int arr[] = new int[] {10,5,10,20,5};
	for(int i=0;i<arr.length;i++)
	{
		int j;
		for(j=0;j<i;j++)
		{
			if(arr[i]==arr[j])
			{
				break;
			}
		}
		if(i==j)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	}
}
