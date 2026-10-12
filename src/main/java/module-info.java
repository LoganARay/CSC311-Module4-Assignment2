module edu.farmingdale.csc311module4assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires exp4j;


    opens edu.farmingdale.csc311module4assignment2 to javafx.fxml;
    exports edu.farmingdale.csc311module4assignment2;
}