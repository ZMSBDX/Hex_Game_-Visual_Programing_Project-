module test.homework.fxml.javafx_fxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens test.homework.fxml.javafx_fxml to javafx.fxml;
    exports test.homework.fxml.javafx_fxml;
}