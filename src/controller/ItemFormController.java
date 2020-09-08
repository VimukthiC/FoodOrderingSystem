
package controller;

import bo.BOFactory;
import bo.custom.ItemBO;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemFormController {

     ItemBO bo = (ItemBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ITEM);

    public boolean addItem(ItemDTO item) throws ClassNotFoundException, SQLException {
        return bo.addItem(item);

    }

    public boolean updateItem(ItemDTO item) throws ClassNotFoundException, SQLException {
        return bo.updateItem(item);
    }

    public boolean deleteItem(String itemCode) throws ClassNotFoundException, SQLException {
        return bo.deleteItem(itemCode);
    }

    public ItemDTO searchItem(String itemCode) throws ClassNotFoundException, SQLException {
        return bo.searchItem(itemCode);
    }

    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException {
        return bo.getAllItems();
    }
}
