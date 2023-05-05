package intellipaat;

import java.util.HashMap;

public class CountOfWords {

	public static void main(String[] args) {
		
		String str = "malayalam";
		
		HashMap<String,Integer> map = new HashMap<>();
		
		String words[] = str.split(" ");
		
		for(String word : words) {
			
			if(map.containsKey(word)) {
				
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);

	}

}
