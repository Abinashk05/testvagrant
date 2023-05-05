package intellipaat;

public class SumOfThreeHighestNumber {

	public static void main(String[] args) {
		
		int a[] = {10,20,60,40,50};
		int sum = 0;
		
		for(int i =0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					
					int temp = a[i];// temp-10
					
					a[i] = a[j];// a[i]=20
					
					a[j] = temp;// a[j] = 10
					
				}
			}
		}
		
		for(int i = 0;i<3;i++) {
			
			sum = sum + a[i];
		}
		System.out.println(sum);

	}

}
