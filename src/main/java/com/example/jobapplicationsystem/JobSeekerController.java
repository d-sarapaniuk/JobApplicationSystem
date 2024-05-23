package com.example.jobapplicationsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class JobSeekerController implements Initializable {
    DBSingleton db = DBSingleton.getInstance();
    @FXML
    private TableView<JobApplication> tableView;

    @FXML
    private TableColumn<JobApplication, Integer> ID;

    @FXML
    private TableColumn<JobApplication, String> title;

    @FXML
    private TableColumn<JobApplication, String> location;

    @FXML
    private TableColumn<JobApplication, Integer> salary;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ID.setCellValueFactory(new PropertyValueFactory<JobApplication, Integer>("ID"));
        title.setCellValueFactory(new PropertyValueFactory<JobApplication, String>("Title"));
        location.setCellValueFactory(new PropertyValueFactory<JobApplication, String>("Location"));
        salary.setCellValueFactory(new PropertyValueFactory<JobApplication, Integer>("Salary"));

        if (db.getJobApplications() != null){
            ObservableList<JobApplication> jobApplicationsList = FXCollections.observableArrayList(db.getJobApplications());
            tableView.setItems(jobApplicationsList);
        }
    }

    public void switchToLoginScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
