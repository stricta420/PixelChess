module com.example.chess_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chess_project to javafx.fxml;
    exports com.example.chess_project;
}