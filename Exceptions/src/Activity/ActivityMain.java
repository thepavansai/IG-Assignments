
public class ActivityMain {
	
	public boolean validate(Activity a) throws OperatorException {
		boolean flag=false;
		if(a.getString1()==null || a.getString2()==null)
			throw new NullPointerException("Null String is passed.");
		if(a.getOperator()!="+" && a.getOperator()!="-")
			throw new OperatorException(a.getOperator() +" Invalid Expression");
		else
			flag=true;
		return flag;
	}
	
	public String doOperation(Activity a) {
		if(a.getOperator()=="+")
			return a.getString1()+a.getString2();
		else
			return a.getString1().replace(a.getString2(),"");
	}
	public static void main(String[] args) throws OperatorException{
		Activity av= new Activity("Cati","i","-");
		ActivityMain am= new ActivityMain();
		try {
			if(am.validate(av))
				System.out.println(am.doOperation(av));
		}
		catch(OperatorException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
