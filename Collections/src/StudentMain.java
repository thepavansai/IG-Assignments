import java.util.HashSet;

public class StudentMain {

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<>();
		Address ad1= new Address("Ap","Guntur","India","522001");
		Address ad2= new Address("Tg","Hyderbad","India","500000");
		Student s1= new Student("P","S",ad1);
		Student s2=new Student ("S","R",ad2);
		Student s3= new Student("P","S",ad1);
		Student s4= new Student("P","S",ad1);
		students.add(s1);
		students.add(s2);
		students.add(s3);//Duplicate Entries
		students.add(s4);
		students.forEach(System.out::println);

	}

}
