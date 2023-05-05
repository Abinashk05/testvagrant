package intellipaat;

public class SumOfNum {

	public static void main(String[] args) {
      
		int n = 123;
		int sum = 0;
		
		while(n>0) {
			
			int dig = n%10;//3,2,1
			sum = sum + dig;//3+2+1
			n = n/10;//12,0
		}
		
		System.out.println(sum);
	}

}
