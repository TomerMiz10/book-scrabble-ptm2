module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens view to javafx.fxml;
    exports view;
    exports test;
    opens test to javafx.fxml;
}