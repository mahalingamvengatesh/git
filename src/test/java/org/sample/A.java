package org.sample;

import org.testng.annotations.Test;

public class A {
	@Test(priority=-17)
	private void tc1() {
      System.out.println("test case 1");
	}
	@Test(priority=2)
    private void tc2() {
     System.out.println("test case 2");
	}
	@Test(priority=9)
    private void tc3() {
     System.out.println("test case 3");
	}




}
