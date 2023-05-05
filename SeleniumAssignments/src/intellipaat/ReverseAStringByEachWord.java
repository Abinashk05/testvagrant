package intellipaat;

public class ReverseAStringByEachWord {

	public static void main(String[] args) {
		
		String s = "I am abinash";// I ma a udual
		
		String str = "";
		
		 String[] arr = s.split(" ");
		 
		 for(String word:arr) {
			  for(int i=word.length()-1;i>=0;i--) {
				  
				
			str=str+word.charAt(i);
		
			 
		 }
			  str = str+" ";
			 
		 }
		 
		 System.out.println(str);
	}
			 

}
