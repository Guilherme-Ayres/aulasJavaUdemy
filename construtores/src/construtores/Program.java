package construtores;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String Holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			product = new Product(number, Holder, initialDeposit);
		} else {
			product = new Product(number, Holder, 0);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(product);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		product.deposit(sc.nextDouble());
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(product);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		product.withdraw(sc.nextDouble());
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(product);

		sc.close();

	}

}
