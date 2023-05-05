package intellipaat;

public class RevereseEachWordAndSentence {

	public static void main(String[] args) {
		String s = "I am Abinash";//hsaniba ma I
		String rev = "";
		String rev1 = "";
		String[] str = s.split(" ");
		
		for(int i = str.length-1;i>=0;i--) {
		
			rev = str[i];
			
			for(int j = rev.length()-1;j>=0;j--) {
				rev1 = rev1 + rev.charAt(j);
				
			}
			
			rev1 = rev1 + " ";
			
		}
		System.out.println(rev1);
		
	

	}

}
