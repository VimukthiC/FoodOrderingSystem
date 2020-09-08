
package dao.custom.Impl;

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(Customer e) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into Customer values(?,?,?,?,?,?)", e.getId(), e.getName(), e.getAddress(),e.getPhone(),e.getNic(), e.getSalary());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        String sql = "Delete from Customer where id=?";
        return CrudUtil.executeUpdate(sql, id);
    }

    @Override
    public boolean update(Customer e) throws SQLException, ClassNotFoundException {
        String sql = "Update Customer set name=?,address=?,phone=?,nic=?,salary=? where id=?";
        return CrudUtil.executeUpdate(sql, e.getName(), e.getAddress(),e.getPhone(),e.getNic(), e.getSalary(), e.getId());
    }

    @Override
    public Customer search(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select * from Customer where id=?";
        ResultSet rst = CrudUtil.executeQuery(sql, id);
        if (rst.next()) {
            String cusID = rst.getString(1);
            String cusName = rst.getString(2);
            String cusAddress = rst.getString(3);
            String cusPhone = rst.getString(4);
            String cusNIC = rst.getString(5);
            double salary = rst.getDouble(6);

            return new Customer(cusID, cusName, cusAddress,cusPhone,cusNIC, salary);

        }
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException {

        String sql = "Select * from Customer";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Customer> allCustomers = new ArrayList<>();
        while (rst.next()) {
            String cusID = rst.getString(1);
            String cusName = rst.getString(2);
            String cusAddress = rst.getString(3);
            String cusPhone = rst.getString(4);
            String cusNIC = rst.getString(5);
            double cusSalary = rst.getDouble(6);

            Customer customer = new Customer(cusID, cusName, cusAddress,cusPhone,cusNIC, cusSalary);
            allCustomers.add(customer);
        }
        return allCustomers;
    }

    
}
