import java.util.Arrays;

public class MoveZerosoRightSide {

    public static void main(String[] args) {
        int arr[] = new int[] {0, 1, 1, 0, 0, 1, 0};
        int j = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[j] = arr[i];
                j--;
            }
        }
        for (int i = j; i >= 0; i--) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

}
