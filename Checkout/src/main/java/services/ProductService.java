package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.sun.istack.internal.logging.Logger;

import model.Advertising;
import model.Customer;
import model.Deal;
import model.Discount;
import model.Product;
import Utils.ConnectRest;
import Utils.Constant;


/**Class to build advertising
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */

public class ProductService implements ProductServiceInterface{
	
	private Product product;
	private static BufferedReader br;
	public static Logger logger;
	public Customer customer;	
	public ArrayList<Customer> customerList;
	public ArrayList<Deal> deal;
	public Advertising advertising;
	public ArrayList<Discount> discount;
	
	
	public ProductService(){}

	
	public ArrayList<Customer> getCostumer()throws JAXBException{
		
		try {
			customerList = new ArrayList<Customer>();
			br = ConnectRest.connect(Utils.Constant.URL_API_COSTUMER);
						
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			customerList.add((Customer) jaxbUnmarshaller.unmarshal(br));
		
		    ConnectRest.disconnect();				
		    logger.log(Level.INFO, Constant.INFO_CODE_API_PRODUCTS, Constant.INFO_MENSAGE_API_PRODUCTS);

		} catch (Error e) {

		    logger.log(Level.SEVERE, Constant.ERROR_CODE_API_PRODUCTS, Constant.ERROR_MENSAGE_API_PRODUCTS);
			e.printStackTrace();
		}
			
	return customerList;
}
	
	
	public Product getProduct()throws JAXBException{
		
			try {
				//acrescentar filtros do cliente
				br = ConnectRest.connect(Utils.Constant.URL_API_PRODUCT);
							
				JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);

				javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				product = (Product) jaxbUnmarshaller.unmarshal(br);
				
			    ConnectRest.disconnect();				
			    logger.log(Level.INFO, Constant.INFO_CODE_API_PRODUCTS, Constant.INFO_MENSAGE_API_PRODUCTS);

			} catch (Error e) {

			    logger.log(Level.SEVERE, Constant.ERROR_CODE_API_PRODUCTS, Constant.ERROR_MENSAGE_API_PRODUCTS);
				e.printStackTrace();
			}
			return product;
	}
	
	public Advertising getAdvertising()throws JAXBException{
		
		advertising.setDeal(this.getDeal());
		advertising.setDiscount(this.getDiscount());
		
		return advertising;
	}

	public ArrayList<Deal> getDeal()throws JAXBException{
	
		try {

			//API DEAL
			br = ConnectRest.connect(Utils.Constant.URL_API_DEAL);
			JAXBContext jaxbContext = JAXBContext.newInstance(Deal.class);

			javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			deal.add((Deal) jaxbUnmarshaller.unmarshal(br));

		    ConnectRest.disconnect();				
		    logger.log(Level.INFO, Constant.INFO_CODE_API_DEAL, Constant.INFO_MENSAGE_API_DEAL);
			
			} catch (Error e) {
			    logger.log(Level.SEVERE, Constant.ERROR_CODE_API_DEAL, Constant.ERROR_MENSAGE_API_DEAL);
				e.printStackTrace();
		}
		
		return deal;

	}
	public ArrayList<Discount> getDiscount()throws JAXBException{
		
		try {

			//API DEAL
			br = ConnectRest.connect(Utils.Constant.URL_API_DISCOUNT);
			JAXBContext jaxbContext = JAXBContext.newInstance(Discount.class);

			javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			discount.add((Discount) jaxbUnmarshaller.unmarshal(br));

		    ConnectRest.disconnect();				
		    logger.log(Level.INFO, Constant.INFO_CODE_API_DISCOUNT, Constant.INFO_MENSAGE_API_DISCOUNT);
			
			} catch (Error e) {
			    logger.log(Level.SEVERE, Constant.ERROR_CODE_API_DISCOUNT, Constant.ERROR_MENSAGE_API_DISCOUNT);
				e.printStackTrace();
		}
		
		return discount;

	}


}
