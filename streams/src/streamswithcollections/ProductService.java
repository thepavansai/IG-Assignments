package streamswithcollections;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class ProductService{
	// list Highest priced product
	public Product highestPrice(List<Product> plist) {
		return plist.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(null);
		
	}
	//list lowest priced product
	public Product lowestPrice(List<Product> plist) {
		return plist.stream().min(Comparator.comparingDouble(Product::getPrice)).orElse(null);
		
	}
	
   	//list  product that already expired
	public List<Product> aLreadyExpiredProduct(List<Product>plist) {
		return plist.stream().filter(p->p.getExpiryDate().isBefore(LocalDate.now())).collect(Collectors.toList());
	}
 
 	 //list product names list that will expire in next 10 days
	public List<Product> Expirein10DaysProduct(List<Product>plist) {
		return plist.stream().filter(p->p.getExpiryDate().isBefore(LocalDate.now().plusDays(10))&& p.getExpiryDate().isAfter(LocalDate.now())).collect(Collectors.toList());
	}

 	 // display count of  products of different types
	public Long diffProducts(List<Product> plist) {
		return (long) plist.stream().map(Product::getType).collect(Collectors.toSet()).size();
	}
	public static void main(String []pss) {
		List<Product> products = Arrays.asList(
		        new Product(1, "Paneer", "Dairy", 1.0, 80.0, LocalDate.now().minusDays(5)), // Expired
		        new Product(2, "Basmati Rice", "Grains", 2.0, 120.0, LocalDate.now().plusDays(30)), // Not expired
		        new Product(3, "Aloo", "Vegetable", 5.0, 20.0, LocalDate.now().plusDays(15)), // Not expired
		        new Product(4, "Curd", "Dairy", 1.0, 50.0, LocalDate.now().plusDays(3)), // Will expire in 3 days
		        new Product(5, "Samosa", "Snacks", 10.0, 15.0, LocalDate.now().minusDays(1)), // Expired
		        new Product(6, "Chai Masala", "Spices", 0.5, 100.0, LocalDate.now().plusDays(60)), // Not expired
		        new Product(7, "Tomato", "Vegetable", 3.0, 25.0, LocalDate.now().plusDays(7)), // Will expire in 7 days
		        new Product(8, "Mango Pickle", "Condiment", 1.0, 150.0, LocalDate.now().plusDays(90)), // Not expired
		        new Product(9, "Bread", "Bakery", 2.0, 30.0, LocalDate.now().plusDays(5)), // Will expire in 5 days
		        new Product(10, "Lassi", "Dairy", 1.0, 40.0, LocalDate.now().minusDays(2)) // Expired
		    );
		 	ProductService productService= new ProductService();
			System.out.println("Highest priced product: \n" + productService.highestPrice(products));
		    System.out.println("\nLowest priced product: \n" + productService.lowestPrice(products));
		    System.out.println("\nAlready expired products: \n" + productService.aLreadyExpiredProduct(products));
		    System.out.println("\nProducts expiring in the next 10 days: \n" + productService.Expirein10DaysProduct(products));
		    System.out.println("\nCount of different product types: " + productService.diffProducts(products));
		 
		
	}

}
