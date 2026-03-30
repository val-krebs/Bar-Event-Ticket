package dk.easv.bareventticket.dal.interfaces;

import dk.easv.bareventticket.be.User;

public interface IUserDAO {
    User getUser(String username, String password) throws Exception;
}