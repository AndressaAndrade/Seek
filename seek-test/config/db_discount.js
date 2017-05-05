'use strict;'
//Include crypto to generate the movie id
var crypto = require('crypto');

module.exports = function() {
	return {
		discountList : [
		{
		"customer":"APPLE",
		"price":299,
		"min":0,
		"product_type":"Standout Ad"	
		},
		{
		"customer":"NIKE",
		"price":379.99,
		"min":4,
		"product_type":"Premiun Ad"	
		},
		{
		"customer":"FORD",
		"price":309.99,
		"min":0,
		"product_type":"Standout Ad"	
		},

		{
		"customer":"FORD",
		"price":389.99,
		"min":3,
		"product_type":"Premiun Ad"	
		}
		],


		find(id) {
			if(id) {
				return this.discountList.find(element => {
						return element.id === id;
					});	
			}else {
				return this.discountList;
			}
		}

	
	}
};  