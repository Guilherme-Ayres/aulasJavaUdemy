package exercicies_products;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Gross salary: ");
		product.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		product.tax = sc.nextDouble();
		
		System.out.println("Employee: " + product.name + ", $" + product.valorLiquido());
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		product.increaseSalary(porcentagem);
		System.out.printf("Updated data: " + product);

		sc.close();
	}

}
