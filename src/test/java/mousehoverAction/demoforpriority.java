package mousehoverAction;

import org.testng.annotations.Test;

public class demoforpriority {

	
	@Test()
	public void B() {
		System.out.println("m1 method");
	}
	
	@Test(invocationCount = 3)
	public void C() {
		System.out.println("m2 method");		
	}
	
	@Test()
	public void D() {
		System.out.println("m3 method");
	}
	
	@Test()
	public void A() {
		System.out.println("m4 method");
	}
}
