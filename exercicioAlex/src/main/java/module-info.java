module org.example.exercicioalex {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.exercicioalex to javafx.fxml;
    exports org.example.exercicioalex;
}