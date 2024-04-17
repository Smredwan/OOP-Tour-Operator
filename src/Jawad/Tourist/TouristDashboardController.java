package Jawad.Tourist;

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
public class TouristDashboardController implements Initializable {

    @FXML
    private Button homeButton;
    @FXML
    private Button updateProfileButton;
    @FXML
    private Button bookPackageButton;
    @FXML
    private Button bookHotelButton;
    @FXML
    private Button paymentOptionsButton;
    @FXML
    private Button termsAndConditionsButton;
    @FXML
    private Button customerServiceButton;
    @FXML
    private Button feedback;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleUpdateProfileButtonClick() {
        loadFXML("UpdateProfile_1.fxml");
    }

    @FXML
    private void handleBookPackageButtonClick() {
        loadFXML("BookPackage.fxml");
    }

    @FXML
    private void handleBookHotelButtonClick() {
        loadFXML("BookHotel.fxml");
    }

    @FXML
    private void handlePaymentOptionsButtonClick() {
        loadFXML("PaymentOptions.fxml");
    }

    @FXML
    private void handleTermsAndConditionsButtonClick() {
        loadFXML("TermsAndConditions.fxml");
    }

    @FXML
    private void handleCustomerServiceButtonClick() {
        loadFXML("CustomerService.fxml");
    }

    @FXML
    private void handleFeedbackButtonClick() {
        loadFXML("TouristFeedback.fxml");
    }

    private void loadFXML(String fxmlFilesName) {
        try {
            Parent root;
            root = FXMLLoader.load(getClass().getResource(fxmlFilesName));
            Stage stage = new Stage();  
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

