package com.seektest.controller;

import java.util.ArrayList;
import java.util.logging.Level;

import javax.xml.bind.JAXBException;

import com.sun.istack.internal.logging.Logger;

import Utils.Constant;
import model.Advertising;
import model.Customer;
import model.CustomerEnum;
import model.Deal;
import model.Discount;
import model.Product;
import services.ProductService;

/**Class to build advertising
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public class AdBuilderImpl implements Ad{
	
	private Customer customerLogado; 
	private ProductService productService;
    public static Logger logger;
	public  AdBuilderImpl(){
		
	}

	public Customer getAd(CustomerEnum customerEnum){

		try {
		productService = new ProductService();
		customerLogado =  new Customer();	
		
		this.getFilterProducts(customerEnum);
			customerLogado.setTotal(this.PriceLiquid() -(this.deal(customerEnum)+ this.discount()));
			logger.log(Level.INFO, Constant.INFO_CODE_TOTALS, Constant.INFO_MENSAGE_TOTALS);
		
		} catch (JAXBException e) {
			logger.log(Level.SEVERE, Constant.ERROR_CODE_TOTALS, Constant.ERROR_MENSAGE_TOTALS);
			e.printStackTrace();
		}
		
		return customerLogado;
		
	}
	
	private double deal(CustomerEnum customerEnum) throws JAXBException{
		int count =0;
		double priceDeal=0;
		for(Product prod:  customerLogado.getProduct() ){
			for(Deal deal: productService.getAdvertising().getDeal()){
				if(prod.getProductType()==deal.getProductType()){
					count++;
					if(count==deal.getGetsforProduct()){
						priceDeal += prod.getPrice()* deal.getGetsforProduct();
						count=0;
					}
					
				}
				
			}
			
		}
	return priceDeal;
	}
	
	private double discount() throws JAXBException{
		
		int count=0;
		double priceDiscount=0;
		
		//discount
		for( Product prod: customerLogado.getProduct() ){
			for(Discount disc: productService.getAdvertising().getDiscount()){
					if(prod.getProductType()==disc.getProductType()){
						count++;
						if(count== disc.getMin()){
							priceDiscount += disc.getPrice();
							count=0;
						}
					}
					
				}
		}
	return priceDiscount;
	}
	

	private void getFilterProducts(CustomerEnum customerEnum) throws JAXBException{
		for(Customer cust:productService.getCostumer()){
			if(customerEnum == cust.getName()){
				customerLogado.setName(customerEnum);
				customerLogado.setProduct(cust.getProduct());
			}
		}
	}
	
	private double PriceLiquid(){
	double priceTotal = 0;	
		for( Product prod: customerLogado.getProduct() ){
		priceTotal+= prod.getPrice();
		}
		return priceTotal ; 
	}
}
