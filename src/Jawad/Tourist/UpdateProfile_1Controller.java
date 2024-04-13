package Jawad.Tourist;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UpdateProfile_1Controller implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField genderField;
    @FXML
    private TextField emailField;
    @FXML
    private Button updateButton;
    @FXML
    private Button backButton;
    @FXML
    private Label orLabel;
    @FXML
    private TextField countryField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

@FXML
private void onUpdateButtonClicked() {

    String username = usernameField.getText();
    String id = idField.getText();
    String phoneNumber = phoneNumberField.getText();
    String gender = genderField.getText();
    String email = emailField.getText();
    String country = countryField.getText();

    if (username.isEmpty() || id.isEmpty() || phoneNumber.isEmpty() || gender.isEmpty() || email.isEmpty() || country.isEmpty()) {

        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("All fields are required!");
        alert.showAndWait();
        return;
    }


    boolean success = updateProfile(username, id, phoneNumber, gender, email, country);


    if (success) {

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Profile updated successfully!");
        alert.showAndWait();
        

        clearFields();
    } else {

        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Failed to update profile!");
        alert.showAndWait();
    }
}


private boolean updateProfile(String username, String id, String phoneNumber, String gender, String email, String country) {
    return true;
}


private void clearFields() {
    usernameField.clear();
    idField.clear();
    phoneNumberField.clear();
    genderField.clear();
    emailField.clear();
    countryField.clear();
}



    
@FXML
private void onBackButtonClicked() throws IOException {

    FXMLLoader loader = new FXMLLoader(getClass().getResource("previous_scene.fxml"));
    Parent root = loader.load();


    Scene scene = new Scene(root);


    Stage stage = (Stage) backButton.getScene().getWindow();


    stage.setScene(scene);
    stage.show();
 }
}


