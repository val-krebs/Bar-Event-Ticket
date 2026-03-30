package dk.easv.bareventticket.bll;

import dk.easv.bareventticket.be.User;
import dk.easv.bareventticket.dal.db.UserDAO;
import dk.easv.bareventticket.dal.interfaces.IUserDAO;

public class UserManager {

    private IUserDAO userDAO;

    public UserManager() {
        userDAO = new UserDAO();
    }

    public User login(String username, String password) throws Exception {
        return userDAO.getUser(username, password);
    }
}