package model;

/**Product Type Enum
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public enum ProductsType {
	
	CLASSIC("CLASSIC", "CLASSIC AD"), 
	
	STANDOUT("STANDOUT", "STANDOUT AD"),

	PREMIUN("PREMIUN", "PRMIUN AD");

	private String id;
	private String name;
	
	ProductsType(String id, String name){
		this.id = id;
		this.name= name;
		
	}
}
