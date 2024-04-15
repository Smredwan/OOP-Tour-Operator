package Mashraful.Tour_Coordinator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewTour_DBController implements Initializable {

    @FXML
    private TableView<String> viewToursTableView;
    @FXML
    private TableColumn<String,String> touridTableColoumn;
    @FXML
    private TableColumn<String,String> tourNameTableColoumn;
    @FXML
    private TableColumn<String,String> destinationTableColoumn;
    @FXML
    private TableColumn<String, String> startDateTableColoumn;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
