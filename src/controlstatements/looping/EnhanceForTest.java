package controlstatements.looping;

public class EnhanceForTest {
	
	/*
	 *   =============== Enhance For Loop ===============
	 *   # use to read data from collection.
	 *   
	 *   syntax:
	 *   
	 *     for(data_type  var : collection ){
	 *     
	 *         //statements
	 *     }
	 */
	
	 public static void main(String[] args) {
		
		   int values[] = {9,8,7,65,4,34,56,78,54,32,13,45,67,43,23,4,56};
		
		   for(int x : values) {
			   
			   System.out.println(x);
		   }
	}

}
