
package dao;

import dao.custom.Impl.CustomerDAOImpl;
import dao.custom.Impl.ItemDAOImpl;
import dao.custom.Impl.OrderDAOImpl;
import dao.custom.Impl.OrderDetailsDAOImpl;
import dao.custom.Impl.QueryDAOImpl;
import dao.custom.Impl.UserDAOImpl;

public class DAOFactory {

    private static DAOFactory dAOFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        if (dAOFactory == null) {
            dAOFactory = new DAOFactory();
        }

        return dAOFactory;
    }
    
    public enum DAOTypes {
        CUSTOMER, ITEM, ORDERS, ORDERDETAILS, QUERYDAO,USER;
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDERS:
                return new OrderDAOImpl();
            case ORDERDETAILS:
                return new OrderDetailsDAOImpl();
            case QUERYDAO:
                return new QueryDAOImpl();
            case USER:
                return new UserDAOImpl();
            
            default:
                return null;
        }

    }

}
