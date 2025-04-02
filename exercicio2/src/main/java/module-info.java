module org.example.exercicio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.exercicio2 to javafx.fxml;
    exports org.example.exercicio2;
}