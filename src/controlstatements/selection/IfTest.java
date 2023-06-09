package controlstatements.selection;

public class IfTest {
	/*
	 *   =============== if =============
	 *   syntax :
	 *   
	 *      if(condition){
	 *      
	 *          //statements
	 *      }
	 */
	
     public static void main(String[] args) {
		
    	 int salary = 12000;
    	  
    	 if(salary < 30000) { 
    		 	salary = salary + 8000;
    	 }
    	  
    	  System.out.println("Total salary = "+salary);
    	  
    	  
	} 
}
