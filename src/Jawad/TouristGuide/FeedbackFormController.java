/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Jawad.TouristGuide;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class FeedbackFormController implements Initializable {

    @FXML
    private ComboBox<?> operatorComboBox;
    @FXML
    private ComboBox<?> communicationComboBox;
    @FXML
    private ComboBox<?> paymentComboBox;
    @FXML
    private TextArea commentsTextArea;
    @FXML
    private Label confirmationLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitFeedback(ActionEvent event) {
    }

    @FXML
    private void clearFields(ActionEvent event) {
    }
    
}
