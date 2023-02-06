module eus.ehu.gitexercice {
    requires javafx.controls;
    requires javafx.fxml;


    opens eus.ehu.gitexercice to javafx.fxml;
    exports eus.ehu.gitexercice;
}