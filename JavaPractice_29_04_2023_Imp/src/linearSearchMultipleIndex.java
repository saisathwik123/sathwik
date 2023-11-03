import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class linearSearchMultipleIndex {
	public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 3};
	int searchElement = 3;
	int[] indexes = linearSearch(arr, searchElement);
	System.out.println(Arrays.toString(indexes)); // prints [2, 5]
	}
	public static int[] linearSearch(int[] arr, int searchElement) {
	    List<Integer> indexes = new ArrayList<>();
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == searchElement) {
	            indexes.add(i);
	        }
	    }
	    // Convert the list to an array
	    int[] indexArr = new int[indexes.size()];
	    for (int i = 0; i < indexArr.length; i++) {
	        indexArr[i] = indexes.get(i);
	    }
	    return indexArr;
	}

}
