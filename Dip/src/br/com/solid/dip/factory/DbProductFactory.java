package br.com.solid.dip.factory;

import br.com.solid.dip.model.Db;
import br.com.solid.dip.model.IDbProduct;
import br.com.solid.dip.model.MongoDbProduct;
import br.com.solid.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if(type == Db.MYSQL){
            return new MySQLProduct();
        }else {
            return new MongoDbProduct();
        }

        
    }
}
