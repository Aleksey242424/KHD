module com.example.mp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mp to javafx.fxml;
    exports com.example.mp;
}