import java.util.Arrays;

public class MoveZerosToLeftSide {

	public static void main(String[] args) {
		int arr[] = new int[] {0,1,1,0,0,1,0};
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		for(int i = j; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
