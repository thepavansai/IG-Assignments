import java.util.Objects;

public class Address {
	String state;
	String city;
	String country;
	String zipCode;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", country=" + country + ", zipCode=" + zipCode + "]";
	}
	public Address(String state, String city, String country, String zipCode) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, country, state, zipCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(state, other.state) && Objects.equals(zipCode, other.zipCode);
	}
	
}
