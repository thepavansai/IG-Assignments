package streamswithcollections;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
		InterviewRepository rp= new InterviewRepository();
		List<Candidate> cl= rp.getCandidateList();
		Comparator<Candidate> cp=(c1,c2)->Integer.compare(c2.getExp(),c1.getExp());
		Comparator<Candidate> cc=(c1,c2)->c1.getCity().compareTo(c2.getCity());
		//System.out.println(cl);
		//list candidate names from Pune city
		printLine();
		System.out.println("List of Pune Candidates:");
		printLine();
		cl.stream().filter(x->x.city.equals("Pune")).forEach(n->System.out.println(n));
		printLine();

		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		printLine();
		Map<String,Long> ccity= cl.stream().collect(Collectors.groupingBy(
				Candidate::getCity,Collectors.counting()
				));
		ccity.forEach((k,v)->System.out.println(k+" \t"+v));
		
		printLine();
		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		printLine();
		Map<String,Long> ctech= cl.stream().collect(Collectors.groupingBy(
				Candidate::getLang,Collectors.counting()
				));
		ctech.forEach((k,v)->System.out.println(k+" \t"+v));
		printLine();
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		printLine();
		cl.stream().filter(x->x.exp==0).forEach(y->System.out.println(y));;
		//listing candidates with highest experience
		printLine();
		System.out.println("Sorted List of Candidates by Experience");
		printLine();
		cl.stream().sorted(cp).filter(x->x.getExp()!=0).forEach(System.out::println);
		//sort the candidates by city name
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
		printLine();
		cl.stream().sorted(cc).forEach(System.out::println);
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}