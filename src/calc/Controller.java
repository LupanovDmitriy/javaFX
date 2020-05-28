package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    public Button btPlus;
    public Button btMinus;
    public Button btMul;
    public Button btDiv;
    public Button btRez;
    public TextField textField;
    public TextArea textArea;
    private String operation;
    private int a;
    private int b;

    public void Plus(ActionEvent actionEvent) {
        a= Integer.parseInt(textField.getText());
        operation="+";
        textField.clear();
    }

    public void Minus(ActionEvent actionEvent) {
        a= Integer.parseInt(textField.getText());
        operation="-";
        textField.clear();
    }

    public void Mul(ActionEvent actionEvent) {
        a= Integer.parseInt(textField.getText());
        operation="*";
        textField.clear();
    }

    public void Div(ActionEvent actionEvent) {
        a= Integer.parseInt(textField.getText());
        operation="/";
        textField.clear();
    }

    public void Rez(ActionEvent actionEvent) {
        b= Integer.parseInt(textField.getText());
        if (operation.equals("+")){
            textArea.appendText(a+"+"+b+"="+(a+b)+"\n");
        }
        if (operation.equals("-")){
            textArea.appendText(a+"-"+b+"="+(a-b)+"\n");
        }
        if (operation.equals("*")){
            textArea.appendText(a+"*"+b+"="+(a*b)+"\n");
        }
        if (operation.equals("/")){
            textArea.appendText(a+"/"+b+"="+(a/b)+"\n");
        }
        operation="";
        textField.clear();
    }
}
