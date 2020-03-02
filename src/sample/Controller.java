package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.text.*;

public class Controller {

    private BigDecimal left;
    private String selectedOperator;weqweqwe
    private boolean numberInputting;

    @FXML
    private TextField textField;
    public Controller() {
        this.left = BigDecimal.ZERO;
        this.selectedOperator = " ";
        this.numberInputting = false;

    }



    @FXML
    public void operateButton(ActionEvent evt) {
        Button button = (Button)evt.getSource();
        String buttonText = button.getText();


    }

}
