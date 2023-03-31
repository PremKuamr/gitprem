package org.com;

import java.security.acl.Group;

import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class ClassC {
	@Test(groups="smoke")
	private void m02() {
		System.out.println("@test67");

	}
	@Test(groups= {"sanity","smoke"})
	private void m03() {
		
System.out.println("@test87");
	}


@Test
 private void m01() {
System.out.println("@Test12");

}
@Test(groups="smoke")
private void m04() {
System.out.println("@test34");

}

}
