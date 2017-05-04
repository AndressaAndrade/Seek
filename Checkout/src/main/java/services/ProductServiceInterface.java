package services;

import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import model.Customer;
import model.Deal;
import model.Discount;
import model.Product;

public interface ProductServiceInterface {


	public Product getProduct()throws JAXBException;

	public ArrayList<Deal> getDeal()throws JAXBException;
	
	public ArrayList<Customer> getCostumer()throws JAXBException;


	public ArrayList<Discount> getDiscount()throws JAXBException;
}
