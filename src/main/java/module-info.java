module com.example.hayat {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.hayat to javafx.fxml;
    exports com.example.hayat;
}