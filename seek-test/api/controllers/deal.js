 'use strict';
	// Include our "db"
	var db_deal = require('../../config/db_deal')();
    // Exports all the functions to perform on the db
	module.exports = {getAllDeal};
    
	//GET /movie operationId
	function getAllDeal(req, res, next) {
      res.json({ deals: db_deal.find()});
    }