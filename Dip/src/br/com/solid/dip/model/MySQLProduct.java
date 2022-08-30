package br.com.solid.dip.model;

public class MySQLProduct implements IDbProduct {

    public String getProductById(String productId) {
        return "Mysql: Exibindo dados do produto " + productId;
    }
}
