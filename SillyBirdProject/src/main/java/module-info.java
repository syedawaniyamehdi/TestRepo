module edu.augustana.sillybirdproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.augustana.sillybirdproject to javafx.fxml;
    exports edu.augustana.sillybirdproject;
}