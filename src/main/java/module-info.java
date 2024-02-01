module com.example.hayat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires commons.math3;
    requires java.desktop;
    requires java.xml.bind;
    requires java.prefs;

    opens com.example.hayat to javafx.fxml;
    exports com.example.hayat;
}