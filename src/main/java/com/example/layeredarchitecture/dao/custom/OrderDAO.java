package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.custom.CrudDAO;
import com.example.layeredarchitecture.entity.Order;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<Order> {
    boolean checkOrderId(String oid) throws SQLException, ClassNotFoundException;
}
