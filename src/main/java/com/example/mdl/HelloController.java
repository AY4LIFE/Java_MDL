package com.example.mdl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController {
    ObservableList<EmergencyReport> data = FXCollections.observableArrayList();
    @FXML private TableView<String> EmergencyTable = new TableView<>();
    @FXML private TableColumn<EmergencyReport, EmergencyReport> Type = new TableColumn<>();
    @FXML private TableColumn<EmergencyReport, EmergencyReport> Location = new TableColumn<>();
    @FXML private TableColumn<EmergencyReport, EmergencyReport> Priority = new TableColumn<>();
}