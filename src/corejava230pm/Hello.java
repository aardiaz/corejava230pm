package corejava230pm;

import javax.swing.JOptionPane;

public class Hello {
	
	/*
	 * =========================== Access Modifiers ===========================
	 *  public        : access everywhere
	 *  protected     : access in class,same package and child class in different package.
	 *  default(package private) : access in class and same package.
	 *  private       :  access in class only
	 */
	
	 public static final  void  main(String... args) {
		
		System.out.println("Hello");
		JOptionPane.showMessageDialog(null, "hello");
	}
	
	 
}