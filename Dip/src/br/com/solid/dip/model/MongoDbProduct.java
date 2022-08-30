package br.com.solid.dip.model;

public class MongoDbProduct implements IDbProduct {

    public String getProductById(String productId) {
        return "MongoDB: Exibindo dados do produto " + productId;
    }
}
