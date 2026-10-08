module com.example.exemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemplojavafx to javafx.fxml;
    exports com.example.exemplojavafx;
}