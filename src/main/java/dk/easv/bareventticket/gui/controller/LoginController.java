package dk.easv.bareventticket.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private void handleLogin() {
        System.out.println("Username: " + txtUsername.getText());
        System.out.println("Password: " + txtPassword.getText());
    }
}