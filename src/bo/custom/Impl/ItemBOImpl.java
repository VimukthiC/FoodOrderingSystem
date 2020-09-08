
package bo.custom.Impl;

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.custom.ItemDAO;
import dto.ItemDTO;
import entity.Item;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO{
     ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public boolean addItem(ItemDTO dto) throws ClassNotFoundException, SQLException {
        return itemDAO.add(new Item(dto.getItemCode(), dto.getItemName(),dto.getUnitPrice(), dto.getQty(), dto.getmFDate(),dto.getExDate()));
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws ClassNotFoundException, SQLException {
        return itemDAO.update(new Item(dto.getItemCode(), dto.getItemName(),dto.getUnitPrice(), dto.getQty(), dto.getmFDate(),dto.getExDate()));
    }

    @Override
    public boolean deleteItem(String itemCode) throws ClassNotFoundException, SQLException {
        return itemDAO.delete(itemCode);
    }

    @Override
    public ItemDTO searchItem(String itemCode) throws ClassNotFoundException, SQLException {
        Item ent = itemDAO.search(itemCode);
        return new ItemDTO(ent.getCode(), ent.getDescription(),ent.getUnitPrice(), ent.getQtyOnHand(), ent.getMed(),ent.getExp());
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException {
        ArrayList<ItemDTO> allItems = new ArrayList<>();
        ArrayList<Item> all = itemDAO.getAll();
        for (Item i : all) {
            allItems.add(new ItemDTO(i.getCode(), i.getDescription(),i.getUnitPrice() ,i.getQtyOnHand(),i.getMed(),i.getExp() ));
        }
        return allItems;
    }

  
}
