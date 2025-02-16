import java.util.Objects;

public class Student {
	String firstName;
	String lastName;
	Address adress;
	
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

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	public Student(String firstName, String lastName, Address adress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(adress, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(adress, other.adress) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress + "]";
	}
	
}
