import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PaymentOptionsController implements Initializable {

    @FXML
    private TextField cardNumberField;
    @FXML
    private TextField expirationDateField;
    @FXML
    private TextField cvvField;
    @FXML
    private TextField verificationCodeField;
    @FXML
    private Label confirmationLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proceedToPayment() {
        String cardNumber = cardNumberField.getText();
        String expirationDate = expirationDateField.getText();
        String cvv = cvvField.getText();


        if (cardNumber.isEmpty() || expirationDate.isEmpty() || cvv.isEmpty()) {
            confirmationLabel.setText("Please fill in all fields.");
        } else {

            confirmationLabel.setText("Processing payment...");
        }
    }

    @FXML
    private void confirmPayment() {
        String verificationCode = verificationCodeField.getText();

        if (verificationCode.isEmpty()) {
            confirmationLabel.setText("Please enter verification code.");
        } else {

            confirmationLabel.setText("Payment confirmed!");
        }
    }
}