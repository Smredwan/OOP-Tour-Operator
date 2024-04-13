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
        // Initialization logic goes here, if needed
    }    

    // Define any other methods or event handlers here, if needed
@FXML
private void onUpdateButtonClicked() {
    // Get the values from the text fields
    String username = usernameField.getText();
    String id = idField.getText();
    String phoneNumber = phoneNumberField.getText();
    String gender = genderField.getText();
    String email = emailField.getText();
    String country = countryField.getText();

    // Validate the input fields (optional)
    if (username.isEmpty() || id.isEmpty() || phoneNumber.isEmpty() || gender.isEmpty() || email.isEmpty() || country.isEmpty()) {
        // Display an error message or handle invalid input
        // For example, you can show an alert dialog
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("All fields are required!");
        alert.showAndWait();
        return; // Exit the method if any field is empty
    }

    // Perform the update operation
    boolean success = updateProfile(username, id, phoneNumber, gender, email, country);

    // Check if the update was successful
    if (success) {
        // Display a success message or perform any other action
        // For example, you can show a confirmation dialog
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Profile updated successfully!");
        alert.showAndWait();
        
        // Optionally, you can clear the input fields after successful update
        clearFields();
    } else {
        // Display an error message or handle update failure
        // For example, you can show an alert dialog
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Failed to update profile!");
        alert.showAndWait();
    }
}

// Method to perform the update operation
private boolean updateProfile(String username, String id, String phoneNumber, String gender, String email, String country) {
    // Your update logic goes here
    // This method should perform the necessary database or file operations to update the user profile
    
    // For demonstration purposes, let's assume the update is always successful
    return true;
}

// Method to clear input fields
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
    // Load the FXML file for the previous scene
    FXMLLoader loader = new FXMLLoader(getClass().getResource("previous_scene.fxml"));
    Parent root = loader.load();

    // Create a new scene
    Scene scene = new Scene(root);

    // Get the stage information
    Stage stage = (Stage) backButton.getScene().getWindow();

    // Set the new scene on the stage
    stage.setScene(scene);
    stage.show();
 }
}


