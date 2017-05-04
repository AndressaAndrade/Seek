var express = require('express'),
    wine = require('./routes/wines');

var app = express();

/*app.use(function () {
    app.use(express.logger('dev'));     /* 'default', 'short', 'tiny', 'dev' */
  //  app.use(express.bodyParser());
//});


app.use(express.urlencoded());
app.use(express.json());


app.get('/customer', customer.findAll);
app.get('/customer/:id', customer.findCustomer);
app.post('/customer', customer.addCustomer);
app.put('/customer/:id', customer.updateCustomer);
app.delete('/customer/:id', customer.deleteCustomer);


app.get('/deal', deal.findAll);
app.get('/deal/:id', deal.findById);
app.post('/deal', deal.addDeal);
app.put('/deal/:id', deal.updateDeal);
app.delete('/deal/:id', deal.deleteDeal);


app.get('/discount', discount.findAll);
app.get('/discount/:id', discount.findById);
app.post('/discount', discount.addDiscount);
app.put('/discount/:id', discount.updateDiscount);
app.delete('/discount/:id', discount.deleteDiscount);


app.get('/products', products.findAll);
app.get('/products/:id', products.findById);
app.post('/products', products.addProducts);
app.put('/products/:id', products.updateProducts);
app.delete('/products/:id', products.deleteProducts);


app.listen(3000);
console.log('Listening on port 3000...');