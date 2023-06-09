package exercices_fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo;
		retangulo = new Retangulo();
		System.out.println("Enter rectangle width and height: ");
		retangulo.a = sc.nextDouble();
		retangulo.b = sc.nextDouble();
		double areaRetangulo = retangulo.area();
		double perimetro = retangulo.perimetro();
		double diagonal = retangulo.diagonal();
		System.out.printf("Area = %.2f %n", areaRetangulo);
		System.out.printf("Perimetro = %.2f %n", perimetro);
		System.out.printf("Diagonal = %.2f %n", diagonal);
		
		
		sc.close();
	}

}
