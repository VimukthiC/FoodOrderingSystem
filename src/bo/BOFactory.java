
package bo;

import bo.custom.Impl.CustomerBOImpl;
import bo.custom.Impl.ItemBOImpl;
import bo.custom.Impl.PurchaseOrderBOImpl;
import bo.custom.Impl.UserBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public enum BOTypes {
        CUSTOMER, ITEM, PURCHASEORDER,USER
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case PURCHASEORDER:
                return new PurchaseOrderBOImpl();
            case USER:
                return new UserBOImpl();
            default:
                return null;

        }
    
    }
}
