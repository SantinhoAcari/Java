module santinho.exercicio3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens santinho.exercicio3 to javafx.fxml;
    exports santinho.exercicio3;
}