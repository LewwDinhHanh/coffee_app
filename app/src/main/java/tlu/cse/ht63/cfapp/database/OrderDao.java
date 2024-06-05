package tlu.cse.ht63.cfapp.database;

import androidx.room.Dao;
import androidx.room.Insert;

import tlu.cse.ht63.cfapp.model.Order;

@Dao
public interface OrderDao {
    @Insert
    long insert(Order order);
}

