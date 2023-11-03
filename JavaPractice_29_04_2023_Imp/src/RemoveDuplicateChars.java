import java.util.Scanner;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ch[j] = ' ';
                    }
                }
                sb.append(ch[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
