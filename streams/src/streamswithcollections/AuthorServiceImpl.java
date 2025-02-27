package streamswithcollections;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.OptionalDouble;
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
		
		return null;
	}
	public static void main(String []pss) {
		//List<>
	}

}