package entities;

public class Answer {
	public String aluno;
	public double tri1;
	public double tri2;
	public double tri3;

	public double finalGrade() {
		return tri1 + tri2 + tri3;
	}
	public double pontosFaltando() {
		if (finalGrade() < 60) {
			return 60 - finalGrade();
		} else {
			return 0;
		}
	}

}
