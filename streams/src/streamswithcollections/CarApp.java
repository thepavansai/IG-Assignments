package streamswithcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarApp implements CarService{
	@Override
	public double sumOfPrices(List<Car> carList) {
		return carList.stream().mapToDouble(Car::getPrice).reduce(0, Double::sum);
	}

	@Override
	public List<String> getCarNames(List<Car> carList) {
		
		return carList.stream().map(x->x.getCarName()).collect(Collectors.toList());
	}

	@Override
	public Set<String> getCarMakers(List<Car> carList) {
		
		return carList.stream().map(x->x.getCareMake()).collect(Collectors.toSet());
	}

	@Override
	public double getHighPricedCar(List<Car> carList) {
		
		return carList.stream().map(Car::getPrice).max(Double::compare).orElse(0.0);
	}

	@Override
	public Car getCarWithLowPricedCar(List<Car> carList) {
		return carList.stream().min(Comparator.comparingDouble(Car::getPrice)).orElse(null);
	
	}
	public static void main(String[] args){
		Car cars[]= {
						new Car("Maruti","Swift Dezire",810000.00),
						new Car("Hyundai","Verna",1100000.00),
						new Car("Toyota","Innova",2450000.00),
						new Car("Audi","Q3",4500000.00),
						new Car("McLaren","GT",37200000.00),
						new Car("McLaren","750S",59100000.00),
						new Car("Toyota","GR Supra",8500000.00)
					};

		List<Car> carList = new ArrayList<>(Arrays.asList(cars));
		CarApp ca= new CarApp();
		System.out.println("Sum of Prices");
		System.out.println(ca.sumOfPrices(carList));
		System.out.println("Car Names");
		System.out.println(ca.getCarNames(carList));
		System.out.println("Car Makers Names");
		System.out.println(ca.getCarMakers(carList));
		System.out.println("Highest priced car Price ");
		System.out.println(ca.getHighPricedCar(carList));
		System.out.println("cheapest Car");
		System.out.println(ca.getCarWithLowPricedCar(carList));
	}
	

}