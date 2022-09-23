package junitpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogin {

	@Test
	public void correctLogin() {
		Login login = new Login();
		login.setUsername("admin");
		login.setPassword("admin123");
		assertTrue(login.checkLogin());
	}
	
	@Test
	public void wrongLogin() {
		Login login = new Login();
		login.setUsername("ADMIN");
		login.setPassword("ADMIN123");
		assertFalse(login.checkLogin());
	}

}
