

import java.util.*;

public class minLength {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(minLength(str));
    }

     static int minLength(String str) {

         int i=0,j=str.length()-1;
         for(; i<j && str.charAt(i) == str.charAt(j);)
         {
             char d = str.charAt(i);
             while(i<=j && str.charAt(i)==d)
             {
                 i++;
             }
             while(i<=j && str.charAt(j)==d)
             {
                 j--;
             }
         }
         return  j-i+1;
    }
}