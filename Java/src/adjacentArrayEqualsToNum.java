import java.util.Scanner;

public class adjacentArrayEqualsToNum {

    public static void  main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int k = s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i]+ " " +arr[j]);
                    break;
                }
            }
        }
    }
}
