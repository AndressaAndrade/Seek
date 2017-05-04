

import static org.junit.Assert.assertSame;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;

import model.CustomerEnum;
import model.Product;
import model.ProductsType;
import services.ProductService;
import services.ProductServiceInterface;

public class AdBuilderImplTest {

		
		
		@Test
		public void test() throws JAXBException{

			Product product = this.mockProduct();
			
			Assert.assertTrue("teste", true);
			Assert.assertTrue(product.getProductType().equals(ProductsType.CLASSIC));
		}
		
		public Product mockProduct(){
			
			Product product = new Product();
			product.setProductType(ProductsType.CLASSIC);
			product.setPrice(269.99);
			product.setDescription("Offers the most basic level of advertisement");
			
			return product;
		}
		
		
	}

