package Mashraful.Sales_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;

public class GenerateReportsController implements Initializable {


    @FXML
    private ComboBox<String> selectReportTypeComboBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void generateReportButtonOnAction(ActionEvent event) {
    }

}
