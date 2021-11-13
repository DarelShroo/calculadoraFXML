module dad.calculadorafxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens dad.calculadorafxml to javafx.fxml;
    exports dad.calculadorafxml;
}