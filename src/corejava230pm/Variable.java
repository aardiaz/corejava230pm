package corejava230pm;

import java.util.Scanner;

public class Variable {
	/*
	 *  ==================== variable =======================
	 *  # use to store values/data.
	 *  # data stored for data processing.
	 *  
	 *  syntax :
	 *    data_type  varible_name;
	 */
	
	public static void main(String[] args) {
		
		//WAP to print sum of 500 and 700.
		
		int a ;
		int b ;
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter value of a ");
		a = sc.nextInt();
		
		System.out.println("Enter value of b ");
		b = sc.nextInt();
		
		int s = a + b;
		System.out.println("Total = "+s);
		
	}

}
