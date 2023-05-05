package intellipaat;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {

		String s = "Welcome to bangalore Welcome to Hsr";
		
		String[] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i = 0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for(String word : set)
			
			System.out.print(word + " ");
	}

}
