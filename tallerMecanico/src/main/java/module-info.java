module edu.utj.evnd.poo.tallermecanico {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    // Permite a JavaFX acceder a tu controlador y a tus modelos
    opens edu.utj.evnd.poo.tallermecanico to javafx.fxml;
    opens edu.utj.evnd.poo.tallermecanico.model to javafx.base, javafx.fxml;

    exports edu.utj.evnd.poo.tallermecanico;
    exports edu.utj.evnd.poo.tallermecanico.model;
}