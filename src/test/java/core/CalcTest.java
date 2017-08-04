package core;


import static org.junit.Assert.*; import org.junit.Test;

public class CalcTest {
	
//	add 3 double methods (2, 3, 4 params)
	static double add(double a, double b) {return a+b;}
	static double add(double a, double b, double c) {return a+b+c;}
	static double add(double a, double b, double c, double d) {return a+b+c+d;}
	
	
//	subtract 3 double methods (2, 3, 4 params)
	static double sub(double a, double b) {return a-b;}
	static double sub(double a, double b, double c) {return a-b-c;}
	static double sub(double a, double b, double c, double d) {return a-b-c-d;}
	
	
//	multiply 3 double methods (2, 3, 4 params)
	static double mult(double a, double b) {return a*b;}
	static double mult(double a, double b, double c) {return a*b*c;}
	static double mult(double a, double b, double c, double d) {return a*b*c*d;}
	
	
//	divide 3 double methods (2, 3, 4 params)
	static double div(double a, double b) {return a/b;}
	static double div(double a, double b, double c) {return a/b/c;}
	static double div(double a, double b, double c, double d) {return a/b/c/d;}

	@Test // @Ignore
	public void test_01() {assertEquals("Not correct", div(90.0, 7.0), 12.9, 0.09);}
	@Test // @Ignore
	public void test_02() {assertEquals("Not correct", add(60.0, 5.0, 7.0), 72.0, 0.09);}
	@Test // @Ignore
	public void test_03() {assertEquals("Not correct", sub(100.0, 22.0), 78.0, 0.09);}
	@Test // @Ignore
	public void test_04() {assertEquals("Not correct", mult(9.0, 5.0, 2.0), 90.0, 0.09);}
	

}
