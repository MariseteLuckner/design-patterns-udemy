package br.com.solid.dip.payment;

import br.com.solid.dip.factory.DbProductFactory;
import br.com.solid.dip.model.Db;
import br.com.solid.dip.model.IDbProduct;

public class Payment {
    public void pay(String productId) {

        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productId);
        System.out.println(product);

    }
}
