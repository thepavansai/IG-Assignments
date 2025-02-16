import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class CityStateMap {
	HashMap<String,String> cityStateMap;
	public CityStateMap(){
		cityStateMap=new HashMap<>();
	}
	public void addCityState(String city,String state) {
		cityStateMap.put(city, state);
	}
	public void getState(String city) {
		System.out.println(cityStateMap.get(city));
	}
	public void getAllCities() {
		System.out.println(cityStateMap.keySet());
	}
	public void getAllStates() {
		System.out.println(cityStateMap.values());
	}
	public void getCitiesForState(String state) {
		for(Entry<String, String> x :cityStateMap.entrySet()) {
			if(x.getValue().equals(state))
				System.out.println(x.getKey());
		}
	}
	public void removeCitiesForState(String state) {
		cityStateMap.values().removeIf(value->value.equals(state));
	}
	public void readFromFile(String filename) throws IOException{
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;
			while((line=br.readLine())!=null) {
				String []pairs =line.split(",");
				if(pairs.length==2) {
					String city=pairs[0];
					String state=pairs[1];
					addCityState(city, state);
				}
			}
		}
	}
	public static void main(String []phantom) {
		CityStateMap csmap = new CityStateMap();
		try {
			csmap.readFromFile("sample.txt");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		csmap.addCityState("Guntur", "Andhra Pradesh");
		csmap.addCityState("Bengaluru", "Karnataka");
	    csmap.addCityState("Hyderabad", "Telangana");
	    csmap.addCityState("Visakhapatnam", "Andhra Pradesh");
	    csmap.addCityState("Vijayawada", "Andhra Pradesh");
	    csmap.addCityState("Amaravati", "Andhra Pradesh");
	    csmap.addCityState("Chennai", "Tamil Nadu");
		csmap.getCitiesForState("Andhra Pradesh");
		csmap.getState("Guntur");
		csmap.getAllCities();
		csmap.getAllStates();
	}
}
