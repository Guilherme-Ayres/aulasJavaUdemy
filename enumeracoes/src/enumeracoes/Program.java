package enumeracoes;

import java.util.Date;

import entities.Order;
import entities.enums.OrdemStatus;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrdemStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrdemStatus os1 = OrdemStatus.DELIVERED;
		OrdemStatus os2 = OrdemStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);
	}

}
