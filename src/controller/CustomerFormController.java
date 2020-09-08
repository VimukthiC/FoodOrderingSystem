
package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerFormController {

    CustomerBO bo = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);

    public boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        return bo.addCustomer(customer);
    }

    public boolean updateCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        return bo.updateCustomer(customer);
    }

    public boolean deleteCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return bo.deleteCustomer(customerID);
    }

    public CustomerDTO searchCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return bo.searchCustomer(customerID);
    }

    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        return bo.getAllCustomers();
    }

}
