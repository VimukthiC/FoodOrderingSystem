
package bo.custom;

import bo.SuperBO;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO extends SuperBO{
    public boolean addItem(ItemDTO item) throws ClassNotFoundException, SQLException;
    public boolean updateItem(ItemDTO item) throws ClassNotFoundException, SQLException;
    public boolean deleteItem(String itemCode) throws ClassNotFoundException, SQLException;
    public ItemDTO searchItem(String itemCode) throws ClassNotFoundException, SQLException;
    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException;
}
