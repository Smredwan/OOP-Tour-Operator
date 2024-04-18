package Mashraful.SalesAndMarketingOfficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewSales_DBController implements Initializable {

    @FXML
    private TableView<String> viewSalesTableView;
    @FXML
    private TableColumn<String, String> orderidTableColoumn;
    @FXML
    private TableColumn<String, String> clientNameTableColoumn;
    @FXML
    private TableColumn<String, String> tourNameTableColoumn;
    @FXML
    private TableColumn<String, String> saleAmountTableColoumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
