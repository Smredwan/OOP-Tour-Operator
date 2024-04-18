  package Jawad.TouristGuide;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class FeedbackFormController implements Initializable {

    @FXML
    private ComboBox<String> operatorComboBox;
    @FXML
    private ComboBox<Integer> communicationComboBox;
    @FXML
    private ComboBox<Integer> paymentComboBox;
    @FXML
    private TextArea commentsTextArea;
    @FXML
    private Label confirmationLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        operatorComboBox.getItems().addAll("Gold", "Silver", "Average");

        
        for (int i = 1; i <= 5; i++) {
            communicationComboBox.getItems().add(i);
            paymentComboBox.getItems().add(i);
        }
    }

    @FXML
    private void submitFeedback(ActionEvent event) {
        String tour = operatorComboBox.getValue();
        int communicationRating = communicationComboBox.getValue();
        int paymentRating = paymentComboBox.getValue();
        String comments = commentsTextArea.getText();

        // Print feedback to console
        System.out.println("Tour: " + tour);
        System.out.println("Communication Rating: " + communicationRating);
        System.out.println("Payment Rating: " + paymentRating);
        System.out.println("Comments: " + comments);

        // Display confirmation message
        confirmationLabel.setText("Feedback submitted successfully!");
    }

    @FXML
    private void clearFields(ActionEvent event) {
        operatorComboBox.getSelectionModel().clearSelection();
        communicationComboBox.getSelectionModel().clearSelection();
        paymentComboBox.getSelectionModel().clearSelection();
        commentsTextArea.clear();
        confirmationLabel.setText("Clear successfully!");
    }
}


