package Mashraful.Tour_Coordinator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewTour_DBController implements Initializable {

    @FXML
    private TableView<?> viewToursTableView;
    @FXML
    private TableColumn<?, ?> touridTableColoumn;
    @FXML
    private TableColumn<?, ?> tourNameTableColoumn;
    @FXML
    private TableColumn<?, ?> destinationTableColoumn;
    @FXML
    private TableColumn<?, ?> startDateTableColoumn;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
