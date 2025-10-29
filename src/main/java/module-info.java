module dk.easv.wordsearch {
    requires javafx.controls;
    requires javafx.fxml;

    opens dk.easv.gui to javafx.fxml;
    exports dk.easv.gui;
}