package dk.easv.bareventticket.gui.controller;

import dk.easv.bareventticket.bll.UserManager;
import dk.easv.bareventticket.be.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    private UserManager userManager = new UserManager();

    @FXML
    private void handleLogin() {
        try {
            String username = txtUsername.getText();
            String password = txtPassword.getText();

            User user = new User(1, "test", "test", "Admin");

            if (user != null) {
                System.out.println("Login successful: " + user.getRole());

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/dk/easv/bareventticket/view/MainView.fxml")
                );

                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle("Main Application");
                stage.setScene(new Scene(root));
                stage.show();

                // Close login window
                txtUsername.getScene().getWindow().hide();

            } else {
                System.out.println("Invalid login");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}