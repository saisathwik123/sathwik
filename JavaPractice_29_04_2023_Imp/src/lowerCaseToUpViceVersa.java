import java.util.Scanner;

public class lowerCaseToUpViceVersa {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuffer strb = new StringBuffer(str);
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If the character is lowercase, convert to uppercase
            if (Character.isLowerCase(str.charAt(i))) {
                strb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            // If the character is uppercase, convert to lowercase
            else {
                strb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(strb);
    }
}
