module com.example.practikf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practikf to javafx.fxml;
    exports com.example.practikf;
}