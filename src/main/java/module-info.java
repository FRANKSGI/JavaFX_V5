module com.example.maven_vorlesung5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maven_vorlesung5 to javafx.fxml;
    exports com.example.maven_vorlesung5;
}
