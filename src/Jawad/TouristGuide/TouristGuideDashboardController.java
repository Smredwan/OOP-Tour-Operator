package Jawad.TouristGuide;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class TouristGuideDashboardController implements Initializable {

    @FXML
    private Button homeButton;
    @FXML
    private Button updateProfileButton;
    @FXML
    private Button UpdateTourButton;
    @FXML
    private Button trackPaymentsButton;
    @FXML
    private Button termsAndConditionsButton;
    @FXML
    private Button feedbackbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleUpdateProfileButtonClick() {
        loadFXML("UpdateProfile.fxml");
    }

    @FXML
    private void handleUpdateTourButtonClick() {
        loadFXML("UpdateTour.fxml");
    }

    @FXML
    private void handleTrackPaymentButtonClick() {
        loadFXML("PaymentOptions.fxml");
    }

    @FXML
    private void handleTermsAndConditionsButtonClick() {
        loadFXML("TermsAndConditions.fxml");
    }

    @FXML
    private void handleFeedbackButtonClick() {
        loadFXML("TouristFeedback.fxml");
    }

    private void loadFXML(String fxmlFileName) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
