package model;

import java.util.ArrayList;

/**Advertising Entity
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public class Advertising {

	private ArrayList<Deal> deal;
	private ArrayList<Discount> discount;
	
	
	
	public Advertising(){
		
	}
	
	
	public ArrayList<Discount> getDiscount() {
		return discount;
	}

	public void setDiscount(ArrayList<Discount> discount) {
		this.discount = discount;
	}


	public ArrayList<Deal> getDeal() {
		return deal;
	}


	public void setDeal(ArrayList<Deal> deal) {
		this.deal = deal;
	}


}
