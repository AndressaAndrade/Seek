import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import model.Customer;
import model.CustomerEnum;
import model.Product;
import model.ProductsType;
import services.ProductService;

public class ProductServiceTest {

	ProductService productService; 
	ArrayList<Customer> customer;
	ArrayList<Product> product;
		

		
		@Test
		public void test() throws JAXBException{
			Mockito.when(productService.getCostumer()).thenReturn(customer);
		
		}
	
				
		public ArrayList<Customer> mockCostumer(){
		
			
			Product product1 = new Product();
			product1.setProductType(ProductsType.CLASSIC);
			product1.setPrice(269.99);
			product1.setDescription("Offers the most basic level of advertisement");
			product.add( product1);
			
			
			Customer cust = new Customer(); 
			cust.setName(CustomerEnum.DEFAULT);
			cust.setProduct(product);
			cust.setTotal(987.97);
			customer.add(cust);
			
			customer.get(0).setName(CustomerEnum.DEFAULT);
			customer.get(0).setProduct(this.mockProduct(CustomerEnum.DEFAULT));
			customer.get(0).setTotal(987.97);

			customer.get(1).setName(CustomerEnum.UNILEVER);
			customer.get(1).setProduct(this.mockProduct(CustomerEnum.UNILEVER));
			customer.get(1).setTotal(934.97);
			

			customer.get(2).setName(CustomerEnum.APPLE);
			customer.get(2).setProduct(this.mockProduct(CustomerEnum.APPLE));
			customer.get(2).setTotal(1294.96);
			

			customer.get(3).setName(CustomerEnum.NIKE);
			customer.get(3).setProduct(this.mockProduct(CustomerEnum.NIKE));
			customer.get(3).setTotal(1519.96 );
			
			return customer;
		}
		
		public ArrayList<Product> mockProduct(CustomerEnum cust){
					
			Product product1 = new Product();
			product1.setProductType(ProductsType.CLASSIC);
			product1.setPrice(269.99);
			product1.setDescription("Offers the most basic level of advertisement");
		
			Product product2 = new Product();
			product2.setProductType(ProductsType.STANDOUT);
			product2.setPrice(322.99);
			product2.setDescription("Allows advertisers to use a company logo and use a longer presentation text");
			
			Product product3 = new Product();
			product3.setProductType(ProductsType.PREMIUN);
			product3.setPrice(394.99);
			product3.setDescription("Same benefits as Standout Ad, but also puts the advertisement at the top of the results, allowing higher visibility");
		

			if (cust.equals(CustomerEnum.DEFAULT)){

				product.add( product1);
				product.add( product2);
				product.add( product3);
				
			}if (cust.equals(CustomerEnum.NIKE)){
				
				product.add( product3);
				product.add( product3);
				product.add( product3);
				product.add( product3);
				
			}if (cust.equals(CustomerEnum.APPLE)){
				product.add( product2);
				product.add( product2);
				product.add( product2);
				product.add( product3);
				
			}if (cust.equals(CustomerEnum.UNILEVER)){
				product.add( product1);
				product.add( product1);
				product.add( product1);
				product.add( product3);
				
			}
			return product;
		}
		
		
	}


