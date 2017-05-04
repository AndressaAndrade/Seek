package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.sun.istack.internal.logging.Logger;
import com.sun.xml.ws.util.Pool.Unmarshaller;

/**Class to build connection
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */

public class ConnectRest {

	private static int HTTP_COD_SUCESSO = 200;
	private static URL url;
	private static HttpURLConnection con;
	private static  BufferedReader br ;
	public static Logger logger;
	
	public ConnectRest(){
		
	}
	
	
		public static BufferedReader connect (String urlAPI) throws JAXBException {

			try {
				url = new URL(urlAPI);
				con = (HttpURLConnection) url.openConnection();

				if (con.getResponseCode() != HTTP_COD_SUCESSO) {
					throw new RuntimeException("HTTP error code : "+ con.getResponseCode());
				}
				br = new BufferedReader(new InputStreamReader((con.getInputStream())));
				logger.log(Level.INFO, Constant.INFO_CODE_CONNECT, Constant.INFO_MENSAGE_CONNECT);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				logger.log(Level.SEVERE, Constant.ERROR_CODE_CONNECT, Constant.ERROR_MENSAGE_CONNECT);
							
				e.printStackTrace();
			}
			return br;
		}

		
		public static void disconnect ()throws Error {

			try {
				con.disconnect();
			} catch (Error e) {
				e.printStackTrace();
			}
		}

				
		
}
