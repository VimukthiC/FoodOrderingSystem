
package dao.custom;

import dao.SuperDAO;

public interface UserDAO extends SuperDAO{
    public boolean getUserNamePassword(String userNameUI, String userPasswordUI) throws Exception;

    
}
