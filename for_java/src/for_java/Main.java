package for_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		while (senha != 2269) {
			System.out.println("Senha incorreta! Tente novamente:");
			senha = sc.nextInt();
		}
		System.out.println("Bem vindo!");

		sc.close();
	}
}