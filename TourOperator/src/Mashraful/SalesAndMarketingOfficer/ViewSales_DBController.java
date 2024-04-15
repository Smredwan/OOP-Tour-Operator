package Mashraful.SalesAndMarketingOfficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewSales_DBController implements Initializable {

    @FXML
    private TableView<?> viewSalesTableView;
    @FXML
    private TableColumn<?, ?> orderidTableColoumn;
    @FXML
    private TableColumn<?, ?> clientNameTableColoumn;
    @FXML
    private TableColumn<?, ?> tourNameTableColoumn;
    @FXML
    private TableColumn<?, ?> saleAmountTableColoumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
