
package dao.custom.Impl;

import dao.CrudUtil;
import dao.custom.ItemDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Item;

public class ItemDAOImpl implements ItemDAO {

    @Override
    public boolean add(Item e) throws ClassNotFoundException, SQLException {
        String sql = "insert into Item values(?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql, e.getCode(), e.getDescription(),e.getUnitPrice(), e.getQtyOnHand(), e.getMed(),e.getExp());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        String sql = "delete from Item where code=?";
        return CrudUtil.executeUpdate(sql, id);
    }

    @Override
    public boolean update(Item e) throws SQLException, ClassNotFoundException {
        String sql = "Update Item set description=?,unitPrice=?,qtyOnHand=?,med=?,exp=? where code=?";
        return CrudUtil.executeUpdate(sql, e.getDescription(),e.getUnitPrice(), e.getQtyOnHand(),e.getMed(),e.getExp() , e.getCode());
    }

    @Override
    public Item search(String id) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item where code=?";
        ResultSet rst = CrudUtil.executeQuery(sql, id);
        if (rst.next()) {
            String code = rst.getString(1);
            String itemName = rst.getString(2);
            double unitPrice = rst.getDouble(3);
            int qtyOnHand = rst.getInt(4);
            String mfd=rst.getString(5);
            String exp=rst.getString(6);
            return new Item(code, itemName,unitPrice, qtyOnHand,mfd,exp );
        }
        return null;
    }

    @Override
    public ArrayList<Item> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from Item";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Item> allItmes = new ArrayList<>();
        while (rst.next()) {
            String code = rst.getString(1);
            String itemName = rst.getString(2);
            double unitPrice = rst.getDouble(3);
            int qtyOnHand = rst.getInt(4);
            String mfd=rst.getString(5);
            String exp=rst.getString(6);
            Item item = new Item(code, itemName, unitPrice,qtyOnHand,mfd,exp);
            allItmes.add(item);

        }
        return allItmes;
    }

   

}
