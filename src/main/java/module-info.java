module dk.easv.bll {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv to javafx.fxml;
    exports dk.easv;
    exports dk.easv.gui;
    opens dk.easv.gui to javafx.fxml;
}