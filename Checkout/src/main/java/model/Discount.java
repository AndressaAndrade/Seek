package model;

/**Discount Entity
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public class Discount extends Deal{

	private double price;
	private int min;
	private ProductsType productType;
	
	public Discount(){}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	public ProductsType getProductType() {
		return productType;
	}


	public void setProductType(ProductsType productType) {
		this.productType = productType;
	}
	
}
