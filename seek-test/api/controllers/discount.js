 'use strict';
	// Include our "db"
	var db_discount = require('../../config/db_discount')();
    // Exports all the functions to perform on the db
	module.exports = {getAllDiscount};
    
	//GET /movie operationId
	function getAllDiscount(req, res, next) {
      res.json({ discounts: db_discount.find()});
    }