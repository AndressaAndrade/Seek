package model;

/**Privileged enum
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */

public enum CustomerEnum {
	
	UNILEVER("UNILEVER"), 
	
	APPLE("APPLE"), 
	
	NIKE("NIKE"), 
	
	FORD("FORD"), 
	
	DEFAULT("DEFAULT");
	
	private String name;
	
	private CustomerEnum(String name){
		this.name=name;
	}

}
