import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
					
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
					 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 3333;
		int b = 1111;
					
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
					 
		int expected = 2222;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiple() {
		int a = 10;
		int b = 20;
					
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
					 
		int expected = 200;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 4444;
		int b = 1111;
					
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
					 
		int expected = 4;
		assertEquals (expected, actual);
	}
}
