module com.example.systemproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.systemproject to javafx.fxml;
    exports com.example.systemproject;
}