package array;

import java.util.Arrays;

public class ArraSortTest {
	
	public static void main(String[] args) {
		
		int[]  data = {23,4,56,78,97,6,5,43,5,6,78,9,6,54,3,2,14,56,78};
	
//	     Arrays.sort(data);
//	     System.out.println(Arrays.toString(data));
//	     
//	     System.out.println("==========reverse order ===========");
//	     for(int i= data.length - 1; i >=0 ; i--) {
//	    	 System.out.print(data[i]+" ");
//	     }
//	     
	     
	     Arrays.fill(data, 500);
	     System.out.println(Arrays.toString(data));
	     
	     Arrays.fill(data, 4, 10, 44);
	     System.out.println(Arrays.toString(data));
	     
	     System.out.println(Arrays.toString(Arrays.copyOf(data, 10)));
	     System.out.println(Arrays.toString(Arrays.copyOfRange(data, 2, 8)));
	     
	}

}
