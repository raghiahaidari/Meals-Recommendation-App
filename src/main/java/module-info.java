module com.example.meals {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.meals to javafx.fxml;
    exports com.example.meals;
}