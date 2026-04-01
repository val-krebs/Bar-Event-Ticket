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
//This will load a new scene
@FXML
private void handleLogin() {
    try {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        User user = userManager.login(username, password);

        if (user != null) {
            System.out.println("Login successful: " + user.getRole());

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/dk/easv/bareventticket/view/EventsView.fxml")
            );

            Scene newScene = new Scene(loader.load());

            Stage stage = (Stage) txtUsername.getScene().getWindow();
            stage.setScene(newScene);
            stage.setTitle("Events");

        } else {
            System.out.println("Invalid login");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}