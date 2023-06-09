package methods;

public class MethodTest {
	
	public static void main(String[] args) {
		
		//add();
		//printTable(7877);
		
		int a = getSumOf1to100();
		System.out.println("Sum of 1 to 100 = "+a);
		
		
		int sv = findSmallestValue(7676, 878787);
		System.out.println("Smallest value = "+sv);
	}
	
	//1. no return type(void) with no arguments
	 static void add() {
		  
		  int a = 434;
		  int b = 4566;
		  
		  int c = a + b;
		  System.out.println("Total = "+c);
	  }
	 
	//2. no return type(void) with arguments
	static void printTable(int n) {
		
		 for(int i=1; i<=10; i++) {
			 System.out.println(n+" x "+i+" = "+(n*i));
		 }
		 
	 }
	
	//3. return type(return result) with  no arguments
	
	static  int getSumOf1to100() {
		  
		  int s = 0;
		  
		  for(int i=1; i<=100; i++) {
			  s = s + i;
		  }
		  
		 return s; 
	  }
	 
	//4. return type with arguments.
	static int findSmallestValue(int x, int y) {
		
		   if(x < y)
			   return x;
		   else
			   
		      return y;
	}
	

}
