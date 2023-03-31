import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
	public static void test1() {
		System.out.println("@BeforeClass");

	}
	
@Before
public void test02() {
	System.out.println("@Before");

}
@AfterClass
public static void test03() {
	System.out.println("@AfterClass");

}

@After
public void test04() {

	System.out.println("@After");
	
}
	
@Test
public void test05() {
System.out.println("@Test");
}
	


}
