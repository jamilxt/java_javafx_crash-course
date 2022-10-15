module com.jamilxt.javafx1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.jamilxt.javafx1 to javafx.fxml;
    exports com.jamilxt.javafx1;
}