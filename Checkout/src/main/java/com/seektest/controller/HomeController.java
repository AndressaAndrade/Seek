package com.seektest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Advertising;
import model.Customer;
import model.CustomerEnum;
import model.Product;


/**Class to controller viewModel
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public class HomeController {

	Advertising advertising ; 
	Ad ad ;
	CustomerEnum costumer;
	HttpSession httpSession;
	Customer customer;
	
	public  HomeController(){}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public void checkoutView(Model m){
		String prodName="";
		costumer = (CustomerEnum)httpSession.getAttribute("COSTUMER");
		if(costumer==null){
			costumer = CustomerEnum.DEFAULT;
		}
			
		ad = new AdBuilderImpl();
		customer= ad.getAd(costumer);
		
		
		m.addAttribute("Costumer name: ", customer.getName());
		
		for(Product prod: customer.getProduct() ){
			prodName.concat(prod.getProductType()+", ");	
		}
		m.addAttribute("ID added:  ", prodName);
				
				
		m.addAttribute("Total expected", customer.getTotal());
	
		
	}
	

}
