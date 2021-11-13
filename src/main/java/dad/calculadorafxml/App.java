package dad.calculadorafxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private CalculadoraController calculadoraController;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //calculadoraController = new CalculadoraController();
        //Scene scene = new Scene(calculadoraController.getRoot());
        stage.setTitle("CalculadoraFXML");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}