package entities;

public class Products {
	public String name;
	public double grossSalary;
	public double tax;

	public double valorLiquido() {
		return grossSalary - tax;

	}

	public void increaseSalary(double porcentagem) {
		grossSalary += grossSalary * porcentagem / 100;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", valorLiquido());
	}
}
