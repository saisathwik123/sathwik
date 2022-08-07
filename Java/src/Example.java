import java.util.HashMap;

public class Example {
    public static void main(String args[]) {

     int arr[] = new int[]{0,1,0,0,1,1};
     int j =0;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==0)
         {
             arr[j]=arr[i];
             j++;
         }

     }
     while(j<arr.length)
     {
         arr[j]=1;
         j++;
     }
     for(int k=0;k<arr.length;k++)
     {
         System.out.println(arr[k]);
     }



    }
}

