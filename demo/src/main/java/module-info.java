module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    //requires rt;


    opens view to javafx.fxml;
    exports view;
    exports test;
    opens test to javafx.fxml;
}