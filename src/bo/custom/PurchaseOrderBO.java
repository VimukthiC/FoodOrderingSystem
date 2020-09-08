
package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PurchaseOrderBO extends SuperBO{
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;
    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;
    public boolean purchaseOrder(OrderDTO order) throws ClassNotFoundException, SQLException;
   
   
}
