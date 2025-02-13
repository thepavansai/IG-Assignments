package stackexceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Stack;
class StackException extends Exception{
	StackException(String msg){
		super(msg);
	}
}
class ContactException extends Exception{
	ContactException(String msg){
		super(msg);
	}
}

public class StackMain {
	Stack<Contact> contacts = new Stack<>();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	void push(Contact c) throws StackException,ContactException {
		LocalDate currentDate = LocalDate.now();
		LocalDate dob = LocalDate.parse(c.dob, formatter);
        long age = ChronoUnit.YEARS.between(dob, currentDate);
		if (age<0 || 
				c.getFirstName().length()>8 || 
				c.getLastName().length()>8 || 
				c.getMiddleName().length()>8 ||
				c.mobileNumber.length()!=10 ||
				!(c.mobileNumber.charAt(0)=='7'||
				c.mobileNumber.charAt(0)=='6'||
				c.mobileNumber.charAt(0)=='8'||
				c.mobileNumber.charAt(0)=='9')||
				!c.mobileNumber.matches("\\d+")
				)
			throw new ContactException("Invalid contact details.");
		if(contacts.size()==2) {
			throw new StackException("Stack is Full");
		}
		contacts.push(c);
	}
	void pop() throws StackException{
		if(contacts.empty())
			throw new StackException("Stack is Empty.");
		System.out.println(contacts.pop());
		
	}
	public static void main(String[] args) throws Exception {
		 StackMain s= new StackMain();
		 try {
		 s.push(new Contact("Alice", "A", "Smith", "1990-01-01", "Female", "7894561230"));
         s.push(new Contact("Bob", "B", "Brown", "1985-05-15", "Male", "6789012345"));
         s.push(new Contact("Charlie", "C", "Johnson", "1980-03-20", "Male", "6790182345"));
         s.pop();
         s.pop();
         s.pop();
		 }
		 catch(ContactException | StackException e) {
			 System.out.println(e.getMessage());		 
		}

	}

}
