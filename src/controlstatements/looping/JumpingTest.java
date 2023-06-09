package controlstatements.looping;

public class JumpingTest {
	
	/*
	 *   =============== jumping statements =========
	 *   a> break;     : exit from loop
	 *   b> continue;  : skip values
	 *   c> return;    : exit from method
	 */
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i == 5 || i == 8) {
				//break;
				//continue;
				return;
			}
			
			System.out.println(i);
		}
		
		System.out.println("End loop");
		
		/*
		 *   Q> WAP to check given number is prime or not?
		 *   Q> WAP to print prime numbers between given range?
		 *   Q> WAP to count prime number in given range?
		 */
		
	}

}
