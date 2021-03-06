package ucf.assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class ControlTest {

    public TableView<Model> tableview; //table to display tasks
    public TableColumn<Model,String> colTask; //column defining and holding tasks
    public TableColumn<Model, String> dueDate; //column defining and holding the due date per task
    public TableColumn<Model, String> status; //checkmark to note done tasks


    ObservableList<Model> observableList = FXCollections.observableArrayList();


        @Test
    void addItemsDisplay_give_true_if_display_no_null_list() {
            ObservableList<Model> observableList = FXCollections.observableArrayList();
            observableList.add(new Model("Get milk", "2021-10-02", true));

            assertTrue(observableList.size()!=0);
    }

    @Test
    void removeItemDisplaysingleitemselectedtoremove() {
        ObservableList<Model> observableList2 = FXCollections.observableArrayList();

        Model addingandItem = new Model("Get candy", "2021-10-02", true);
        observableList2.add(addingandItem);
        observableList2.remove(addingandItem);
        assertEquals(0, observableList2.size());
    }

    @Test
    void onEditChangeaftertriggeringtomakedifferent() {
        String taksName = "Get milk";
        Model model = new Model(taksName, "2021-10-02", true);

        String taksName2 = "Candy";
        Model model2 = new Model(taksName2, "2021-10-02", true);
        model.setTaskName("Hello stranger.");
        assertNotEquals(model,model2);
    }

    @Test
    void clearListDisplayremoveallitemsfrothelist() {
        ObservableList<Model> observableList3 = FXCollections.observableArrayList();

        Model addingandItem = new Model("Get candy", "2021-10-02", true);
        observableList3.add(addingandItem);
        observableList3.removeAll(addingandItem);
        assertEquals(0, observableList3.size());

    }

    @Test
    void saveListDisplay() {

    }

    @Test
    void handleOpenDisplay() {

    }

    @Test
    void testingforChecking() {

        Model addingandItem = new Model("Get candy", "2021-10-02", true);
        assertEquals(0, observableList3.size());

    }
}