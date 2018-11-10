package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label labelAnswer;
    @FXML
    private Button buttonAnswer;

    private int number1 = 0;
    private int number2 = 0;
    private int number3 = 0;
    private int count = 3;

    public void checkNumber() {
        button1.setOnAction(event -> {
            number1++;
            label1.setText(Integer.toString(number1));
        });

        button2.setOnAction(event -> {
            number2++;
            label2.setText(Integer.toString(number2));
        });
        button3.setOnAction(event -> {
            number3++;
            label3.setText(Integer.toString(number3));
        });

    }


    public void initialize() {
        checkNumber();

    }
}
