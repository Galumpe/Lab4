import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    protected Button btn_Add;
    @FXML
    protected Button btn_Del;
    @FXML
    protected Button btn_Summit;
    @FXML
    protected TableView<model> show_Table;
    @FXML
    protected TableColumn<model, String> show_Meet;
    @FXML
    protected TableColumn<model, String> show_Detail;
    @FXML
    protected TableColumn<model, String> show_Date;
    @FXML
    protected TableColumn<model, String> show_Time;
    @FXML
    protected TextField f_Meet;
    @FXML
    protected TextField f_Detail;
    @FXML
    protected TextField f_Date;
    @FXML
    protected TextField f_Time;

    @FXML
//    public void add(ActionEvent event) {
//        System.out.println("1");
//    }
//
//    @FXML
//    public void del(ActionEvent event) {
//    }


    ObservableList<model> data = FXCollections.observableArrayList();

    private IntegerProperty index = new SimpleIntegerProperty();



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        index.set(-1);

        show_Meet.setCellValueFactory(new PropertyValueFactory<model, String>("meet"));
        show_Detail.setCellValueFactory(new PropertyValueFactory<model, String>("detail"));
        show_Date.setCellValueFactory(new PropertyValueFactory<model, String>("date"));
        show_Time.setCellValueFactory(new PropertyValueFactory<model, String>("time"));
        show_Table.setItems(data);
        show_Table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {
            @Override
            public void changed(ObservableValue<?> observable, Object oldValue, Object newValue) {
                index.set(data.indexOf(newValue));

            }
        });
    }

    @FXML
    public void btnAdd(ActionEvent event) {
        model t = new model(f_Meet.getText(),f_Detail.getText(),f_Date.getText(),f_Time.getText());
        data.setAll(t);
        System.out.println("10");
    }
    @FXML
    public void btnDel(ActionEvent event){
        int i = index.get();
        if (i>-1){
            data.remove(i);
            show_Table.getSelectionModel().clearSelection();
        }
    }

    public static String test(){
        return "15.00";
    }
}
