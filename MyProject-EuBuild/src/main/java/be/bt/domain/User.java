/**
 * 
 */
package be.bt.domain;

/**
 * @author elitebook
 *
 */
public abstract class User {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String login;
	private String password;
	private String eMail;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", login="
				+ login + ", password=" + password + ", eMail=" + eMail + "]";
	}
	
	

}
