package array;

import java.util.Scanner;

public class MultiDArray {
	/*
	 *   ================== MultiDArray ================
	 *   # use to represent data in matrix/table/row & col form.
	 *   
	 *   syntax :
	 *    
	 *    data_type  array_name[][] = new data_type[row][col];
	 */
	
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		
		//write data in multiDarray
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				
				System.out.println("Enter value for mat ");
				mat[i][j] = sc.nextInt();
			}
		}
		
    //read data from multiDArray
		
		for(int i=0; i<2; i++) {
			
			  for(int j=0; j<2; j++) {
				  
				  System.out.print(mat[i][j]+" ");
			  }
			  System.out.println();
		}
		
		
		
	}
	
	

}
