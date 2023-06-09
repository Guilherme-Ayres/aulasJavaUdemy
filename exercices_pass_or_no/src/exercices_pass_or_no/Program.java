package exercices_pass_or_no;
import java.util.Locale;
import java.util.Scanner;

import entities.Answer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Answer notas = new Answer();
		System.out.print("Nome aluno: ");
		notas.aluno = sc.next();
		System.out.println("Informe as notas dos 3 trimestres do aluno abaixo: ");
		notas.tri1 = sc.nextInt();
		notas.tri2 = sc.nextInt();
		notas.tri3 = sc.nextInt();
		System.out.printf("Nota final: %.2f%n", notas.finalGrade());
		
		if (notas.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", notas.pontosFaltando());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
