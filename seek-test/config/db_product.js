'use strict;'
//Include crypto to generate the movie id
var crypto = require('crypto');

module.exports = function() {
	return {
		productList : [{

			"product":"Classic Ad",
			"price":269.99,
			"description":"Offers the most basic level of advertisement "
		},{
			"product":"Standout Ad",
			"price":322.99,
			"description":" Allows advertisers to use a company logo and use a longer presentation"
		},{
			"product":"Premiun Ad",
			"price":394.99,
			"description":"Same benefits as Standout Ad, but also puts the advertisement at the top of the results, allowing higher visibility "
		}],


		find(id) {
			if(id) {
				return this.productList.find(element => {
						return element.id === id;
					});	
			}else {
				return this.productList;
			}
		}

	
	}
};  