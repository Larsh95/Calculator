/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Captain
 */
public class CalculatorViewController implements Initializable {

    @FXML
    private TextField txtField;
    float valueOne;
    String operation;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void digitClickedHandler(ActionEvent event) {
     
        Button clickedButton = (Button) event.getTarget();
        String buttonLabel = clickedButton.getText();
        txtField.setText(buttonLabel);
        
    }
    public void operationClickHandler(ActionEvent event) {
        Button clickOperation = (Button) event.getTarget();
        String operationBtn = clickOperation.getText();
        
        if(!operationBtn.equals("=")){
        valueOne = Float.parseFloat(txtField.getText());
        txtField.clear();
        operation = operationBtn;
        }
            if(operationBtn.equals("=")){
            
            switch (operation){
            case "+":
                float plus = valueOne + Float.parseFloat(txtField.getText());
                txtField.setText(String.valueOf(plus));
                valueOne = plus;
                break;
            case "-":
                float minus = valueOne - Float.parseFloat(txtField.getText());
                txtField.setText(String.valueOf(minus));
                valueOne = minus;
                break;
            case "/":
                float div = valueOne / Float.parseFloat(txtField.getText());
                txtField.setText(String.valueOf(div));
                valueOne = div;
                break;
            case "X":
                float gan = valueOne * Float.parseFloat(txtField.getText());
                txtField.setText(String.valueOf(gan));
                valueOne = gan;
                break;
            case "C":
                valueOne = 0;
                txtField.clear();
                break;
                
        }
        }
           
    }
}
