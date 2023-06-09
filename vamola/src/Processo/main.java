package Processo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class main {

	public main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		LocalTime horarioAtual = LocalTime.now();

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date data = sdf.parse(sc.next());

		Cliente c = new Cliente(name, email, data);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String statuss = sc.next();
		OrderStatus status = OrderStatus.valueOf(statuss);
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		List<OrderItem> orderItems = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();

			Product product = new Product(productName, productPrice, productQuantity);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

			orderItem.setProduct(product);
			orderItems.add(orderItem);
		}

		System.out.println("Order summary: ");
		System.out.println("Order moment: " + horarioAtual);
		System.out.println("Order Status: " + status);
		System.out.println("Cliente: " + c.getName() + " (" + sdf.format(c.getBirthDate()) + ") - " + c.getEmail());
		System.out.println("Order items: ");
		for (OrderItem orderItem : orderItems) {
			Product product = orderItem.getProduct();
			System.out.println(product.getName() + ", $" + product.getPrice() + ", Quantity: " + orderItem.getQuantity()
					+ ", Subtotal: $" + orderItem.getTotal());
		}
		double totalPrice = calcularPrecoTotal(orderItems);
		System.out.println("Total price: $" + totalPrice);

		sc.close();
	}

	public static double calcularPrecoTotal(List<OrderItem> orderItems) {
		double total = 0.0;
		for (OrderItem orderItem : orderItems) {
			total += orderItem.getTotal();
		}
		return total;

	}
}