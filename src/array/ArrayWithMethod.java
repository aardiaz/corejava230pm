package array;

import java.util.Arrays;

public class ArrayWithMethod {
	
	  /*
	   *   ===================== Array with method ===========
	   *   a> array as argument :
	   *   	
	   *      void sum(int  a[]){
	   *       
	   *         
	   *      }
	   *      
	   *      int[]  x =  {34,3,43,43,4,4,45};
	   *      
	   *        sum(x);
	   *        
	   *   b> array as return type :
	   *      
	   *        int[] get10IntValues(){
	   *        
	   *        //array = 80,90,4434,343,4545,45;
	   *        
	   *          return array;
	   *        }
	   */
	
	   public static void main(String[] args) {
		
		   //int[] values = {3,4,56,75,43,24,56,75,43,5,67,54};
		   int[] values =  getOddNumsFrom1to100();
		   System.out.println(Arrays.toString(values));
		    
		   add(values);
	    }
	
	   //=============== array as arguments ==========================
    
	  static void add(int array[]) {
        	
        	int s = 0;
        	for(int x : array) {
        		s = s + x;
        	}
        	System.out.println("Total = "+s);
        }
	  
	  //================ array as return type ========================
	  
	 static int[]  getOddNumsFrom1to100() {
		  
		  int[]  oddnums  = new int[50];
		  
		  int j =0;
		  
		    for(int i=1; i<=100; i++) {
		    	
		    	 if(i%2 != 0) {
		    		 oddnums[j] = i;
		    		 j++;
		    	 }
		    	
		    }
		  
		    return oddnums;
	  }
	  
	   
}







