package intellipaat;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "Sateesh";
		String rev ="";
		
		for(int i = str.length()-1;i>=0 ;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

	}

}
