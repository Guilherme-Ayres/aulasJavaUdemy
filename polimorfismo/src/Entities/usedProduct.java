package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class usedProduct extends Product {

	private LocalDate manuFactureDate;

	public usedProduct(String name, Double price, LocalDate manuFactureDate) {
		super(name, price);
		this.manuFactureDate = manuFactureDate;
	}

	public LocalDate getManuFactureDate() {
		return manuFactureDate;
	}

	public void setManuFactureDate(LocalDate manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}

	@Override
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f",	getPrice()) 
		+ "(ManuFacture date: " + manuFactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}