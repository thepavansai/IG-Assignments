import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeList {
	Set<Employee> emp;
	public EmployeeList() {
		emp= new TreeSet<>(Comparator.comparingInt(Employee::getEmpid));
	}
	public void addEmployee(Employee e) {
		emp.add(e);
	}
	public void dispEmp() {
		for(Employee x:emp) {
			System.out.println(x);
		}
	}
}
