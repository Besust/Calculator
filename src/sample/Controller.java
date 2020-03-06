package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private BigDecimal left;
    private String selectedOperator;
    weqweqwe
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
        Button button = (Button) evt.getSource();
        String buttonText = button.getText();

        if (buttonText.equals("C")) {
            if (buttonText.equals("C")) {
                left = BigDecimal.ZERO;
            }

            selectedOperator = " ";
            numberInputting = true;
            textField.clear();
            return;
        }

        if (buttonText.matches("[0-9\\,1]")) {
            if (!numberInputting) {
                numberInputting = true;
                textField.clear();
            }

            textField.appendText(buttonText);
            return;
        }

        if (buttonText.matches("+-*/")) {
            left = new BigDecimal(textField.getText());
            selectedOperator = buttonText;
            numberInputting = false;
            return;
        }

        

    }

}
