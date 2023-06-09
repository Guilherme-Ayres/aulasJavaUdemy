package dollar_exercices;

import java.util.Locale;
import java.util.Scanner;

import util.converter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor do dollar: ");
		double dollar = sc.nextDouble();
		System.out.print("Quantos dollares serão comprados? ");
		double montante = sc.nextDouble();
		System.out.printf("Valor em reais: %.2f%n", converter.conversor(dollar, montante));
		
		sc.close();
	}

}
