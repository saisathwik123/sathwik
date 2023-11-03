import java.util.Arrays;

public class moveNegToRightSide {

	public static void main(String[] args) {
		int arr[] = new int[] {-1,5,-10,6,15};
		int j=0,temp;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				if(i!=j)
				{
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
