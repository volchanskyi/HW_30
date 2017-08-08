package core;
import org.junit.*;

public class JUnitTest {

	@BeforeClass public static void beforeClass() {System.out.println("Before Class");}
	@Before public void before() {System.out.println("Before Test");}
	
	@Test public void test_01() {System.out.println("Test # 01");}

	@Test public void test_02() {System.out.println("Test # 02");}

	@Test public void test_03() {System.out.println("Test # 03");}

	@Test public void test_04() {System.out.println("Test # 04");}
	
	@After public void after() {System.out.println("After Test");}
	@AfterClass public static void afterClass() {System.out.println("After Class");}
	
	

}
