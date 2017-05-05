'use strict;'
//Include crypto to generate the movie id
var crypto = require('crypto');

module.exports = function() {
	return {
		dealList : [{
			"id":"1",
			"customer":"UNILEVER",
			"get_a_for_product":"2",
			"for_product":"3",
			"product_type":"Classic	Ad"
		},
		{
			"id":"2",
			"customer":"FORD",
			"get_a_for_product":"5",
			"for_product":"4",
			"product_type":"Classic	Ad"
		}],


		find(id) {
			if(id) {
				return this.dealList.find(element => {
						return element.id === id;
					});	
			}else {
				return this.dealList;
			}
		}

	
	}
};  