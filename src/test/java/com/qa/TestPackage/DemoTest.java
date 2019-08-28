package com.qa.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void sum() {
		int a=10;
		int b=30;
		Assert.assertEquals(40, a+b);
		System.out.println("pass");
	}
	@Test
	public void sub() {
		int a=10;
		int b=30;
		Assert.assertEquals(20, b-a);
		System.out.println("pass");
	}
	@Test
	public void multiply() {
		int a=10;
		int b=30;
		Assert.assertEquals(300, a*b);
		System.out.println("pass");
	}
	@Test
	public void divide() {
		int a=10;
		int b=30;
		Assert.assertEquals(3, b/a);
		System.out.println("pass");
	}

}
