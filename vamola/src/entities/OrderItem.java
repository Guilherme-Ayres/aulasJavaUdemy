package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getTotal() {
		return quantity * price;
	}

	public String toString() {
		return ", Subtotal: $" + getTotal();
	}
}
