package akash.collectionDemo;

public class Employee {

	private int eId;
	private String name;
	private String emailId;

	public Employee(int eId, String name, String emailId) {
		super();
		this.eId = eId;
		this.name = name;
		this.emailId = emailId;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
