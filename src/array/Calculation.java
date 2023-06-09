package array;

public class Calculation {
	
	public static void main(String[] args) {
		
		int mat1[][] = { {40,60}, {90,88} };
		int mat2[][] = { {4,8},   {6,9}};
		
		int mat3[][] = new int[2][2];
		
		//addition
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}
