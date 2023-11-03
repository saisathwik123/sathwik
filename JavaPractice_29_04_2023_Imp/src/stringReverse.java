import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String rev = "";
		char arr[] = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			rev = rev + arr[i];
		}
		System.out.println(rev);

	}

}
