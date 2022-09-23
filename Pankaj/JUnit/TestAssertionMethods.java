package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertionMethods {

	@Test
	public void testAssertions() {
		String str1 = new String("Welcome");
		String str2 = new String("Welcome");
		String str3 = "Hello";
		String str4 = "Hello";
		String str5 = null;
		
		int a=5;
		int b=5;
		
		assertEquals(str1, str2);
		
		assertTrue(a==b);
		
		//assertFalse(a==b);
		
		assertFalse(a>b);
		
		assertSame(str3, str4);
		
		assertNotSame(str1, str2);
		
		assertNull(str5);
		
		assertNotNull(str4);
		
		String arr1[] = {"one","two","three"};
		String arr2[] = {"one","two","three"};
		
		assertArrayEquals(arr1, arr2);
		
	}

}
