
package dao.custom.Impl;

import dao.CrudUtil;
import dao.custom.UserDAO;
import dto.UserDTO;
import entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public class UserDAOImpl implements UserDAO{
     
    public boolean getUserNamePassword(String userNameUI, String userPasswordUI) throws ClassNotFoundException, SQLException {
        String sql="SELECT * FROM User WHERE username ='"+userNameUI+"' AND password ='"+userPasswordUI+"' "; 
        ResultSet rst = CrudUtil.executeQuery(userNameUI, userPasswordUI);
        if(rst.next()){
            return true;
        }
        return false;
    }

    
}
