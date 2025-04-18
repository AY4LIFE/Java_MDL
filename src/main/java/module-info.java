module com.example.mdl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mdl to javafx.fxml;
    exports com.example.mdl;
}