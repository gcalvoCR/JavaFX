/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author mespinoza
 */
public class FXMLDocumentController implements Initializable {

    //These items are for the checkboz example
    @FXML
    private Label lblPizzaOrder;
    @FXML
    private CheckBox chbxPepperoni;
    @FXML
    private CheckBox chbxPineApple;
    @FXML
    private CheckBox chbxBacon;

    // These items are for the Choicebox example
    @FXML
    private ChoiceBox choiceBox;
    @FXML
    private Label lblChoiceBox;

    // These items are for the Comboboz example
    @FXML
    private ComboBox myComboBox;
    @FXML
    private Label lblComboBox;

    // These items are for the radio Button example
    @FXML
    private RadioButton phpRadioButton;
    @FXML
    private RadioButton javaRadioButton;
    @FXML
    private RadioButton c1RadioButton;
    @FXML
    private RadioButton c2RadioButton;
    @FXML
    private Label lblradioButton;

    private ToggleGroup favLangToggleGroup;

    //This is for the checkbos Example
    public void PizzaOrderButtonPushed() {
        String order = "Toppings are:";
        if (chbxPepperoni.isSelected()) {
            order += "\nPepperoni";
        }
        if (chbxPineApple.isSelected()) {
            order += "\nPineapple";
        }
        if (chbxBacon.isSelected()) {
            order += "\nBacon";
        }
        this.lblPizzaOrder.setText(order);
    }

    //This will update the label for the choicebox
    public void choiceBoxButtonPushed() {
        lblChoiceBox.setText(choiceBox.getValue().toString());
    }

    //This will update the labe when the combobox changes
    public void comboBoxChange() {
        lblComboBox.setText("Course selected: \n" + myComboBox.getValue().toString());

    }

    //This will update the radioButton for the radio Button
    public void radioButtonChanged() {
        if (this.favLangToggleGroup.getSelectedToggle().equals(this.phpRadioButton)) {
            lblradioButton.setText("The selected item is: PHP");
        }
        if (this.favLangToggleGroup.getSelectedToggle().equals(this.javaRadioButton)) {
            lblradioButton.setText("The selected item is: JAVA");
        }

        if (this.favLangToggleGroup.getSelectedToggle().equals(this.c1RadioButton)) {
            lblradioButton.setText("The selected item is: C#");
        }
        if (this.favLangToggleGroup.getSelectedToggle().equals(this.c2RadioButton)) {
            lblradioButton.setText("The selected item is: C++");
        }

    }

    public String listOfItems() {
        ArrayList<String> myList = new ArrayList();
        myList.add("apples");
        myList.add("bananas");
        myList.add("oranges");
        return myList.toString();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblPizzaOrder.setText("");

        //These items are for configuring the choicebox example
        lblChoiceBox.setText("");

        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges", "pears");
        choiceBox.setValue("bananas");

        //These items are for configuring the comboBox example
        myComboBox.getItems().add("COMP101");
        myComboBox.getItems().addAll("COMP102", "COMP103", "COMP104", "COMP105");
        lblComboBox.setText("");

        //These items are for configuring the radio Buttons example
        lblradioButton.setText("");
        favLangToggleGroup = new ToggleGroup();
        this.c1RadioButton.setToggleGroup(favLangToggleGroup);
        this.c2RadioButton.setToggleGroup(favLangToggleGroup);
        this.phpRadioButton.setToggleGroup(favLangToggleGroup);
        this.javaRadioButton.setToggleGroup(favLangToggleGroup);

    }

}
