package streamswithcollections;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService{
	
	@Override
	public Set<String> getUniqueSurnames(List<Author> authorList) {
		return authorList.stream().map(a->a.getSurname()).collect(Collectors.toSet());
	}

	@Override
	public List<Author> getAuthorsByCity(List<Author> authorList, String city) {
		return authorList.stream().filter(a->a.getCity().equals(city)).collect(Collectors.toList());
	}

	@Override
	public double femaleAverageAge(List<Author> authorList) {
		LocalDate date= LocalDate.now();
		return authorList.stream().filter(a->a.getGender().equals("Female"))
				.mapToInt(a->Period.between(a.getBirthdate(), date).getYears()).average().orElse(0.0);
		
	}

	@Override
	public Long getMobileByAdhar(List<Author> authorList, Long adharCard) {
		
		return authorList.stream().filter(x->x.getAdharCard().equals(adharCard)).map(Author::getMobile).findFirst().orElse(0L);
	}
	public static void main(String []pss) {
		//List<>
		List<Author> al=  Arrays.asList(
                new Author(123456789L, "S", "A", "I", LocalDate.of(2001, 1, 17), "Male", "Guntur", 1234567890L),
                new Author(987654321L, "P", "S", "S", LocalDate.of(2005, 5, 15), "Female", "Ongole", 9876543210L),
                new Author(456789123L, "W", "E", "S", LocalDate.of(2002, 3, 20), "Female", "Ponnur", 4567891230L),
                new Author(321654987L, "B", "M", "J", LocalDate.of(2006, 7, 30), "Male", "BZA", 3216549870L),
                new Author(3216549L, "P", "S", "J", LocalDate.of(2005, 6, 20), "Male", "Guntur",89216549870L));
		AuthorServiceImpl asl= new AuthorServiceImpl();
		System.out.println("Unique surnames");
		System.out.println(asl.getUniqueSurnames(al));
		System.out.println("By cities");
		System.out.println(asl.getAuthorsByCity(al, "Guntur"));
		System.out.println("Female Avg age");
		System.out.println(asl.femaleAverageAge(al));
		System.out.println("By Adhaar");
		System.out.println(asl.getMobileByAdhar(al, 123456789L));
	
	}

}
