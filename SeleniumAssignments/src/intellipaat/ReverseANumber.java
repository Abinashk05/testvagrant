package intellipaat;

public class ReverseANumber {

	public static void main(String[] args) {
       int number = 123;
       
       int reverse = 0;
       
       while(number != 0) {
    	   
    	  int rem = number%10;//3,2,1
    	  
    	 reverse = reverse * 10 + rem;//3,32,321
    	 
    	 number = number/10;//12,1,0
       }
       
       System.out.println("reversed number " +reverse);
	}

}
