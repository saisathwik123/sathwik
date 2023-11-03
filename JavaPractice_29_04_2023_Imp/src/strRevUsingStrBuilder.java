import java.util.Scanner;

public class strRevUsingStrBuilder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = s.nextLine();
		StringBuilder strB = new StringBuilder(str);
		String rev = strB.reverse().toString();
		System.out.println(rev);
		StringBuffer strBu = new StringBuffer(str1);
		System.out.println(strBu);

	}

}
