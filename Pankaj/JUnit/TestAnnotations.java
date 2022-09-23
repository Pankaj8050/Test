package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotations {

	@Test
	public void test() {
		System.out.println("in test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	
	@Before
	public void before() {
		System.out.println("before ");
	}

	@After
	public void after() {
		System.out.println("after ");
	}
	
	@Ignore
	public void ignore() {
		System.out.println("ignore ");
	}
}
