module com.lielion.javabaejeu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lielion.javabaejeu to javafx.fxml;
    exports com.lielion.javabaejeu;
}