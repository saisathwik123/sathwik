import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dupUsingHashMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = s.next();
		callDupFind(str);

	}

	private static void callDupFind(String str) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char ch[] = str.toCharArray();
		for(char arr: ch)
		{
			if(map.containsKey(arr))
			{
				map.put(arr, map.get(arr)+1);
			}
			else
			{
				map.put(arr, 1);
			}
		}
		for(Map.Entry<Character, Integer> mp: map.entrySet())
		{
			if(mp.getValue()>1)
			{
				System.out.println(mp.getKey()+ " : " + mp.getValue());
			}
		}
		
	}

}
