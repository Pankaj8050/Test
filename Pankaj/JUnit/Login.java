package junitpackage;
public class Login {

	private String username,password;
		

		
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	public boolean checkLogin() {
		if(getUsername().equals("admin")  && getPassword().equals("admin123")) {
			return true;
		}
		else {
			return false;
		}
	}
}
