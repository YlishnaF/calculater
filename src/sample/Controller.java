package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField output;
    public String oper = "";
    public long num1 = 0;
    public boolean start = true;
    public Logic logic = new Logic();
    @FXML
    public void numbers(ActionEvent actionEvent) {
        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button)actionEvent.getSource()).getText();
        output.setText(output.getText()+value);
    }
    @FXML
    public void operator(ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getSource()).getText();
        if(!"=".equals(value)){
            if(!oper.isEmpty())
                return;
            oper = value;
            num1 = Long.parseLong(output.getText());
            output.setText("");
        }
        else {
            if (oper.isEmpty())
                return;
            output.setText(String.valueOf(logic.calculate(num1, Long.parseLong(output.getText()), oper )));
            oper = "";
            start  = true;
        }
    }
}
