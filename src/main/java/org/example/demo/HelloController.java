package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField display;
    @FXML
    private Button clearButton, plusMinusButton, percButton, devButton, sevButton, eightButton, nineButton,
            multButton, fourButton, fiveButton, sixButton, minusButton, oneButton, twoButton, threeButton,
            plusButton, zeroButton, comButton, equalButton;

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    @FXML
    public void initialize() {
        setupNumberButton(zeroButton, "0");
        setupNumberButton(oneButton, "1");
        setupNumberButton(twoButton, "2");
        setupNumberButton(threeButton, "3");
        setupNumberButton(fourButton, "4");
        setupNumberButton(fiveButton, "5");
        setupNumberButton(sixButton, "6");
        setupNumberButton(sevButton, "7");
        setupNumberButton(eightButton, "8");
        setupNumberButton(nineButton, "9");

        setupOperatorButton(plusButton, "+");
        setupOperatorButton(minusButton, "-");
        setupOperatorButton(multButton, "*");
        setupOperatorButton(devButton, "/");

        plusMinusButton.setOnAction(event -> changeSign());
        percButton.setOnAction(event -> calculatePercentage());
        comButton.setOnAction(event -> appendToDisplay("."));
        clearButton.setOnAction(event -> clearDisplay());
        equalButton.setOnAction(event -> calculateResult());
    }
    private void setupNumberButton(Button button, String value) {
        button.setOnAction(event -> appendToDisplay(value));
    }
    private void setupOperatorButton(Button button, String op) {
        button.setOnAction(event -> setOperator(op));
    }
    private void appendToDisplay(String value) {
        if (startNewNumber) {
            display.setText(value);
            startNewNumber = false;
        } else {
            display.setText(display.getText() + value);
        }
    }
    @FXML
    private void clearDisplay() {
        display.clear();
        firstNumber = 0;
        secondNumber = 0;
        operator = "";
        startNewNumber = true;
    }
    private void setOperator(String op) {
        firstNumber = Double.parseDouble(display.getText());
        operator = op;
        startNewNumber = true;
    }
    @FXML
    private void changeSign() {
        double currentValue = Double.parseDouble(display.getText());
        display.setText(String.valueOf(-currentValue));
    }
    @FXML
    private void calculatePercentage() {
        double currentValue = Double.parseDouble(display.getText());
        display.setText(String.valueOf(currentValue / 100));
        startNewNumber = true;
    }
    @FXML
    private void calculateResult() {
        secondNumber = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    display.setText("Error");
                    return;
                }
                break;
            default:
                return;
        }

        display.setText(String.valueOf(result));
        operator = "";
        startNewNumber = true;
    }

    public void setOperator(ActionEvent actionEvent) {
    }

    public void appendToDisplay(ActionEvent actionEvent) {
    }
}
