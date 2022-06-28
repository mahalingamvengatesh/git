package org.sample;

import org.testng.annotations.Test;

public class C {
	@Test(priority=5)
	private void tc111() {
      System.out.println("test case 111");
	}
	@Test(priority=-8)
    private void tc112() {
     System.out.println("test case 112");
	}
    private void tc113() {
     System.out.println("test case 113");
	}
}
