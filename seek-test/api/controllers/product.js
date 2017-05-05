 'use strict';
	// Include our "db"
	var db_product = require('../../config/db_product')();
    // Exports all the functions to perform on the db
	module.exports = {getAllProduct};
    
	//GET /movie operationId
	function getAllProduct(req, res, next) {
      res.json({ products: db_product.find()});
    }