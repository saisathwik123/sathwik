import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class remDupUusingHashMapString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.next();
        String modifiedStr = removeDuplicates(str);
        System.out.println("Modified String: " + modifiedStr);
    }

    private static String removeDuplicates(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        char ch[] = str.toCharArray();
        for (char arr : ch) {
            if (map.containsKey(arr)) {
                map.put(arr, map.get(arr) + 1);
            } else {
                map.put(arr, 1);
                sb.append(arr);
            }
        }
        return sb.toString();
    }

}
