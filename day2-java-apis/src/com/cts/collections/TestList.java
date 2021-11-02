package com.cts.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// Store list of products in the ArrayList
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(100, "Laptop", 82000));
		productsList.add(new Product(300, "Iphone", 132000));
		productsList.add(new Product(200, "Refrigerator", 12000));
		productsList.add(new Product(200, "Refrigerator", 12000));
		productsList.add(new Product(500, "Washing Machine", 29000));
		productsList.add(new Product(400, "TV", 42000));
		// finding the size of list
		System.out.println("Size: "+productsList.size());
		printItemsInList(productsList);
		// finding the products based on the id or name
		String itemName = "Iphone";
		boolean status = false;
		for(Product p : productsList) {
			if(p.getName().equals(itemName)) {
				status = true;
				break;
			}
		}
		if(status)
			System.out.println(itemName+" found");
		else
			System.out.println(itemName+" not found");
	}
	public static void printItemsInList(List<Product> list) {
		// iterating the list using 
		for(Product product : list)
			System.out.println(product);
		System.out.println("---------------------");
	}
	
}
