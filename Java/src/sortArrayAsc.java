import java.util.Scanner;

public class sortArrayAsc {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int temp;
        System.out.println("Enter array elements upto size "+n);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
