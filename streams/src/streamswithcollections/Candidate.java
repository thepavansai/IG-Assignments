package streamswithcollections;

public class Candidate {
	String name,lang,city;
	Integer exp;
	public Candidate(String name, String lang, String city, Integer exp) {
		super();
		this.name = name;
		this.lang = lang;
		this.city = city;
		this.exp=exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", lang=" + lang + ", city=" + city + ", exp=" + exp + "]";
	}
	
	
	
	

}
