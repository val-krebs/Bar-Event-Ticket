package dk.easv.bareventticket.gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;

public class MainController {

    @FXML
    private Tab usersTab;
    @FXML
    private Tab eventsTab;
    @FXML
    private Tab ticketsTab;
    @FXML
    private Tab assignTab;
    @FXML
    private Tab settingsTab;

    @FXML
    public void initialize() {
        try {
            usersTab.setContent(FXMLLoader.load(getClass().getResource("/dk/easv/bareventticket/view/UsersView.fxml")));
            eventsTab.setContent(FXMLLoader.load(getClass().getResource("/dk/easv/bareventticket/view/EventsView.fxml")));
            ticketsTab.setContent(FXMLLoader.load(getClass().getResource("/dk/easv/bareventticket/view/ticket-view.fxml")));
            assignTab.setContent(FXMLLoader.load(getClass().getResource("/dk/easv/bareventticket/view/AssignCoordinatorsView.fxml")));
            settingsTab.setContent(FXMLLoader.load(getClass().getResource("/dk/easv/bareventticket/view/SettingsView.fxml")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}