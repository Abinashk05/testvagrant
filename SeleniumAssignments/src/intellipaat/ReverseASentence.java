package intellipaat;

public class ReverseASentence {

	public static void main(String[] args) {
		
		String s ="I am abinash";
        String rev = "";
        String[] arr = s.split(" ");
		 
		 for(int i = arr.length-1;i>=0;i--) {
			 rev = rev +arr[i];
			 
			 rev = rev + " ";
			   }
		 System.out.println(rev);
		 }
	
	
	

}
