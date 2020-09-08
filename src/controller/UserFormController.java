
package controller;

import bo.BOFactory;
import bo.custom.UserBO;
import java.sql.SQLException;

public class UserFormController {
    UserBO bo = (UserBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.USER);
    
    public boolean getUserNameAndPassword(String userName,String password) throws ClassNotFoundException, SQLException {
        return bo.getUserNameAndPassword(userName,password);
    }

    public boolean getUserNamePassword(String userName, String userPassword) {
        return false;
        
    }
}
