package Caluclations;

import java.util.Scanner;

class NaturalNumberException extends Exception{
	NaturalNumberException(String msg){
		super(msg);
	}
}
public class AverageCaluclator {
	public static double calAverage(double n) throws NaturalNumberException{
		if(n<=0)
			throw new NaturalNumberException(n+" is not a natural number.");
		double avg=0.0;
		for(double i=1;i<=n;i++)
			avg+=i;
		return avg/n;
			
	}
	public static void main(String []args)throws NaturalNumberException{
		Scanner sc = new Scanner(System.in);
		try {
			double n;
			n=sc.nextDouble();
			System.out.println(calAverage(n)); 
		}
		catch(NaturalNumberException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
