
package dao.custom.Impl;

import dao.CrudUtil;
import dao.custom.OrderDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Order;

public class OrderDAOImpl implements OrderDAO {

    @Override
    public boolean add(Order enty) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into Orders values(?,?,?)", enty.getoId(), enty.getDate(), enty.getCustomerID());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete from Orders where oId=?", id);
    }

    @Override
    public boolean update(Order enty) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("Update Orders set date=?,customerID=? where oId=?", enty.getDate(), enty.getCustomerID(), enty.getoId());
    }

    @Override
    public Order search(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from Orders where oId=?", id);
        if (rst.next()) {
            String oid = rst.getString(1);
            String date = rst.getString(2);
            String customerID = rst.getString(3);
            return new Order(oid, date, customerID);
        }
        return null;
    }

    @Override
    public ArrayList<Order> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from Orders");
        ArrayList<Order> allOrders = new ArrayList<>();
        while (rst.next()) {
            String oid = rst.getString(1);
            String date = rst.getString(2);
            String customerID = rst.getString(3);

            Order order = new Order(oid, date, customerID);
            allOrders.add(order);

        }
        return allOrders;
    }

}
