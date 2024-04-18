package Mashraful.Tour_Coordinator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class AssaignGuides_DBController implements Initializable {

    @FXML
    private ComboBox<String> selectTourComboBox;
    @FXML
    private ComboBox<String> selectGuideComboBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void assignGuideButtonOnAction(ActionEvent event) {
    }
    
}
