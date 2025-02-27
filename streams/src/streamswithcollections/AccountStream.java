package streamswithcollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AccountStream {
	public static void main(String []pss) {
		List<Account> acc= Arrays.asList(new Account("Tommy", 1345, 999.99),new Account("John", 69, 500.69),new Account("Wick", 666,1000.69),new Account("Bruce",1,999999.99));
		acc.stream().map(a->a.name).forEach(n->System.out.println(n));
		List<Double> bal= acc.stream().map(x->x.balance+500).collect(Collectors.toList());
		System.out.println(bal);
	}
}

