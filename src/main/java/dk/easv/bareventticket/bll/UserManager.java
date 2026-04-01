package dk.easv.bareventticket.bll;

import dk.easv.bareventticket.be.User;

public class UserManager {

    public User login(String username, String password) {

        System.out.println("Using FAKE login"); // 👈 ADD THIS LINE

        if (username.equals("admin") && password.equals("1234")) {
            return new User(1, "admin", "1234", "Admin");
        }

        if (username.equals("coord") && password.equals("1234")) {
            return new User(2, "coord", "1234", "Coordinator");
        }

        return null;
    }
}