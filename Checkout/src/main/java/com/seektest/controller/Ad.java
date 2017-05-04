package com.seektest.controller;

import model.Advertising;
import model.Customer;
import model.CustomerEnum;

/**Ad Interface
 * @author Andressa de Andrade Freitas
 * @version 0.0.1
 * @since Release 0
 */
public interface Ad  {

	public Customer getAd(CustomerEnum customer);
}
