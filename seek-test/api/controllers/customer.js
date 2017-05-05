 'use strict';
	// Include our "db"
	var db_customer = require('../../config/db_customer')();
    // Exports all the functions to perform on the db
	module.exports = {getAllCustomer};
    
	//GET /customr operationId
	function getAllCustomer(req, res, next) {
      res.json({ customers: db_customer.find()});
    }