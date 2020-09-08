
package controller;

import bo.BOFactory;
import bo.custom.PurchaseOrderBO;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderFormController {

    PurchaseOrderBO bo = (PurchaseOrderBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PURCHASEORDER);

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {

        return bo.getAllCustomers();
    }

    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        return bo.getAllItems();
    }

    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
        return bo.searchCustomer(id);
    }

    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException {
        return bo.searchItem(code);
    }

    public boolean purchaseOrder(OrderDTO dto) throws ClassNotFoundException, SQLException {
        return bo.purchaseOrder(dto);

    }
    
   

}
