package intellipaat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfLetters {

	public static void main(String[] args) {
		
		String str = "malyalam";
		
		char words[] = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry :entrySet) {
			
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
		
	}
	
	
}
	


