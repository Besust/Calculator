package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private BigDecimal left;
    private String selectedOperator;
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

        if(buttonText.equals("=")) {
            final BigDecimal right = numberInputting ? new BigDecimal(textField.getText()) : left;

            left = calculate(selectedOperator, left, right);
            textField.setText(left.toString());
            numberInputting = false;
            return;
        }
    }

        public static BigDecimal calculate(String operator, BigDecimal left, BigDecimal right) {
        switch(operator) {
            case "+":
                return left.add(right);
            case "-":
                return left.subtract(right);
            case "*":
                return left.multiply(right);
            case "/":
                return left.divide(right);

        }
        return right;

    }

}
