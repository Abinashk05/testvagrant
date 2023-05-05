package intellipaat;

import java.util.ArrayList;

public class CountOddEven {

	public static void main(String[] args) {
		
		int[] a = {1,2,2,3,4,5,6};
		
		ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        for(int i = 0; i<a.length; i++){

            if(a[i]%2==0){

                a1.add(a[i]);
            } else{

                a2.add(a[i]);
            }
        }
        int temp1 = 0;
        System.out.println("even no's are");
        for(int no:a1){
            temp1 = temp1+no;
            System.out.println(no+" ");
        }
        System.out.println("\n");
        System.out.println("total no of even no's are:" +a1.size());
        System.out.println("sum of all even no's are :" +temp1);

        int temp2 = 0;
        System.out.println("odd no's are");
        for(int no:a2){
            temp2 = temp2+no;
            System.out.println(no+" ");
        }
        System.out.println("\n total no od odd no's are : " +a2.size());
        System.out.println("sum of all odd no's are : " +temp2);
    }
}


