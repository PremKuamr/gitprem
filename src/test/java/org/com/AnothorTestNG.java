package org.com;

import org.testng.annotations.Test;

public class AnothorTestNG {
	@Test(priority=-18)
	private void m02() {
		System.out.println("@test2");

	}
	@Test(priority=0)
	private void m01() {
		System.out.println("@test1");

	}
	@Test(priority=-15)
	private void m04() {
		System.out.println("@test04");

	}
	@Test(priority=12,invocationCount=3)
	private void m03() {
		System.out.println("@test03");

	}
}
