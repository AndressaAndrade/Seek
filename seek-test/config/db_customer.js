'use strict;'
//Include crypto to generate the movie id
var crypto = require('crypto');

module.exports = function() {
	return {
		customerList : [{
							"name":"DEFAULT",
							"product":["classic","standout","premiun"],
							"total":987.97
						},
						{
							"name":"UNILEVER",
							"product":["classic","classic","classic","classic"],
							"total":934.96
						},
						{
							"name":"APPLE",
							"product":[ "standout","standout","standout","premiun"],
							"total":1294.96
						},
						{
							"name":"NIKE",
							"product":[ "premiun","premiun","premiun","premiun"],
							"total":1519.96
						},
		],


		find(id) {
			if(id) {
				return this.customerList.find(element => {
						return element.id === id;
					});	
			}else {
				return this.customerList;
			}
		}

	
	}
};  