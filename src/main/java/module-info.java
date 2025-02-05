module dev.e2ps2025 {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.e2ps2025 to javafx.fxml;
    exports dev.e2ps2025;
}
