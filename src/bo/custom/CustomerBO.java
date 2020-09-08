
package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO{
    public boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException;
    public boolean updateCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException;
    public boolean deleteCustomer(String customerID) throws ClassNotFoundException, SQLException;
    public CustomerDTO searchCustomer(String customerID) throws ClassNotFoundException, SQLException;
    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException ;
}
