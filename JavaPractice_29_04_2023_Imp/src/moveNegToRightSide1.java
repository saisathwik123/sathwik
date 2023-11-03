import java.util.Arrays;

public class moveNegToRightSide1 {

    public static void main(String[] args) {
        int arr[] = new int[] {-1, 5, -10, 6, 15};
        int j = arr.length - 1, temp;
        for(int i = 0; i < j; i++) {
            if(arr[i] >= 0) {
                while(j > i && arr[j] >= 0) {
                    j--;
                }
                if(i < j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
