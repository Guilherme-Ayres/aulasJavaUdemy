package exercicio_ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o valor da compra: ");
		double preco = 14.5	;
		double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;
		System.out.println(desconto);
		sc.close();
	}

}
