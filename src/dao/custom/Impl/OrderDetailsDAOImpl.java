
package dao.custom.Impl;

import dao.CrudUtil;
import dao.custom.OrderDetailsDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.OrderDetail;

public class OrderDetailsDAOImpl implements OrderDetailsDAO {

    @Override
    public boolean add(OrderDetail enty) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into OrderDetails values(?,?,?,?)", enty.getoId(), enty.getItemCode(), enty.getQty(), enty.getUnitPrice());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete form OrderDetails where oId=?", id);
    }

    @Override
    public boolean update(OrderDetail enty) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("Update OrderDetails set itemCode=?,qty=?,unitPrice=? where oId=?", enty.getItemCode(), enty.getQty(), enty.getUnitPrice(), enty.getoId());
    }

    @Override
    public OrderDetail search(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from OrderDetails where oid=?", id);
        if (rst.next()) {

            String oid = rst.getString(1);
            String itemCode = rst.getString(2);
            int qty = rst.getInt(3);
            double unitPrice = rst.getDouble(4);
            return new OrderDetail(oid, itemCode, qty, unitPrice);
        }
        return null;
    }

    @Override
    public ArrayList<OrderDetail> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from OrderDetails");
        ArrayList<OrderDetail> allOrderDetails = new ArrayList<>();
        while (rst.next()) {
            String oid = rst.getString(1);
            String itemCode = rst.getString(2);
            int qty = rst.getInt(3);
            double unitPrice = rst.getDouble(4);

            OrderDetail orderDetail = new OrderDetail(oid, itemCode, qty, unitPrice);
            allOrderDetails.add(orderDetail);
        }
        return allOrderDetails;
    }

}
