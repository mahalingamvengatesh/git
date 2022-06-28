package org.sample;

import org.testng.annotations.Test;

public class B {
	@Test
	private void tc11() {
      System.out.println("test case 11");
	}
	@Test(priority=-3)
    private void tc12() {
     System.out.println("test case 12");
	}
	@Test(priority=5)
    private void tc13() {
     System.out.println("test case 13");
	}
}
