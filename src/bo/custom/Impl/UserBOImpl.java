
package bo.custom.Impl;

import bo.custom.UserBO;
import dao.DAOFactory;
import dao.custom.UserDAO;
import dto.UserDTO;
import entity.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserBOImpl implements UserBO{
    
    UserDAO dao = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);

    @Override
    public boolean getUserNameAndPassword(String userName, String password) throws ClassNotFoundException, SQLException {
        try {
            return dao.getUserNamePassword(userName, password);
        } catch (Exception ex) {
            Logger.getLogger(UserBOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

   

   

  

    
    
}
