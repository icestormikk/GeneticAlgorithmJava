module org.icestormikk.geneticalgorithmjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.icestormikk.geneticalgorithmjava to javafx.fxml;
    exports org.icestormikk.geneticalgorithmjava;
}