package model;

/**Product Entity
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public class Product {

	private ProductsType productType;
	private double price;
	private String description;

	public Product(){
		
	}
	
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public  String getDescription() {
		return description;
	}
	public  void setDescription(String description) {
		this.description = description;
	}


	public ProductsType getProductType() {
		return productType;
	}


	public void setProductType(ProductsType productType) {
		this.productType = productType;
	}
}
