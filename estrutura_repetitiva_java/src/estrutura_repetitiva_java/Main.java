package estrutura_repetitiva_java;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 5;
		int y = 0;
		while (x > 2) {
			System.out.print(x);
			y = y + x;
			x = x - 1;

		}

		sc.close();
	}
}