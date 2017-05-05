'use strict';

var SwaggerExpress = require('swagger-express-mw');
var app = require('express')();
var db_customer = require('./config/db_customer')();
var db_deal = require('./config/db_deal')();
var db_discount = require('./config/db_discount')();
var db_product = require('./config/db_product')();

module.exports = app; 

var config = {
  appRoot: __dirname // required config
};

SwaggerExpress.create(config, function(err, swaggerExpress) {
  if (err) { throw err; }

  // install middleware
  swaggerExpress.register(app);

  var port = process.env.PORT || 10010;
  app.listen(port);

});
