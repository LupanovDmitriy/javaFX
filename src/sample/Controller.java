package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public Button btSend;

    public void click(ActionEvent actionEvent) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        textArea.appendText(dateFormat.format(date)+" "+textField.getText()+"\n");
        textField.clear();
    }
}
