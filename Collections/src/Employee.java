import java.util.Objects;

public class Employee {
	int empid;
	String fisrtName;
	String lastName;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee(int empid, String fisrtName, String lastName) {
		super();
		this.empid = empid;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fisrtName=" + fisrtName + ", lastName=" + lastName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid, fisrtName, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empid, other.empid) && Objects.equals(fisrtName, other.fisrtName)
				&& Objects.equals(lastName, other.lastName);
	}
	
}
