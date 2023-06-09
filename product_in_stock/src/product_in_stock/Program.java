package product_in_stock;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Product product = new Product();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product Data: " + product);
		
		System.out.println("Enter the number of products to be added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Product Data: " + product);
		
		
		
		sc.close();
	}

}
