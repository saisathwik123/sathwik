import java.util.Scanner;

public class movePositiveEleArray {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements upto size " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int j=0,temp;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                if(i!=j)
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
