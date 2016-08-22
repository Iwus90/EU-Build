package be.bt.domain;

import javax.persistence.Entity;

@Entity
public class Worker extends User {

	private String skills;
	private boolean commodity;
	

	
	public Worker(String skills, boolean commodity) {
		super();
		this.skills =skills;
		this.commodity = commodity;
	}



	public String getSkills() {
		return skills;
	}



	public void setSkills(String skills) {
		this.skills = skills;
	}



	public boolean isCommodity() {
		return commodity;
	}



	public void setCommodity(boolean commodity) {
		this.commodity = commodity;
	}



	@Override
	public String toString() {
		return "Worker [skills=" + skills + ", commodity=" + commodity + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getLogin()="
				+ getLogin() + ", getPassword()=" + getPassword() + ", geteMail()=" + geteMail() + ", toString()="
				+ super.toString() + "]";
	}
	
		
}
