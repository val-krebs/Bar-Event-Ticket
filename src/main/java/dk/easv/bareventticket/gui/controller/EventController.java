package dk.easv.bareventticket.gui.controller;

import dk.easv.bareventticket.be.Events;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EventController {

    @FXML
    private TableView<Events> tableEvents;

    @FXML
    private TableColumn<Events, String> colName;

    @FXML
    private TableColumn<Events, String> colDate;

    @FXML
    private TableColumn<Events, String> colLocation;

    @FXML
    public void initialize() {
        System.out.println("Events screen loaded");

        // Connect columns to Event class
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colLocation.setCellValueFactory(new PropertyValueFactory<>("location"));

        // Fake data
        ObservableList<Events> events = FXCollections.observableArrayList(
                new Events("Friday Bar", "12/04", "EASV"),
                new Events("Wine Tasting", "15/04", "Esbjerg"),
                new Events("Concert Night", "20/04", "Arena")
        );

        tableEvents.setItems(events);
    }
}