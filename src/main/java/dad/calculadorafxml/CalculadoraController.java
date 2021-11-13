package dad.calculadorafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable {
    private GridPane root;
    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnBorrarTodo;

    @FXML
    private Button btnComa;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btnResta;

    @FXML
    private Button btnSuma;

    @FXML
    private TextField textOperacion;

    Calculadora calculadora = new Calculadora();

    @FXML
    void onActionBtn0(ActionEvent event) {
        calculadora.insertar('0');
    }

    @FXML
    void onActionBtn1(ActionEvent event) {
        calculadora.insertar('1');
    }

    @FXML
    void onActionBtn2(ActionEvent event) {
        calculadora.insertar('2');
    }

    @FXML
    void onActionBtn3(ActionEvent event) {
        calculadora.insertar('3');
    }

    @FXML
    void onActionBtn4(ActionEvent event) {
        calculadora.insertar('4');
    }

    @FXML
    void onActionBtn5(ActionEvent event) {
        calculadora.insertar('5');
    }

    @FXML
    void onActionBtn6(ActionEvent event) {
        calculadora.insertar('6');

    }

    @FXML
    void onActionBtn7(ActionEvent event) {
        calculadora.insertar('7');

    }

    @FXML
    void onActionBtn8(ActionEvent event) {
        calculadora.insertar('8');

    }

    @FXML
    void onActionBtn9(ActionEvent event) {
        calculadora.insertar('9');
    }

    @FXML
    void onActionBtnC(ActionEvent event) {
        calculadora.borrar();
    }

    @FXML
    void onActionBtnCE(ActionEvent event) {
        calculadora.borrarTodo();
    }

    @FXML
    void onActionBtnComa(ActionEvent event) {
        calculadora.insertarComa();
    }

    @FXML
    void onActionBtnDiv(ActionEvent event) {
        calculadora.operar(Calculadora.DIVIDIR);
    }

    @FXML
    void onActionBtnIgual(ActionEvent event) {
        calculadora.operar(Calculadora.IGUAL);
    }

    @FXML
    void onActionBtnMulti(ActionEvent event) {
        calculadora.operar(Calculadora.MULTIPLICAR);
    }

    @FXML
    void onActionBtnResta(ActionEvent event) {
        calculadora.operar(Calculadora.RESTAR);
    }

    @FXML
    void onActionBtnSumar(ActionEvent event) {
        calculadora.operar(Calculadora.SUMAR);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textOperacion.textProperty().bind(calculadora.getResult());
    }
}
