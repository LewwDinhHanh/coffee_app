package tlu.cse.ht63.cfapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import tlu.cse.ht63.cfapp.model.Product;

@Dao
public interface ProductDAO {
    @Insert
    void insertProduct(Product product);

    @Query("SELECT * FROM product")
    List<Product> getListProduct();
}
