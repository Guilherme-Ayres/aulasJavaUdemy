package entities;

public class pessoaJuridica extends anualIncome {

	private Integer employee;

	public pessoaJuridica() {
	}

	public pessoaJuridica(String name, Double anualIncome, Integer employee) {
		super(name, anualIncome);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public Double calc() {
		if (employee < 10) {
			return super.getAnualIncome() * 0.16;
		} else {
			return super.getAnualIncome() * 0.14;
		}
	}

}
