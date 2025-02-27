package streamswithcollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String []pss) {
		Stream s= Stream.of(1,3,5,7,9,11);
		s.forEach(x->System.out.print(x+" "));
		List<Integer> li=Arrays.asList(2,20,12,4,6,8,10,12,1,14,28,16,28,20);
		li.stream().forEach(System.out::println);
		System.out.println("Distinct Elements");
		li.stream().distinct().forEach(System.out::println);
		System.out.println("Less than 5");
		li.stream().skip(2).filter(x->x<=5).distinct().limit(2).forEach(System.out::println);//Skipping first 2 values
		System.out.println("Less than 5");
		li.stream().filter(x->x<=5).distinct().limit(2).forEach(System.out::println);// Not Skipping first 2 values
		System.out.println("Squares");
		li.parallelStream().limit(5).map(x->x*x).forEach(System.out::println);//squares
		System.out.println("Even number count");
		long count=li.stream().distinct().filter(x->x%2==0).count();//unique even numbers
		System.out.println(count);
		
		
	}
}
