package Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
	static ArrayList<Products> productList =  new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	String addProduct(Products p) {
		productList.add(p);
		return "Product Added Successfully.";
	}
	boolean deleteProduct(Products p) {
		boolean flag=false;
		for(Products x:productList) {
			if (x.equals(p)) {
				productList.remove(p);
				flag=true;
			}
		}
		return flag;
	}
	void updateProduct(Integer id) {
		for(Products x:productList) {
			if(x.id.equals(id)) {
				System.out.println("Enter qty and price to be updated respectively.\n");
				x.setQty(sc.nextInt());
				x.setPrice(sc.nextDouble());
				System.out.println(x);
			}
			else
				System.out.println("Product not found.\n ");
		}
	}
	void listProducts() {
		if(!productList.isEmpty())
			productList.forEach(System.out::println);
		else
			System.out.println("Empty Inventory");
	}
	void getProduct(Integer id) {
		for(Products x:productList) {
			if(x.id.equals(id))
				System.out.println(x);
	}
		}
}
