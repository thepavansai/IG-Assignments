package streamswithcollections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithStrings {
	public static String palindrome(String w) {
		StringBuffer sb=new StringBuffer(w);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		List<String> s=Arrays.asList("phantom","darkknight","batman","daredevil","loneranger");
		s.stream().map(x->x.length()).forEach(n->System.out.print(n+" "));
		System.out.println("\nUpperCase");
		s.stream().map(x->x.toUpperCase()).forEach(str->System.out.print(str+" "));
		System.out.println("\nSorted");
		s.stream().sorted().forEach(x->System.out.print(x+"\t"));
		System.out.println("\nDesc order based on length");
		Comparator<String> c=(s1,s2)->s1.length()-s2.length();
		s.stream().sorted(c).forEach(n->System.out.println(n));
		String name="insightglobal";
		Map<Character,Long> freq= name.chars().mapToObj(ci->(char)ci).collect(Collectors.groupingBy(k->k,Collectors.counting()));
		freq.forEach((k,v)->System.out.println(k+" "+v));
		List<String> pal=Arrays.asList("pip","madam","lirll","tomato","apple","pop");
		pal.stream().filter(x->palindrome(x).equals(x)).sorted(c).limit(1).forEach(System.out::println);
		
		
		
	}

}
