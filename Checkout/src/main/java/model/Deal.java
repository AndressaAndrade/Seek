package model;

/**Deal Entity
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public class Deal {

	private String id;
	private CustomerEnum customerEnum;;
	private int getsforProduct;
	private int forProduct;
	private ProductsType productType;
	
	public Deal(){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


	public ProductsType getProductType() {
		return productType;
	}


	public void setProductType(ProductsType productType) {
		this.productType = productType;
	}
	

	public CustomerEnum getCustomerEnum() {
		return customerEnum;
	}

	public void setCustomerEnum(CustomerEnum customerEnum) {
		this.customerEnum = customerEnum;
	}

	public int getGetsforProduct() {
		return getsforProduct;
	}

	public void setGetsforProduct(int getsforProduct) {
		this.getsforProduct = getsforProduct;
	}

	public int getForProduct() {
		return forProduct;
	}

	public void setForProduct(int forProduct) {
		this.forProduct = forProduct;
	}

	
	
}
