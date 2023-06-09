package controlstatements.selection;

public class IfElseTest {
	/*
	 *  ====================== if-else ========================
	 *  syntax :
	 *  
	 *      if(condition){
	 *         //statement
	 *      }else{
	 *      
	 *         //statement
	 *      }
	 */
	
	public static void main(String[] args) {
		
		  int n = 97;
		  
		   if(n%2 == 0) {
			   System.out.println(n+" is even number");
		   }else {
			  System.out.println(n+" is odd  number"); 
		   }
	}
}
