module sisu {
    requires javafx.controls;
    requires javafx.fxml;

    opens sisu to javafx.fxml;
    exports sisu;
}
