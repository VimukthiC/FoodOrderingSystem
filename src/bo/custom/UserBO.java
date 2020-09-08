
package bo.custom;

import bo.SuperBO;
import dto.UserDTO;
import java.sql.SQLException;

public interface UserBO extends SuperBO{
    public boolean getUserNameAndPassword(String userName,String password) throws ClassNotFoundException, SQLException;

    

    

    
}
